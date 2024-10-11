
package Director;

import Interfaz.DashboardBueno;
import classes.Almacen;
import classes.PM;
import classes.Distribuidora;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Director extends Thread{
    private int deadline;
    private float sueldo;
    private float sueldoPorHora;
    private String estado;
    private int computadorasParaEntrega;
    private int computadorasParaEntregaGrafica;
    private int dayDuration;
    private Almacen almacen;
    private Distribuidora distribuidora;
    private String company;
    private PM projectManager;
    private int contadorHoras;
    private int horaElegida;
    
    public Director (int sueldoPorHora, int dayDuration, Almacen almacen, PM projectManager, Distribuidora distribuidora, String company,int deadline){
        this.sueldoPorHora=sueldoPorHora;
        this.dayDuration=dayDuration;
        this.almacen= almacen;
        this.projectManager=projectManager;
        this.distribuidora=distribuidora;
        this.company=company;
        this.deadline=deadline;
        this.contadorHoras = 0;
        int horaElegida = 0;
    }
    
        @Override
    public void run() {
        
        while(true) {
            Random random = new Random();
            this.horaElegida=random.nextInt(24);
            try {
                for (int i = 0; i < 24; i++) {
                    /*
                    System.out.println("Hora del dia: " + this.contadorHoras);
                    System.out.println("Hora random elegida: " + this.horaElegida);
                    System.out.println("estado director: " + this.estado);
                    */
                    Work();
                    this.setContadorHoras(this.getContadorHoras() + 1);
                    sleep(getDayDuration()/24);
                }
                this.setContadorHoras(0);

                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        if(this.getProjectManager().getDaysUntilDeadline()>=1){
            this.setEstado("Labores administrativas");
            if (this.getContadorHoras() == this.getHoraElegida()) {
                this.supervisarPm();
            }
            
        }else if (this.getProjectManager().getDaysUntilDeadline()==0){
            this.setEstado("Entregando Computadoras");
            this.entregarComputadoras();
            this.getProjectManager().setDaysUntilDeadline(this.getDeadline());
        }
        this.setSueldo(this.getSueldo() + this.getSueldoPorHora() * 24);
        this.setDashboard();
    }
    public void setDashboard(){
        if(this.company.equals("Apple")){
            DashboardBueno.getEstadoPmN().setText(this.estado);
        }else{
           DashboardBueno.getEstadoDirectorS().setText(this.estado);
        }
    }
    
    public void entregarComputadoras(){
        this.setComputadorasParaEntrega(this.getAlmacen().getComputadoras());
        this.setComputadorasParaEntregaGrafica(this.getAlmacen().getComputadoraConGrafica());
        this.getDistribuidora().recibirComputadoras(this.getComputadorasParaEntrega(), this.getComputadorasParaEntregaGrafica(), this.getCompany());
        this.getAlmacen().setComputadoras(this.getAlmacen().getComputadoras()-this.getComputadorasParaEntrega());
        this.getAlmacen().setComputadoraConGrafica(this.getAlmacen().getComputadoraConGrafica()-this.getComputadorasParaEntregaGrafica());
        this.setComputadorasParaEntrega(0);
        this.setComputadorasParaEntregaGrafica(0);
    }
    
    public void supervisarPm(){
        try {
            if (this.getProjectManager().getEstado().equals("Viendo ONE PIECE")){
                this.getProjectManager().setFaltas(this.getProjectManager().getFaltas()+1);
                this.getProjectManager().setDineroDescontado(this.getProjectManager().getDineroDescontado()+50);
                this.getProjectManager().setSueldo(this.getProjectManager().getSueldo()-50);
                System.out.println("Cachao");
            }else{
                System.out.println("nada");
            }
            sleep(getDayDuration() * 25/1440); // Se usa esa fraccion para llevar los 25 minutos segun dayDuration
        
        } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
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

    /**
     * @return the sueldoPorHora
     */
    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    /**
     * @param sueldoPorHora the sueldoPorHora to set
     */
    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the computadorasParaEntrega
     */
    public int getComputadorasParaEntrega() {
        return computadorasParaEntrega;
    }

    /**
     * @param computadorasParaEntrega the computadorasParaEntrega to set
     */
    public void setComputadorasParaEntrega(int computadorasParaEntrega) {
        this.computadorasParaEntrega = computadorasParaEntrega;
    }

    /**
     * @return the computadorasParaEntregaGrafica
     */
    public int getComputadorasParaEntregaGrafica() {
        return computadorasParaEntregaGrafica;
    }

    /**
     * @param computadorasParaEntregaGrafica the computadorasParaEntregaGrafica to set
     */
    public void setComputadorasParaEntregaGrafica(int computadorasParaEntregaGrafica) {
        this.computadorasParaEntregaGrafica = computadorasParaEntregaGrafica;
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
     * @return the distribuidora
     */
    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    /**
     * @param distribuidora the distribuidora to set
     */
    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
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
     * @return the projectManager
     */
    public PM getProjectManager() {
        return projectManager;
    }

    /**
     * @param projectManager the projectManager to set
     */
    public void setProjectManager(PM projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * @return the contadorHoras
     */
    public int getContadorHoras() {
        return contadorHoras;
    }

    /**
     * @param contadorHoras the contadorHoras to set
     */
    public void setContadorHoras(int contadorHoras) {
        this.contadorHoras = contadorHoras;
    }

    /**
     * @return the horaElegida
     */
    public int getHoraElegida() {
        return horaElegida;
    }

    /**
     * @param horaElegida the horaElegida to set
     */
    public void setHoraElegida(int horaElegida) {
        this.horaElegida = horaElegida;
    }
}
