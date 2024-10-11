
package classes;

import Developer.Worker;
import Director.Director;

import java.util.concurrent.Semaphore;


public class Simulation {

    /**
     * @return the devsMutex
     */
    public Semaphore getDevsMutex() {
        return devsMutex;
    }

    /**
     * @param devsMutex the devsMutex to set
     */
    public void setDevsMutex(Semaphore devsMutex) {
        this.devsMutex = devsMutex;
    }

    /**
     * @return the integratorsMutex
     */
    public Semaphore getIntegratorsMutex() {
        return integratorsMutex;
    }

    /**
     * @param integratorsMutex the integratorsMutex to set
     */
    public void setIntegratorsMutex(Semaphore integratorsMutex) {
        this.integratorsMutex = integratorsMutex;
    }
    
    private int lastDigit;
    private int dayDuration;
    private int deadline;
    private int cantidadPlacasBaseWorkers;
    private int cantidadCpuWorkers;
    private int cantidadRamWorkers;
    private int cantidadFuentesWorkers;
    private int cantidadGraficasWorkers;
    private int cantidadEnsambladoresWorkers;
    
    private int entregadasSinGrafica;
    private int entregadasConGrafica;
    
    private int daysUntilDeadline;
    
    private String projectManagerStatus;
    private int projectManagerFaults;
    private int projectManagerDeductedMoney;
    
    private String directorStatus;
    
    private int dayCounter;
    
    private int computadorasTotales;
    private int totalesConGrafica; // con DLC a ser entregados
    private int totalesSinGrafica; // sin DLC a ser entregados
    
    private String companyName;
    private ListaSimple placasBaseWorkers = new ListaSimple();
    private ListaSimple cpuWorkers = new ListaSimple();
    private ListaSimple ramWorkers = new ListaSimple();
    private ListaSimple fuentesWorkers = new ListaSimple();
    private ListaSimple graficasWorkers = new ListaSimple();
    private ListaSimple ensambladores = new ListaSimple();
    private Almacen almacen;
    private int operativeCost = 0;
    private float profit = 0;
    private float income = 0;
    private Semaphore devsMutex = new Semaphore(1);
    private Semaphore integratorsMutex = new Semaphore(1);
    public Simulation(int lastDigit, int dayDuration, int deadline, int cantidadWorkersPlacaBase, int cantidadWorkersCPU, int cantidadWorkersRam, int cantidadWorkersFuentes, int cantidadWorkersGraficas, int cantidadEnsambladores, String companyName) {
        
        this.lastDigit = lastDigit;
        this.dayDuration = dayDuration;
        this.deadline = deadline;
        this.cantidadPlacasBaseWorkers = cantidadWorkersPlacaBase;
        this.cantidadCpuWorkers = cantidadWorkersCPU;
        this.cantidadRamWorkers = cantidadWorkersRam;
        this.cantidadFuentesWorkers = cantidadWorkersFuentes;
        this.cantidadGraficasWorkers = cantidadWorkersGraficas;
        this.cantidadEnsambladoresWorkers = cantidadEnsambladores;
        this.companyName = companyName;
        this.almacen=new Almacen(25, 20, 55, 35, 10, this.getCompanyName());
    }
    
    public void start() {
        
        
//        Almacen almacen = new Almacen(25, 20, 55, 35, 10, this.getCompanyName());
        Distribuidora shop = new Distribuidora();
        
        PM projectManager = new PM(40, this.getDeadline(), this.getDayDuration(), this.companyName);
        Director director = new Director(60, getDayDuration(), almacen, projectManager, shop, this.getCompanyName(), this.getDeadline());
        
        this.spawnWorkers(almacen, getDevsMutex(), getIntegratorsMutex());
        projectManager.start();
        director.start();
        this.calculateCost(projectManager);
        this.getIncome(shop);
        this.calculateProfit();
        
        this.setComputersData(shop);
        this.setDaysUntilDeadline(projectManager.getDaysUntilDeadline());
        this.setPmData(projectManager);
        this.setDirectorStatus(director.getEstado());
        this.setDayCounter(projectManager.getDiasSimulacion());
        this.setComputadorasEnAlmacenData(almacen);
    }
    
    public void spawnWorkers(Almacen almacen, Semaphore devsMutex, Semaphore integratorsMutex) {
        for (int i = 0; i < this.getCantidadPlacasBaseWorkers(); i++) {
            Worker worker = new Worker(this.getCompanyName(), 0, this.getDayDuration(), almacen, devsMutex, 20);
            worker.start();
            getPlacasBaseWorkers().agregarAlFinal(worker);
        }
        
        for (int i = 0; i < this.getCantidadCpuWorkers(); i++) {
            Worker worker= new Worker(this.getCompanyName(), 1, this.getDayDuration(), almacen, devsMutex, 26);
            worker.start();
            getCpuWorkers().agregarAlFinal(worker);
        }
        
        for (int i = 0; i < this.getCantidadRamWorkers(); i++) {
            Worker worker= new Worker(this.getCompanyName(), 2, this.getDayDuration(), almacen, devsMutex, 40);
            worker.start();
            getRamWorkers().agregarAlFinal(worker);
        }
        
        for (int i = 0; i < this.getCantidadFuentesWorkers(); i++) {
            Worker worker= new Worker(this.getCompanyName(), 3, this.getDayDuration(), almacen, devsMutex, 16);
            worker.start();
            getFuentesWorkers().agregarAlFinal(worker);
        }
        
        for (int i = 0; i < this.getCantidadGraficasWorkers(); i++) {
            Worker worker= new Worker(this.getCompanyName(), 4, this.getDayDuration(), almacen, devsMutex, 34);
            worker.start();
            getGraficasWorkers().agregarAlFinal(worker);
        }
        
        for (int i = 0; i < this.getCantidadEnsambladoresWorkers(); i++) {
            Worker integrator = new Worker(this.getCompanyName(), 5, this.getDayDuration(), almacen, integratorsMutex, 50);
            integrator.start();
            getEnsambladores().agregarAlFinal(integrator);
        }
        
    }
    
    public void calculateCost(PM projectManager) {
        this.setOperativeCost(24 * projectManager.getDiasSimulacion() * (20 * getPlacasBaseWorkers().getLongitud() + 26 * getCpuWorkers().getLongitud() + 40 * getRamWorkers().getLongitud() + 
                16 * this.getFuentesWorkers().getLongitud() + 34 * this.getGraficasWorkers().getLongitud() + 50 * this.getEnsambladores().getLongitud() + projectManager.getSueldoPorHora() + 60 ));
    }
    
    public void getIncome(Distribuidora shop) {
        this.setIncome(shop.getGananciaTotal());
    }
    
    public void calculateProfit() {
        this.setProfit(this.getIncome() - this.getOperativeCost());
    }
    
    public void setComputersData(Distribuidora shop) {
        this.setEntregadasSinGrafica(shop.getComputadoras());
        this.setEntregadasConGrafica(shop.getComputadorasConGrafica());
    }
    
    public void setPmData(PM pm) {
        this.setProjectManagerStatus(pm.getEstado());
        this.setProjectManagerFaults(pm.getFaltas());
        this.setProjectManagerDeductedMoney(pm.getDineroDescontado());
    }
    
    public void setComputadorasEnAlmacenData(Almacen almacen) {
        this.setTotalesSinGrafica(almacen.getComputadoras());
        this.setTotalesConGrafica(almacen.getComputadoraConGrafica());
        this.setComputadorasTotales(this.getTotalesSinGrafica() + this.getTotalesConGrafica());
    }
    
    public int getCantidadDeEmpleados(){
        int cantidad= this.cantidadCpuWorkers+this.cantidadPlacasBaseWorkers+this.cantidadEnsambladoresWorkers+this.cantidadFuentesWorkers+this.cantidadGraficasWorkers+this.cantidadRamWorkers;
        return cantidad;
    }

    /**
     * @return the lastDigit
     */
    public int getLastDigit() {
        return lastDigit;
    }

    /**
     * @param lastDigit the lastDigit to set
     */
    public void setLastDigit(int lastDigit) {
        this.lastDigit = lastDigit;
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
     * @return the cantidadPlacasBaseWorkers
     */
    public int getCantidadPlacasBaseWorkers() {
        return cantidadPlacasBaseWorkers;
    }

    /**
     * @param cantidadPlacasBaseWorkers the cantidadPlacasBaseWorkers to set
     */
    public void setCantidadPlacasBaseWorkers(int cantidadPlacasBaseWorkers) {
        this.cantidadPlacasBaseWorkers = cantidadPlacasBaseWorkers;
    }

    /**
     * @return the cantidadCpuWorkers
     */
    public int getCantidadCpuWorkers() {
        return cantidadCpuWorkers;
    }

    /**
     * @param cantidadCpuWorkers the cantidadCpuWorkers to set
     */
    public void setCantidadCpuWorkers(int cantidadCpuWorkers) {
        this.cantidadCpuWorkers = cantidadCpuWorkers;
    }

    /**
     * @return the cantidadRamWorkers
     */
    public int getCantidadRamWorkers() {
        return cantidadRamWorkers;
    }

    /**
     * @param cantidadRamWorkers the cantidadRamWorkers to set
     */
    public void setCantidadRamWorkers(int cantidadRamWorkers) {
        this.cantidadRamWorkers = cantidadRamWorkers;
    }

    /**
     * @return the cantidadFuentesWorkers
     */
    public int getCantidadFuentesWorkers() {
        return cantidadFuentesWorkers;
    }

    /**
     * @param cantidadFuentesWorkers the cantidadFuentesWorkers to set
     */
    public void setCantidadFuentesWorkers(int cantidadFuentesWorkers) {
        this.cantidadFuentesWorkers = cantidadFuentesWorkers;
    }

    /**
     * @return the cantidadGraficasWorkers
     */
    public int getCantidadGraficasWorkers() {
        return cantidadGraficasWorkers;
    }

    /**
     * @param cantidadGraficasWorkers the cantidadGraficasWorkers to set
     */
    public void setCantidadGraficasWorkers(int cantidadGraficasWorkers) {
        this.cantidadGraficasWorkers = cantidadGraficasWorkers;
    }

    /**
     * @return the cantidadEnsambladoresWorkers
     */
    public int getCantidadEnsambladoresWorkers() {
        return cantidadEnsambladoresWorkers;
    }

    /**
     * @param cantidadEnsambladoresWorkers the cantidadEnsambladoresWorkers to set
     */
    public void setCantidadEnsambladoresWorkers(int cantidadEnsambladoresWorkers) {
        this.cantidadEnsambladoresWorkers = cantidadEnsambladoresWorkers;
    }

    /**
     * @return the entregadasSinGrafica
     */
    public int getEntregadasSinGrafica() {
        return entregadasSinGrafica;
    }

    /**
     * @param entregadasSinGrafica the entregadasSinGrafica to set
     */
    public void setEntregadasSinGrafica(int entregadasSinGrafica) {
        this.entregadasSinGrafica = entregadasSinGrafica;
    }

    /**
     * @return the entregadasConGrafica
     */
    public int getEntregadasConGrafica() {
        return entregadasConGrafica;
    }

    /**
     * @param entregadasConGrafica the entregadasConGrafica to set
     */
    public void setEntregadasConGrafica(int entregadasConGrafica) {
        this.entregadasConGrafica = entregadasConGrafica;
    }

    /**
     * @return the daysUntilDeadline
     */
    public int getDaysUntilDeadline() {
        return daysUntilDeadline;
    }

    /**
     * @param daysUntilDeadline the daysUntilDeadline to set
     */
    public void setDaysUntilDeadline(int daysUntilDeadline) {
        this.daysUntilDeadline = daysUntilDeadline;
    }

    /**
     * @return the projectManagerStatus
     */
    public String getProjectManagerStatus() {
        return projectManagerStatus;
    }

    /**
     * @param projectManagerStatus the projectManagerStatus to set
     */
    public void setProjectManagerStatus(String projectManagerStatus) {
        this.projectManagerStatus = projectManagerStatus;
    }

    /**
     * @return the projectManagerFaults
     */
    public int getProjectManagerFaults() {
        return projectManagerFaults;
    }

    /**
     * @param projectManagerFaults the projectManagerFaults to set
     */
    public void setProjectManagerFaults(int projectManagerFaults) {
        this.projectManagerFaults = projectManagerFaults;
    }

    /**
     * @return the projectManagerDeductedMoney
     */
    public int getProjectManagerDeductedMoney() {
        return projectManagerDeductedMoney;
    }

    /**
     * @param projectManagerDeductedMoney the projectManagerDeductedMoney to set
     */
    public void setProjectManagerDeductedMoney(int projectManagerDeductedMoney) {
        this.projectManagerDeductedMoney = projectManagerDeductedMoney;
    }

    /**
     * @return the directorStatus
     */
    public String getDirectorStatus() {
        return directorStatus;
    }

    /**
     * @param directorStatus the directorStatus to set
     */
    public void setDirectorStatus(String directorStatus) {
        this.directorStatus = directorStatus;
    }

    /**
     * @return the dayCounter
     */
    public int getDayCounter() {
        return dayCounter;
    }

    /**
     * @param dayCounter the dayCounter to set
     */
    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
    }

    /**
     * @return the computadorasTotales
     */
    public int getComputadorasTotales() {
        return computadorasTotales;
    }

    /**
     * @param computadorasTotales the computadorasTotales to set
     */
    public void setComputadorasTotales(int computadorasTotales) {
        this.computadorasTotales = computadorasTotales;
    }

    /**
     * @return the totalesConGrafica
     */
    public int getTotalesConGrafica() {
        return totalesConGrafica;
    }

    /**
     * @param totalesConGrafica the totalesConGrafica to set
     */
    public void setTotalesConGrafica(int totalesConGrafica) {
        this.totalesConGrafica = totalesConGrafica;
    }

    /**
     * @return the totalesSinGrafica
     */
    public int getTotalesSinGrafica() {
        return totalesSinGrafica;
    }

    /**
     * @param totalesSinGrafica the totalesSinGrafica to set
     */
    public void setTotalesSinGrafica(int totalesSinGrafica) {
        this.totalesSinGrafica = totalesSinGrafica;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the placasBaseWorkers
     */
    public ListaSimple getPlacasBaseWorkers() {
        return placasBaseWorkers;
    }

    /**
     * @param placasBaseWorkers the placasBaseWorkers to set
     */
    public void setPlacasBaseWorkers(ListaSimple placasBaseWorkers) {
        this.placasBaseWorkers = placasBaseWorkers;
    }

    /**
     * @return the cpuWorkers
     */
    public ListaSimple getCpuWorkers() {
        return cpuWorkers;
    }

    /**
     * @param cpuWorkers the cpuWorkers to set
     */
    public void setCpuWorkers(ListaSimple cpuWorkers) {
        this.cpuWorkers = cpuWorkers;
    }

    /**
     * @return the ramWorkers
     */
    public ListaSimple getRamWorkers() {
        return ramWorkers;
    }

    /**
     * @param ramWorkers the ramWorkers to set
     */
    public void setRamWorkers(ListaSimple ramWorkers) {
        this.ramWorkers = ramWorkers;
    }

    /**
     * @return the fuentesWorkers
     */
    public ListaSimple getFuentesWorkers() {
        return fuentesWorkers;
    }

    /**
     * @param fuentesWorkers the fuentesWorkers to set
     */
    public void setFuentesWorkers(ListaSimple fuentesWorkers) {
        this.fuentesWorkers = fuentesWorkers;
    }

    /**
     * @return the graficasWorkers
     */
    public ListaSimple getGraficasWorkers() {
        return graficasWorkers;
    }

    /**
     * @param graficasWorkers the graficasWorkers to set
     */
    public void setGraficasWorkers(ListaSimple graficasWorkers) {
        this.graficasWorkers = graficasWorkers;
    }

    /**
     * @return the ensambladores
     */
    public ListaSimple getEnsambladores() {
        return ensambladores;
    }

    /**
     * @param ensambladores the ensambladores to set
     */
    public void setEnsambladores(ListaSimple ensambladores) {
        this.ensambladores = ensambladores;
    }

    /**
     * @return the operativeCost
     */
    public int getOperativeCost() {
        return operativeCost;
    }

    /**
     * @param operativeCost the operativeCost to set
     */
    public void setOperativeCost(int operativeCost) {
        this.operativeCost = operativeCost;
    }

    /**
     * @return the profit
     */
    public float getProfit() {
        return profit;
    }

    /**
     * @param profit the profit to set
     */
    public void setProfit(float profit) {
        this.profit = profit;
    }

    /**
     * @return the income
     */
    public float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(float income) {
        this.income = income;
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

}
