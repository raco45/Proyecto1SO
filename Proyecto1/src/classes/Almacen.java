
package classes;

public class Almacen {
    private int placaBase=0;
    private int cpu=0;
    private int ram=0;
    private int fuentes=0;
    private int tarjetaGrafica=0;
    private int computadoras=0;
    private int computadoraConGrafica=0;
    private String empresa;
    private int maxPlacaBase;
    private int maxCpu;
    private int maxRam;
    private int maxFuentes;
    private int maxGraficas;
    private int contParaGrafica;
    int cont=0;
    
    public Almacen(int cpu, int placaBase, int ram, int fuentes, int graficas, String empresa) {
        this.maxPlacaBase = placaBase;
        this.maxCpu = cpu;
        this.maxRam = ram;
        this.maxFuentes = fuentes;
        this.maxGraficas = graficas;
        this.computadoras = 0;
        this.empresa=empresa;
        
     
    }

//    Almacen(int i, int i0, int i1, int i2, int i3) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    
    public void addProduct(int productQty, int type, boolean esDlc){
        switch (type) {
            case 0:
                setPlacaBase(this.getPlacaBase() + productQty);
                break;
            case 1:
                setCpu(this.getCpu() + productQty);
                break;
            case 2:
                setRam(this.getRam() + productQty);
                break;
            case 3:
                setFuentes(this.getFuentes() + productQty);
                break;
            case 4:
                setTarjetaGrafica(this.getTarjetaGrafica() + productQty);
                break;
            case 5:
                // if computadoras>=4...  comparo hacer en una funcion aparte
                if(esDlc==true){
                    this.setComputadoraConGrafica(this.getComputadoraConGrafica()+productQty);
                    
                }else{
                    setComputadoras(this.getComputadoras() + productQty);
                    
                }
                break;
            default:
                break;
        }
    }
    public boolean returnDrive(int type){
        switch (type) {
            case 0:
                if (this.getPlacaBase()>=25){
                    return true;
                }else {
                    return false;
                }
            case 1:
                if(this.getCpu()>=20){
                    return true;
                }else{
                    return false;
                }
            case 2:
                if(this.getRam()>=20){
                    return true;
                }else{
                    return false;
                }
            case 3:
                if(this.getFuentes()>=35){
                    return true;
                }else{
                    return false;
                }
            case 4:
                if(this.getTarjetaGrafica()>=10){
                    return true;
                }else{
                    return false;
                }
            default:
                return false;
        }
    }
    public int returnCantDrive(int type){
        switch (type) {
            case 0:
                return this.getPlacaBase();
                
            case 1:
                return this.getCpu();
                
            case 2:
                return this.getRam();
                
            case 3:
                return this.getFuentes();
                
            case 4:
                return this.getTarjetaGrafica();
                
            default:
                return 0;
        }
    }
    
    /**
     * @return the placaBase
     */
    public int getPlacaBase() {
        return placaBase;
    }

    /**
     * @param placaBase the placaBase to set
     */
    public void setPlacaBase(int placaBase) {
        this.placaBase = placaBase;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the fuentes
     */
    public int getFuentes() {
        return fuentes;
    }

    /**
     * @param fuentes the fuentes to set
     */
    public void setFuentes(int fuentes) {
        this.fuentes = fuentes;
    }

    /**
     * @return the tarjetaGrafica
     */
    public int getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    /**
     * @param tarjetaGrafica the tarjetaGrafica to set
     */
    public void setTarjetaGrafica(int tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * @return the computadoras
     */
    public int getComputadoras() {
        return computadoras;
    }

    /**
     * @param computadoras the computadoras to set
     */
    public void setComputadoras(int computadoras) {
        this.computadoras = computadoras;
    }

    /**
     * @return the computadoraConGrafica
     */
    public int getComputadoraConGrafica() {
        return computadoraConGrafica;
    }

    /**
     * @param computadoraConGrafica the computadoraConGrafica to set
     */
    public void setComputadoraConGrafica(int computadoraConGrafica) {
        this.computadoraConGrafica = computadoraConGrafica;
    }
}
