
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InitialValues {

    private int lastDigit;
    private int lastDigit2;
    private int dayDuration;
    private int deadline;

    private int cantidadPlacasBaseApple;
    private int cantidadCpuApple;
    private int cantidadRamApple;
    private int cantidadFuentesApple;
    private int cantidadGraficasApple;
    private int cantidadEnsambladoresApple;

    private int cantidadPlacasBaseMSI;
    private int cantidadCpuMSI;
    private int cantidadRamMSI;
    private int cantidadFuentesMSI;
    private int cantidadGraficasMSI;
    private int cantidadEnsambladoresMSI;

    public InitialValues(int lastDigit, int lastDigit2, int dayDuration, int deadline, int cantidadPlacasBaseApple, int cantidadCpuApple, int cantidadRamApple, int cantidadFuentesApple, int cantidadGraficasApple, int cantidadEnsambladoresApple, int cantidadPlacaBaseMSI, int cantidadCpuMSI, int cantidadRamMSI, int cantidadFuentesMSI, int cantidadGraficasMSI, int cantidadEnsambladoresMSI) {
        this.lastDigit = lastDigit;
        this.lastDigit2=lastDigit2;
        this.dayDuration = dayDuration;
        this.deadline = deadline;
        this.cantidadPlacasBaseApple = cantidadPlacasBaseApple;
        this.cantidadCpuApple = cantidadCpuApple;
        this.cantidadRamApple = cantidadRamApple;
        this.cantidadFuentesApple = cantidadFuentesApple;
        this.cantidadGraficasApple = cantidadGraficasApple;
        this.cantidadEnsambladoresApple = cantidadEnsambladoresApple;
        this.cantidadPlacasBaseMSI = cantidadPlacaBaseMSI;
        this.cantidadCpuMSI = cantidadCpuMSI;
        this.cantidadRamMSI = cantidadRamMSI;
        this.cantidadFuentesMSI = cantidadFuentesMSI;
        this.cantidadGraficasMSI = cantidadGraficasMSI;
        this.cantidadEnsambladoresMSI = cantidadEnsambladoresMSI;
    }

    public void leerTXT(String ruta) {

        File archivo = new File(ruta);
        int testNumber;

        try {
            try {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                String parametrosTXT = "";

                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        parametrosTXT += linea + "\n";
                    }
                }

                if (!"".equals(parametrosTXT)) {
                    String[] parametrosStrings = parametrosTXT.split("\n");
                    for (int i = 0; i < parametrosStrings.length; i++) {
                        testNumber = Integer.parseInt(parametrosStrings[i]);
                    }
                    this.setDayDuration(Integer.parseInt(parametrosStrings[0]));
                    this.setDeadline(Integer.parseInt(parametrosStrings[1]));
                    this.setCantidadPlacasBaseApple(Integer.parseInt(parametrosStrings[2]));
                    this.setCantidadCpuApple(Integer.parseInt(parametrosStrings[3]));
                    this.setCantidadRamApple(Integer.parseInt(parametrosStrings[4]));
                    this.setCantidadFuentesApple(Integer.parseInt(parametrosStrings[5]));
                    this.setCantidadGraficasApple(Integer.parseInt(parametrosStrings[6]));
                    this.setCantidadEnsambladoresApple(Integer.parseInt(parametrosStrings[7]));
                    this.setCantidadPlacasBaseMSI(Integer.parseInt(parametrosStrings[8]));
                    this.setCantidadCpuMSI(Integer.parseInt(parametrosStrings[9]));
                    this.setCantidadRamMSI(Integer.parseInt(parametrosStrings[10]));
                    this.setCantidadFuentesMSI(Integer.parseInt(parametrosStrings[11]));
                    this.setCantidadGraficasMSI(Integer.parseInt(parametrosStrings[12]));
                    this.setCantidadEnsambladoresMSI(Integer.parseInt(parametrosStrings[13]));
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error de lectura, se procedera a cargar un archivo por default");

                this.leerTXT("test\\parametros.txt");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro el archivo, Se procedera a leer un archivo por default");
            this.leerTXT("src/Test/parametros.txt");
        }
    }

    public void escribirTXT() {
        String contenidoTXT = "";
        if (this != null) {
            contenidoTXT += this.getDayDuration() + "\n";
            contenidoTXT += this.getDeadline() + "\n";
            contenidoTXT += this.getCantidadPlacasBaseApple() + "\n";
            contenidoTXT += this.getCantidadCpuApple() + "\n";
            contenidoTXT += this.getCantidadRamApple() + "\n";
            contenidoTXT += this.getCantidadFuentesApple() + "\n";
            contenidoTXT += this.getCantidadGraficasApple() + "\n";
            contenidoTXT += this.getCantidadEnsambladoresApple() + "\n";
            contenidoTXT += this.getCantidadPlacasBaseMSI() + "\n";
            contenidoTXT += this.getCantidadCpuMSI() + "\n";
            contenidoTXT += this.getCantidadRamMSI() + "\n";
            contenidoTXT += this.getCantidadFuentesMSI() + "\n";
            contenidoTXT += this.getCantidadGraficasMSI() + "\n";
            contenidoTXT += this.getCantidadEnsambladoresMSI() + "\n";
        }
        try {
            PrintWriter pw = new PrintWriter("src/Test/parametros.txt");
            pw.print(contenidoTXT);
            pw.close();
        } catch (Exception e) {

        }
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
     * @return the cantidadPlacasBaseApple
     */
    public int getCantidadPlacasBaseApple() {
        return cantidadPlacasBaseApple;
    }

    /**
     * @param cantidadPlacasBaseApple the cantidadPlacasBaseApple to set
     */
    public void setCantidadPlacasBaseApple(int cantidadPlacasBaseApple) {
        this.cantidadPlacasBaseApple = cantidadPlacasBaseApple;
    }

    /**
     * @return the cantidadCpuApple
     */
    public int getCantidadCpuApple() {
        return cantidadCpuApple;
    }

    /**
     * @param cantidadCpuApple the cantidadCpuApple to set
     */
    public void setCantidadCpuApple(int cantidadCpuApple) {
        this.cantidadCpuApple = cantidadCpuApple;
    }

    /**
     * @return the cantidadRamApple
     */
    public int getCantidadRamApple() {
        return cantidadRamApple;
    }

    /**
     * @param cantidadRamApple the cantidadRamApple to set
     */
    public void setCantidadRamApple(int cantidadRamApple) {
        this.cantidadRamApple = cantidadRamApple;
    }

    /**
     * @return the cantidadFuentesApple
     */
    public int getCantidadFuentesApple() {
        return cantidadFuentesApple;
    }

    /**
     * @param cantidadFuentesApple the cantidadFuentesApple to set
     */
    public void setCantidadFuentesApple(int cantidadFuentesApple) {
        this.cantidadFuentesApple = cantidadFuentesApple;
    }

    /**
     * @return the cantidadGraficasApple
     */
    public int getCantidadGraficasApple() {
        return cantidadGraficasApple;
    }

    /**
     * @param cantidadGraficasApple the cantidadGraficasApple to set
     */
    public void setCantidadGraficasApple(int cantidadGraficasApple) {
        this.cantidadGraficasApple = cantidadGraficasApple;
    }

    /**
     * @return the cantidadEnsambladoresApple
     */
    public int getCantidadEnsambladoresApple() {
        return cantidadEnsambladoresApple;
    }

    /**
     * @param cantidadEnsambladoresApple the cantidadEnsambladoresApple to set
     */
    public void setCantidadEnsambladoresApple(int cantidadEnsambladoresApple) {
        this.cantidadEnsambladoresApple = cantidadEnsambladoresApple;
    }

    /**
     * @return the cantidadPlacasBaseMSI
     */
    public int getCantidadPlacasBaseMSI() {
        return cantidadPlacasBaseMSI;
    }

    /**
     * @param cantidadPlacasBaseMSI the cantidadPlacasBaseMSI to set
     */
    public void setCantidadPlacasBaseMSI(int cantidadPlacasBaseMSI) {
        this.cantidadPlacasBaseMSI = cantidadPlacasBaseMSI;
    }

    /**
     * @return the cantidadCpuMSI
     */
    public int getCantidadCpuMSI() {
        return cantidadCpuMSI;
    }

    /**
     * @param cantidadCpuMSI the cantidadCpuMSI to set
     */
    public void setCantidadCpuMSI(int cantidadCpuMSI) {
        this.cantidadCpuMSI = cantidadCpuMSI;
    }

    /**
     * @return the cantidadRamMSI
     */
    public int getCantidadRamMSI() {
        return cantidadRamMSI;
    }

    /**
     * @param cantidadRamMSI the cantidadRamMSI to set
     */
    public void setCantidadRamMSI(int cantidadRamMSI) {
        this.cantidadRamMSI = cantidadRamMSI;
    }

    /**
     * @return the cantidadFuentesMSI
     */
    public int getCantidadFuentesMSI() {
        return cantidadFuentesMSI;
    }

    /**
     * @param cantidadFuentesMSI the cantidadFuentesMSI to set
     */
    public void setCantidadFuentesMSI(int cantidadFuentesMSI) {
        this.cantidadFuentesMSI = cantidadFuentesMSI;
    }

    /**
     * @return the cantidadGraficasMSI
     */
    public int getCantidadGraficasMSI() {
        return cantidadGraficasMSI;
    }

    /**
     * @param cantidadGraficasMSI the cantidadGraficasMSI to set
     */
    public void setCantidadGraficasMSI(int cantidadGraficasMSI) {
        this.cantidadGraficasMSI = cantidadGraficasMSI;
    }

    /**
     * @return the cantidadEnsambladoresMSI
     */
    public int getCantidadEnsambladoresMSI() {
        return cantidadEnsambladoresMSI;
    }

    /**
     * @param cantidadEnsambladoresMSI the cantidadEnsambladoresMSI to set
     */
    public void setCantidadEnsambladoresMSI(int cantidadEnsambladoresMSI) {
        this.cantidadEnsambladoresMSI = cantidadEnsambladoresMSI;
    }

    /**
     * @return the lastDigit2
     */
    public int getLastDigit2() {
        return lastDigit2;
    }

    /**
     * @param lastDigit2 the lastDigit2 to set
     */
    public void setLastDigit2(int lastDigit2) {
        this.lastDigit2 = lastDigit2;
    }

}
