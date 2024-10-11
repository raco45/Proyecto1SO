
package classes;

import Developer.Worker;


public class Nodo {
    
    private Nodo nodoSiguiente;
    private Worker datos;
    
    public Nodo(Worker datos) {
        this.nodoSiguiente = null;
        this.datos = datos;
    }

    /**
     * @return the nodoSiguiente
     */
    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    /**
     * @param nodoSiguiente the nodoSiguiente to set
     */
    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    /**
     * @return the datos
     */
    public Worker getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Worker datos) {
        this.datos = datos;
    }
    
    
    
}
