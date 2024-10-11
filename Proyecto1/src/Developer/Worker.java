
package Developer;

import Interfaz.DashboardBueno;
import classes.Almacen;
import static java.lang.Thread.sleep;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Worker extends Thread {
    private String company;
    private int type;
    private float sueldo=0;
    private int sueldoPorHora;
    private float productionPerDay;
    private int dayDuration;
    private float acc = 0;
    private Almacen almacen;
    private Semaphore mutex;
    private int placasParaComputadora;
    private int cpusParaComputadora;
    private int ramParaComputadoras;
    private int fuentesParaComputadora;
    private int graficasParaComputadora;
    int contParaGrafica;
    int contComputadorasGrafica=0;
    
    //La produccion por dia la calcula una funcion de trabajador. Asi que estos son los unicos parametros de inicializacion. 
    public Worker (String company,int type,int dayDuration, Almacen drive, Semaphore m, int sueldoPH){

        this.company = company;
        this.type = type;
        this.dayDuration = dayDuration;
        this.almacen = drive;
        this.mutex = m;
        this.sueldoPorHora=sueldoPH;
        //Apple
        if (getCompany().compareTo("Apple") == 0) {
            this.placasParaComputadora = 2;
            this.cpusParaComputadora = 1;
            this.ramParaComputadoras = 4;
            this.fuentesParaComputadora = 4;
            this.graficasParaComputadora=2;
            this.contParaGrafica=5;
        //MSI
        } else {
            this.placasParaComputadora = 2;
            this.cpusParaComputadora = 3;
            this.ramParaComputadoras = 4;
            this.fuentesParaComputadora = 6;
            this.graficasParaComputadora=5;
            this.contParaGrafica=6;
        }
    }
    
    @Override
    public void run() {
       int cont=0;
        while(true) {
            try {
                System.out.println("Dias "+cont);
                System.out.println("Computadoras:" + this.getAlmacen().getComputadoras());
                System.out.println("Computadoras con grafica :" + this.getAlmacen().getComputadoraConGrafica());
                work();
//                cobrar();
                sleep(getDayDuration());
                this.setInter();
                this.setDashboard();
                this.setDashboardCo();
                cont+=1;
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void work(){
        
        this.calcPpd();
        if (this.getType() == 5 && (getAlmacen().getPlacaBase() >= this.placasParaComputadora && getAlmacen().getCpu() >= this.cpusParaComputadora && getAlmacen().getRam() >= this.ramParaComputadoras && getAlmacen().getFuentes() >= this.fuentesParaComputadora)) {
            if(contComputadorasGrafica==this.contParaGrafica && this.getAlmacen().getTarjetaGrafica()>=this.graficasParaComputadora){
                this.setAcc(this.getAcc() + this.getProductionPerDay());
                if (this.getAcc() >= 1){
                    try {
                         // sección critica
                         this.getMutex().acquire(1);
                         this.getAlmacen().addProduct(1, getType(),true);
                         this.setAcc(0);
                         this.getAlmacen().setPlacaBase(getAlmacen().getPlacaBase() - this.placasParaComputadora);
                         this.getAlmacen().setCpu(getAlmacen().getCpu() - this.cpusParaComputadora);
                         this.getAlmacen().setRam(getAlmacen().getRam() - this.ramParaComputadoras);
                         this.getAlmacen().setFuentes(getAlmacen().getFuentes() - this.fuentesParaComputadora);
                         this.getAlmacen().setTarjetaGrafica(this.getAlmacen().getTarjetaGrafica()-this.graficasParaComputadora);
                         this.getMutex().release();
                         contComputadorasGrafica=0;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }else{
                
                this.setAcc(this.getAcc() + this.getProductionPerDay());
                if (this.getAcc() >= 1){
                    try {
                         // sección critica
                         this.getMutex().acquire(1);
                         this.getAlmacen().addProduct(1, getType(), false);
                         this.setAcc(0);
                         this.getAlmacen().setPlacaBase(getAlmacen().getPlacaBase() - this.placasParaComputadora);
                         this.getAlmacen().setCpu(getAlmacen().getCpu() - this.cpusParaComputadora);
                         this.getAlmacen().setRam(getAlmacen().getRam() - this.ramParaComputadoras);
                         this.getAlmacen().setFuentes(getAlmacen().getFuentes() - this.fuentesParaComputadora);
                         this.getMutex().release();
                         contComputadorasGrafica+=1;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }
        }
        //Aqui se calcula la produccion diaria dependiendo del tipo de trabajador y su insercion al almacen 
       
        this.setAcc(this.getAcc() + this.getProductionPerDay());
        if (this.getAcc() >= 1 && this.getType() != 5){

            try {
                 // sección critica
                 this.getMutex().acquire(1);
                 if(this.getAcc()>=5){
                     if(!this.almacen.returnDrive(this.getType())){
                        this.getAlmacen().addProduct(5, getType(),false);
                        if(this.getAlmacen().getFuentes()>=35){
                            this.getAlmacen().setFuentes(35);
                        }
                     }else {
                         System.out.println("Almacen lleno");
                     }
                         
                 }else{
                     if(!this.almacen.returnDrive(this.getType())){
                        this.getAlmacen().addProduct(1, getType(), false);
                     }else{
                         System.out.println("Almacen lleno");
                     }
                 }
                 this.setAcc(0);
                 this.getMutex().release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
       this.setSueldo(this.getSueldo() + 24*this.sueldoPorHora); 
           
            
    }
    public void setDashboardCo(){
        int costo;
        costo= Integer.parseInt(DashboardBueno.getCostosOpeN().getText());
        costo+=24*this.sueldoPorHora;
        String ingresar;
        ingresar= Integer.toString(costo);
        
        if(this.company.equals("Apple")){
            DashboardBueno.getCostosOpeN().setText(ingresar);
        }else{
           DashboardBueno.getCostosOpeS().setText(ingresar);
        }
        
    }
    //Funcion para calcular la PPd
    public void calcPpd(){
        float aux;
        switch (getType()) {
            case 0:
                aux=(float) 1/4;
                this.setProductionPerDay(aux);
                break;
            case 1:
                aux=(float)1/4;
                this.setProductionPerDay(aux);
                break;
            case 2:
                aux=1;
                this.setProductionPerDay(aux);
                break;
            case 3:
                aux=5;
                this.setProductionPerDay(aux);
                break;
            case 4:
                aux=(float)1/2;
                this.setProductionPerDay(aux);
                break;
            case 5:
                aux=(float)1/2;
                this.setProductionPerDay(aux);
                break;
            default:
                break;
        }
    }

//    public void cobrar() throws InterruptedException{
//        Timer timer = new Timer(true);
//        TimerTask task = new Cobrar(this.sueldo, sueldoPorHora);
//        long hora= (long) dayDuration/24;
//        timer.scheduleAtFixedRate(task, hora, hora);
//    }
    
    
    public void setInter(){
        
        if(this.getCompany().equals("Apple")){
            switch (getType()) {
                case 0:
                    DashboardBueno.getCantGuionesN6().setText(Integer.toString(almacen.getPlacaBase()));
                    break;
                case 1:
                    DashboardBueno.getCantNivelesN().setText(Integer.toString(almacen.getCpu()));
                    break;
                case 2:
                    DashboardBueno.getCantSpritesN().setText(Integer.toString(almacen.getRam()));
                    break;
                case 3:
                    DashboardBueno.getCantSistemasN().setText(Integer.toString(almacen.getFuentes()));
                    break;
                case 4:
                    DashboardBueno.getCantDlcN().setText(Integer.toString(almacen.getTarjetaGrafica()));
                    break;
                default:
                    break;
            }   
        }else{
            
            switch (getType()) {
                case 0:
                    DashboardBueno.getCantGuionesS().setText(Integer.toString(almacen.getPlacaBase()));
                    break;
                case 1:
                    DashboardBueno.getCantNivelesS().setText(Integer.toString(almacen.getCpu()));
                    break;
                case 2:
                    DashboardBueno.getCantSpritesS().setText(Integer.toString(almacen.getRam()));
                    break;
                case 3:
                    DashboardBueno.getCantSistemasS().setText(Integer.toString(almacen.getFuentes()));
                    break;
                case 4:
                    DashboardBueno.getCantDlcS().setText(Integer.toString(almacen.getTarjetaGrafica()));
                    break;
                default:
                    break;
            }
        }
    }
    
    public void setDashboard(){
    if(this.company.equals("Apple")){
            DashboardBueno.getReadyToShipDLC().setText(Integer.toString(almacen.getComputadoraConGrafica()));
            DashboardBueno.getReadyToShip1().setText(Integer.toString(almacen.getComputadoras()));
        }else{
           DashboardBueno.getReadyToShipDLCSq().setText(Integer.toString(almacen.getComputadoraConGrafica()));
            DashboardBueno.getReadyToShipSq().setText(Integer.toString(almacen.getComputadoras()));
        }
}
    
    
    
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the productionPerDay
     */
    public float getProductionPerDay() {
        return productionPerDay;
    }

    /**
     * @param productionPerDay the productionPerDay to set
     */
    public void setProductionPerDay(float productionPerDay) {
        this.productionPerDay = productionPerDay;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the acc
     */
    public float getAcc() {
        return acc;
    }

    /**
     * @param acc the acc to set
     */
    public void setAcc(float acc) {
        this.acc = acc;
    }

    /**
     * @return the almacen
     */
    public Almacen getAlmacen() {
        return almacen;
    }

    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the placasParaComputadora
     */
    public int getPlacasParaComputadora() {
        return placasParaComputadora;
    }

    /**
     * @param placasParaComputadora the placasParaComputadora to set
     */
    public void setPlacasParaComputadora(int placasParaComputadora) {
        this.placasParaComputadora = placasParaComputadora;
    }

    /**
     * @return the cpusParaComputadora
     */
    public int getCpusParaComputadora() {
        return cpusParaComputadora;
    }

    /**
     * @param cpusParaComputadora the cpusParaComputadora to set
     */
    public void setCpusParaComputadora(int cpusParaComputadora) {
        this.cpusParaComputadora = cpusParaComputadora;
    }

    /**
     * @return the ramParaComputadoras
     */
    public int getRamParaComputadoras() {
        return ramParaComputadoras;
    }

    /**
     * @param ramParaComputadoras the ramParaComputadoras to set
     */
    public void setRamParaComputadoras(int ramParaComputadoras) {
        this.ramParaComputadoras = ramParaComputadoras;
    }

    /**
     * @return the fuentesParaComputadora
     */
    public int getFuentesParaComputadora() {
        return fuentesParaComputadora;
    }

    /**
     * @param fuentesParaComputadora the fuentesParaComputadora to set
     */
    public void setFuentesParaComputadora(int fuentesParaComputadora) {
        this.fuentesParaComputadora = fuentesParaComputadora;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
