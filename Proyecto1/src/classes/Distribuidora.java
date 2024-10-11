
package classes;

import Interfaz.DashboardBueno;

public class Distribuidora {

    private int computadoras;
    private int computadorasConGrafica;
    private int computadorasTotales;
    private float gananciaTotal;
    private float gananciaComputadora;
    private float gananciaGrafica;

    
    
    
    public Distribuidora( ){
        this.computadoras=0;
        this.computadorasConGrafica=0;
        this.computadorasTotales=0;
        this.gananciaTotal=0;
        this.gananciaComputadora=0;
        this.gananciaGrafica=0;
        
    }
    
    public void recibirComputadoras(int computadoras, int computadorasConGrafica, String company){
        this.setComputadoras(this.getComputadoras() + computadoras);
        this.setComputadorasConGrafica(this.getComputadorasConGrafica() + computadorasConGrafica);
        if (company.equals("Apple")){
            this.gananciaComputadora+=computadoras*100000;
            this.gananciaGrafica+=computadorasConGrafica*150000;
        }else{
            this.gananciaComputadora+=computadoras*180000;
            this.gananciaGrafica+=computadorasConGrafica*250000;
        }
        this.gananciaTotal=this.gananciaComputadora+this.gananciaGrafica;
        this.computadorasTotales=this.computadoras+this.computadorasConGrafica;
        this.setDashboard(company);
        this.setDashUtilitys(company);
    }
    public void setDashUtilitys(String company){
        String costosOpeN=DashboardBueno.getCostosOpeN().getText();
        String costosOpeS=DashboardBueno.getCostosOpeS().getText();
        int costosIntN= Integer.parseInt(costosOpeN);
        int costosIntS= Integer.parseInt(costosOpeS);
        int utilityN= (int)this.gananciaTotal-costosIntN;
        int utilityS= (int)this.gananciaTotal-costosIntS;
        String daysA= DashboardBueno.getDiasTotalesN().getText();
        String daysM= DashboardBueno.getDiasTotalesSq().getText();
        int diasTotA= Integer.parseInt(daysA);
        int diasTotM= Integer.parseInt(daysM);
        DashboardBueno.grafica.addSerie(diasTotA, utilityN, DashboardBueno.grafica.getSeries1());
        DashboardBueno.grafica.addSerie2(diasTotM,utilityS, DashboardBueno.grafica.series2);
        
        if(company.equals("Apple")){
            String ingresar;
            if(gananciaTotal>=1000000){
            int money= (int)utilityN/1000000;
                ingresar= Integer.toString(money)+"M";
             }else{
                int money= (int)utilityN/1000;
                ingresar= Integer.toString(money)+"K";
            }
            DashboardBueno.getGananciaTotalN().setText(ingresar);
        }else{
            String ingresar;
            if(gananciaTotal>=1000000){
            int money= (int)utilityS/1000000;
                ingresar= Integer.toString(money)+"M";
             }else{
                int money= (int)utilityS/1000;
                ingresar= Integer.toString(money)+"K";
            }
            DashboardBueno.getGananciaTotalSq().setText(ingresar);
        }
    }
    public void setDashboard(String company){
        String ingresar;
        if(gananciaTotal>=1000000){
            int money= (int)gananciaTotal/1000000;
            ingresar= Integer.toString(money)+"M";
        }else{
            int money= (int)gananciaTotal/1000;
            ingresar= Integer.toString(money)+"K";
        }
        if(company.equals("Apple")){
            DashboardBueno.getGananciasBrutasN().setText(ingresar);
            DashboardBueno.getJuegosTotalesN().setText(Integer.toString(computadorasTotales));
            DashboardBueno.getHistoricoJuegosN().setText(Integer.toString(computadoras));
            DashboardBueno.getHistoricoDlcN().setText(Integer.toString(computadorasConGrafica));
        }else{
           DashboardBueno.getGananciasBrutasS().setText(ingresar);
           DashboardBueno.getJuegosTotalesSq().setText(Integer.toString(computadorasTotales));
           DashboardBueno.getHistoricoJuegosSq().setText(Integer.toString(computadoras));
           DashboardBueno.getHistoricoDlcSq().setText(Integer.toString(computadorasConGrafica));
        }
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
     * @return the computadorasConGrafica
     */
    public int getComputadorasConGrafica() {
        return computadorasConGrafica;
    }

    /**
     * @param computadorasConGrafica the computadorasConGrafica to set
     */
    public void setComputadorasConGrafica(int computadorasConGrafica) {
        this.computadorasConGrafica = computadorasConGrafica;
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
     * @return the gananciaTotal
     */
    public float getGananciaTotal() {
        return gananciaTotal;
    }

    /**
     * @param gananciaTotal the gananciaTotal to set
     */
    public void setGananciaTotal(float gananciaTotal) {
        this.gananciaTotal = gananciaTotal;
    }

    /**
     * @return the gananciaComputadora
     */
    public float getGananciaComputadora() {
        return gananciaComputadora;
    }

    /**
     * @param gananciaComputadora the gananciaComputadora to set
     */
    public void setGananciaComputadora(float gananciaComputadora) {
        this.gananciaComputadora = gananciaComputadora;
    }

    /**
     * @return the gananciaGrafica
     */
    public float getGananciaGrafica() {
        return gananciaGrafica;
    }

    /**
     * @param gananciaGrafica the gananciaGrafica to set
     */
    public void setGananciaGrafica(float gananciaGrafica) {
        this.gananciaGrafica = gananciaGrafica;
    }
        
}
