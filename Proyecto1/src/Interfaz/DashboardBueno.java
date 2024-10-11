package Interfaz;

import Developer.Worker;
import Graficar.Grafica;
import classes.InitialValues;
import classes.Simulation;
import javax.management.timer.Timer;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class DashboardBueno extends javax.swing.JFrame {

    /**
     * @return the cantDlcN
     */
    public static javax.swing.JLabel getCantDlcN() {
        return cantDlcN;
    }

    /**
     * @return the cantDlcS
     */
    public static javax.swing.JLabel getCantDlcS() {
        return cantDlcS;
    }

    /**
     * @return the cantGuionesN6
     */
    public static javax.swing.JLabel getCantGuionesN6() {
        return cantGuionesN6;
    }

    /**
     * @return the cantNivelesN
     */
    public static javax.swing.JLabel getCantNivelesN() {
        return cantNivelesN;
    }

    /**
     * @return the cantNivelesS
     */
    public static javax.swing.JLabel getCantNivelesS() {
        return cantNivelesS;
    }

    /**
     * @return the cantSistemasN
     */
    public static javax.swing.JLabel getCantSistemasN() {
        return cantSistemasN;
    }

    /**
     * @return the cantSistemasS
     */
    public static javax.swing.JLabel getCantSistemasS() {
        return cantSistemasS;
    }

    /**
     * @return the cantSpritesN
     */
    public static javax.swing.JLabel getCantSpritesN() {
        return cantSpritesN;
    }

    /**
     * @return the cantSpritesS
     */
    public static javax.swing.JLabel getCantSpritesS() {
        return cantSpritesS;
    }

    /**
     * @return the costosOpeN
     */
    public static javax.swing.JLabel getCostosOpeN() {
        return costosOpeN;
    }

    /**
     * @return the costosOpeS
     */
    public static javax.swing.JLabel getCostosOpeS() {
        return costosOpeS;
    }

    /**
     * @return the descuentoPmN
     */
    public static javax.swing.JLabel getDescuentoPmN() {
        return descuentoPmN;
    }

    /**
     * @return the descuentoPmS
     */
    public static javax.swing.JLabel getDescuentoPmS() {
        return descuentoPmS;
    }

    /**
     * @return the diasTotalesN
     */
    public static javax.swing.JLabel getDiasTotalesN() {
        return diasTotalesN;
    }

    /**
     * @return the diasTotalesSq
     */
    public static javax.swing.JLabel getDiasTotalesSq() {
        return diasTotalesSq;
    }

    /**
     * @return the estadoDirectorS
     */
    public static javax.swing.JLabel getEstadoDirectorS() {
        return estadoDirectorS;
    }

    /**
     * @return the estadoPmN
     */
    public static javax.swing.JLabel getEstadoPmN() {
        return estadoPmN;
    }

    /**
     * @return the estadoPmN1
     */
    public static javax.swing.JLabel getEstadoPmN1() {
        return estadoPmN1;
    }

    /**
     * @return the estadoPmS
     */
    public static javax.swing.JLabel getEstadoPmS() {
        return estadoPmS;
    }

    /**
     * @return the faltasPmN
     */
    public static javax.swing.JLabel getFaltasPmN() {
        return faltasPmN;
    }

    /**
     * @return the faltasPmS
     */
    public static javax.swing.JLabel getFaltasPmS() {
        return faltasPmS;
    }

    /**
     * @return the fechaEntregaN
     */
    public static javax.swing.JLabel getFechaEntregaN() {
        return fechaEntregaN;
    }

    /**
     * @return the fechaEntregaSq
     */
    public static javax.swing.JLabel getFechaEntregaSq() {
        return fechaEntregaSq;
    }

    /**
     * @return the gananciaTotalN
     */
    public static javax.swing.JLabel getGananciaTotalN() {
        return gananciaTotalN;
    }

    /**
     * @return the gananciaTotalSq
     */
    public static javax.swing.JLabel getGananciaTotalSq() {
        return gananciaTotalSq;
    }

    /**
     * @return the gananciasBrutasN
     */
    public static javax.swing.JLabel getGananciasBrutasN() {
        return gananciasBrutasN;
    }

    /**
     * @return the gananciasBrutasS
     */
    public static javax.swing.JLabel getGananciasBrutasS() {
        return gananciasBrutasS;
    }

    /**
     * @return the historicoDlcN
     */
    public static javax.swing.JLabel getHistoricoDlcN() {
        return historicoDlcN;
    }

    /**
     * @return the historicoDlcSq
     */
    public static javax.swing.JLabel getHistoricoDlcSq() {
        return historicoDlcSq;
    }

    /**
     * @return the historicoJuegosN
     */
    public static javax.swing.JLabel getHistoricoJuegosN() {
        return historicoJuegosN;
    }

    /**
     * @return the historicoJuegosSq
     */
    public static javax.swing.JLabel getHistoricoJuegosSq() {
        return historicoJuegosSq;
    }

    /**
     * @return the juegosTotalesN
     */
    public static javax.swing.JLabel getJuegosTotalesN() {
        return juegosTotalesN;
    }

    /**
     * @return the juegosTotalesSq
     */
    public static javax.swing.JLabel getJuegosTotalesSq() {
        return juegosTotalesSq;
    }

    /**
     * @return the readyToShip1
     */
    public static javax.swing.JLabel getReadyToShip1() {
        return readyToShip1;
    }

    /**
     * @return the readyToShipDLC
     */
    public static javax.swing.JLabel getReadyToShipDLC() {
        return readyToShipDLC;
    }

    /**
     * @return the readyToShipDLCSq
     */
    public static javax.swing.JLabel getReadyToShipDLCSq() {
        return readyToShipDLCSq;
    }

    /**
     * @return the readyToShipSq
     */
    public static javax.swing.JLabel getReadyToShipSq() {
        return readyToShipSq;
    }

    /**
     * @return the adminPanel
     */
    /**
     * @return the cantGuionesS
     */
    public static javax.swing.JLabel getCantGuionesS() {
        return cantGuionesS;
    }

    InitialValues initialValues = new InitialValues(7, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    Simulation apple;
    Simulation msi;
    public static Grafica grafica = new Grafica();
    int maxEmpleadosApple = 19;
    int maxEmpleadosMSI = 21;
    boolean flag = false;

    /**
     * Creates new form Dashboard
     */
    public DashboardBueno() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        initComponents();
        this.verifySpinners();
        //Spinners desarroladores ventana Apple
        this.spinnerNarrativoN.setModel(this.verifySpinners());
        this.spinnerLogicaN.setModel(this.verifySpinners());
        this.spinnerDlcN.setModel(this.verifySpinners());
        this.spinnerSpritesN.setModel(this.verifySpinners());
        this.spinnerNivelesN.setModel(this.verifySpinners());
        this.spinnerIntegradorN.setModel(this.verifySpinners());

        //Spinners desarrolladores ventana admin 
        this.spinnerNarrativoN1.setModel(this.verifySpinners());
        this.spinnerLogicaN1.setModel(this.verifySpinners());
        this.spinnerDlcN1.setModel(this.verifySpinners());
        this.spinnerSpritesN1.setModel(this.verifySpinners());
        this.spinnerNivelesN1.setModel(this.verifySpinners());
        this.spinnerIntegradorN1.setModel(this.verifySpinners());
        this.spinnerNarrativoN2.setModel(this.verifySpinnersMSI());
        this.spinnerLogicaN2.setModel(this.verifySpinnersMSI());
        this.spinnerDlcN2.setModel(this.verifySpinnersMSI());
        this.spinnerSpritesN2.setModel(this.verifySpinnersMSI());
        this.spinnerNivelesN2.setModel(this.verifySpinnersMSI());
        this.spinnerIntegradorN2.setModel(this.verifySpinnersMSI());

        //spinners desarrolladores ventana Square
        this.spinnerNarrativoS.setModel(this.verifySpinnersMSI());
        this.spinnerLogicaS.setModel(this.verifySpinnersMSI());
        this.spinnerDlcS.setModel(this.verifySpinnersMSI());
        this.spinnerSpritesS.setModel(this.verifySpinnersMSI());
        this.spinnerNivelesS.setModel(this.verifySpinnersMSI());
        this.spinnerIntegradorS.setModel(this.verifySpinnersMSI());
        this.spinnerDuracion.setModel(this.verify());
        this.spinnerDeadline.setModel(this.verify());

    }

    public SpinnerNumberModel verifySpinners() {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(this.maxEmpleadosApple);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
        return modeloSpinner;
    }

    public SpinnerNumberModel verifySpinnersMSI() {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(this.maxEmpleadosMSI);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
        return modeloSpinner;
    }

    public SpinnerNumberModel verify() {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
        return modeloSpinner;
    }

    public void checkCantEmpleados(JSpinner narrativa, JSpinner niveles, JSpinner sprites, JSpinner logica, JSpinner dlc, JSpinner integrador, int maxEmpleados, JLabel labelCantEmpleados) {
        int narra = (int) narrativa.getValue();
        int nive = (int) niveles.getValue();
        int spri = (int) sprites.getValue();
        int log = (int) logica.getValue();
        int dlcs = (int) dlc.getValue();
        int inte = (int) integrador.getValue();
        int sum = narra + nive + spri + log + dlcs + inte;
        if (sum == maxEmpleados) {
            this.setMaxSpinn(narrativa, narra);
            this.setMaxSpinn(niveles, nive);
            this.setMaxSpinn(sprites, spri);
            this.setMaxSpinn(logica, log);
            this.setMaxSpinn(dlc, dlcs);
            this.setMaxSpinn(integrador, inte);

        } else {
            int resta = maxEmpleados - sum;
            this.setMaxSpinn(narrativa, narra + resta);
            this.setMaxSpinn(niveles, nive + resta);
            this.setMaxSpinn(sprites, spri + resta);
            this.setMaxSpinn(logica, log + resta);
            this.setMaxSpinn(dlc, dlcs + resta);
            this.setMaxSpinn(integrador, inte + resta);
        }

        labelCantEmpleados.setText(Integer.toString(sum));

    }

    public void setMaxSpinn(JSpinner current, int max) {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(max);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue((int) current.getValue());
        current.setModel(modeloSpinner);
    }

    public void setSameSpinners(JSpinner current, JSpinner arrival) {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();

        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue((int) current.getValue());
        arrival.setModel(modeloSpinner);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel102 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        startSimul = new javax.swing.JButton();
        txtSimu = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        spinnerDuracion = new javax.swing.JSpinner();
        spinnerDeadline = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        spinnerIntegradorN1 = new javax.swing.JSpinner();
        spinnerNarrativoN1 = new javax.swing.JSpinner();
        spinnerNivelesN1 = new javax.swing.JSpinner();
        spinnerSpritesN1 = new javax.swing.JSpinner();
        spinnerLogicaN1 = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        spinnerDlcN1 = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        empleadosApple = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        spinnerIntegradorN2 = new javax.swing.JSpinner();
        spinnerNarrativoN2 = new javax.swing.JSpinner();
        spinnerNivelesN2 = new javax.swing.JSpinner();
        spinnerSpritesN2 = new javax.swing.JSpinner();
        spinnerLogicaN2 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        spinnerDlcN2 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        empleadosMSI = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        squarePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        cantDlcS = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spinnerIntegradorS = new javax.swing.JSpinner();
        spinnerNarrativoS = new javax.swing.JSpinner();
        spinnerNivelesS = new javax.swing.JSpinner();
        spinnerSpritesS = new javax.swing.JSpinner();
        spinnerLogicaS = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        spinnerDlcS = new javax.swing.JSpinner();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        maxGuionesS = new javax.swing.JLabel();
        diasTotalesSq = new javax.swing.JLabel();
        readyToShipDLCSq = new javax.swing.JLabel();
        cantSpritesS = new javax.swing.JLabel();
        cantSistemasS = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        empleadosMSI1 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        fechaEntregaSq = new javax.swing.JLabel();
        cantNivelesS = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        estadoDirectorS = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        estadoPmS = new javax.swing.JLabel();
        descuentoPmS = new javax.swing.JLabel();
        faltasPmS = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        maxNivelesS = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        maxSpritesS = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        maxSistemasS = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        maxDlcS = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        gananciasBrutasS = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        juegosTotalesSq = new javax.swing.JLabel();
        gananciaTotalSq = new javax.swing.JLabel();
        historicoDlcSq = new javax.swing.JLabel();
        historicoJuegosSq = new javax.swing.JLabel();
        cantGuionesS = new javax.swing.JLabel();
        costosOpeS = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        readyToShipSq = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nintendoPanel = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        cantDlcN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinnerIntegradorN = new javax.swing.JSpinner();
        spinnerNarrativoN = new javax.swing.JSpinner();
        spinnerNivelesN = new javax.swing.JSpinner();
        spinnerSpritesN = new javax.swing.JSpinner();
        spinnerLogicaN = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spinnerDlcN = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        maxGuionesN = new javax.swing.JLabel();
        diasTotalesN = new javax.swing.JLabel();
        readyToShipDLC = new javax.swing.JLabel();
        cantSpritesN = new javax.swing.JLabel();
        cantSistemasN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        empleadosApple1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fechaEntregaN = new javax.swing.JLabel();
        cantNivelesN = new javax.swing.JLabel();
        estadoPmN = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        descuentoPmN = new javax.swing.JLabel();
        faltasPmN = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        maxNivelesN = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        maxSpritesN = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        maxSistemasN = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        maxDlcN = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        gananciasBrutasN = new javax.swing.JLabel();
        juegosTotalesN = new javax.swing.JLabel();
        gananciaTotalN = new javax.swing.JLabel();
        historicoDlcN = new javax.swing.JLabel();
        historicoJuegosN = new javax.swing.JLabel();
        cantGuionesN6 = new javax.swing.JLabel();
        costosOpeN = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        estadoPmN1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        readyToShip1 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();

        jLabel102.setText("jLabel102");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Un software de  Ricardo  y Christian");
        adminPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 50));
        adminPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1010, -1));

        jLabel4.setFont(new java.awt.Font("Haettenschweiler", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Dashboard");
        adminPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 60));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
        adminPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 280, 100));

        startSimul.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
        startSimul.setText("Iniciar");
        startSimul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimulActionPerformed(evt);
            }
        });
        adminPanel.add(startSimul, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 80, 30));

        txtSimu.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
        txtSimu.setText("Cargar archivo");
        txtSimu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimuActionPerformed(evt);
            }
        });
        adminPanel.add(txtSimu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 30));

        jLabel25.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Días entre entregas ");
        adminPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 180, 40));

        jLabel47.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Duración del día ");
        adminPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 40));

        spinnerDuracion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDuracionStateChanged(evt);
            }
        });
        adminPanel.add(spinnerDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 20));
        adminPanel.add(spinnerDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 20));

        jLabel49.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("CPU");
        adminPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 200, 30));

        jLabel50.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Memoria RAM");
        adminPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 200, 30));

        jLabel51.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Fuentes de alimentacion");
        adminPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 220, 30));

        jLabel52.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Ensambladores");
        adminPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 200, 30));

        spinnerIntegradorN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerIntegradorN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerIntegradorN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 680, 60, -1));

        spinnerNarrativoN1.setValue(1);
        spinnerNarrativoN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNarrativoN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerNarrativoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 60, -1));

        spinnerNivelesN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNivelesN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerNivelesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 60, -1));

        spinnerSpritesN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSpritesN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerSpritesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 60, -1));

        spinnerLogicaN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerLogicaN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerLogicaN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 60, -1));

        jLabel53.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Tarjetas graficas");
        adminPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, 200, 30));

        spinnerDlcN1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDlcN1StateChanged(evt);
            }
        });
        adminPanel.add(spinnerDlcN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 60, -1));

        jLabel54.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Placas base");
        adminPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 200, 30));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 0));
        jLabel55.setText("Productores");
        jLabel55.setAlignmentX(5.0F);
        jLabel55.setAlignmentY(0.0F);
        jLabel55.setFocusable(false);
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 190, 30));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Parámetros de simulación");
        adminPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 230, -1));

        empleadosApple.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        empleadosApple.setForeground(new java.awt.Color(0, 0, 0));
        empleadosApple.setText("0");
        adminPanel.add(empleadosApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 20, 30));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("BankGothic-Medium", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 0, 0));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/apple-5-logo-png-transparent.png"))); // NOI18N
        jLabel58.setAlignmentX(5.0F);
        jLabel58.setAlignmentY(0.0F);
        jLabel58.setFocusable(false);
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminPanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 400, 120));

        jButton1.setText("Grafico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel59.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("CPU");
        adminPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 200, 30));

        jLabel60.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("memoria ram");
        adminPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 200, 30));

        jLabel61.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("fuentes de alimentacion");
        adminPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 210, 30));

        jLabel62.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Ensambladores");
        adminPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 200, 30));

        spinnerIntegradorN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerIntegradorN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerIntegradorN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 60, -1));

        spinnerNarrativoN2.setValue(1);
        spinnerNarrativoN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNarrativoN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerNarrativoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 60, -1));

        spinnerNivelesN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNivelesN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerNivelesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 60, -1));

        spinnerSpritesN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSpritesN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerSpritesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 60, -1));

        spinnerLogicaN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerLogicaN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerLogicaN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 60, -1));

        jLabel63.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Tarjetas graficas");
        adminPanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 200, 30));

        spinnerDlcN2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDlcN2StateChanged(evt);
            }
        });
        adminPanel.add(spinnerDlcN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 60, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        adminPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 350, 230));

        jLabel64.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Placas base");
        adminPanel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 200, 30));

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Productores");
        jLabel65.setAlignmentX(5.0F);
        jLabel65.setAlignmentY(0.0F);
        jLabel65.setFocusable(false);
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminPanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 130, 30));

        empleadosMSI.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        empleadosMSI.setForeground(new java.awt.Color(0, 0, 0));
        empleadosMSI.setText("0");
        adminPanel.add(empleadosMSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 20, 30));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/dashborad_logo.png"))); // NOI18N
        adminPanel.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 60));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/black.jpg"))); // NOI18N
        jLabel105.setText("jLabel105");
        adminPanel.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/OS.png"))); // NOI18N
        adminPanel.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 240, 230));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/OS_wallpaper.jpg"))); // NOI18N
        adminPanel.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1020, 650));

        jTabbedPane1.addTab("Admin", adminPanel);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1030, 0));

        cantDlcS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        cantDlcS.setForeground(new java.awt.Color(255, 255, 255));
        cantDlcS.setText("0");
        jPanel2.add(cantDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 40, 30));

        jLabel11.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Placas base");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, 30));

        jLabel23.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("RAM");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, 30));

        jLabel28.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fuentes de alimentacion");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 30));

        jLabel36.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Integradores");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 30));

        spinnerIntegradorS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerIntegradorSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerIntegradorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 60, -1));

        spinnerNarrativoS.setValue(1);
        spinnerNarrativoS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNarrativoSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerNarrativoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 60, -1));

        spinnerNivelesS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNivelesSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 60, -1));

        spinnerSpritesS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSpritesSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 60, -1));

        spinnerLogicaS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerLogicaSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerLogicaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 60, -1));

        jLabel37.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Tarjetas Graficas");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 160, 30));

        spinnerDlcS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDlcSStateChanged(evt);
            }
        });
        jPanel2.add(spinnerDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 60, -1));

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Tarjetas Graficas ensambladas");
        jLabel71.setAlignmentX(5.0F);
        jLabel71.setAlignmentY(0.0F);
        jLabel71.setFocusable(false);
        jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 240, 30));

        jLabel72.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Tarjetas graficas");
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 660, 200, 30));

        jLabel74.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Tarjetas Graficas");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 150, 30));

        jLabel75.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("CPU");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 200, 30));

        jLabel76.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Memoria Ram");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 200, 30));

        jLabel77.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Fuentes de alimentacion");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 140, 30));

        maxGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        maxGuionesS.setForeground(new java.awt.Color(255, 255, 255));
        maxGuionesS.setText("25");
        jPanel2.add(maxGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 30, 30));

        diasTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        diasTotalesSq.setForeground(new java.awt.Color(255, 255, 255));
        diasTotalesSq.setText("0");
        jPanel2.add(diasTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 40, 30));

        readyToShipDLCSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        readyToShipDLCSq.setForeground(new java.awt.Color(255, 255, 255));
        readyToShipDLCSq.setText("0");
        jPanel2.add(readyToShipDLCSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 40, 30));

        cantSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        cantSpritesS.setForeground(new java.awt.Color(255, 255, 255));
        cantSpritesS.setText("0");
        jPanel2.add(cantSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 40, 30));

        cantSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        cantSistemasS.setForeground(new java.awt.Color(255, 255, 255));
        cantSistemasS.setText("0");
        jPanel2.add(cantSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 40, 30));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Project  Manager");
        jLabel78.setAlignmentX(5.0F);
        jLabel78.setAlignmentY(0.0F);
        jLabel78.setFocusable(false);
        jLabel78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 30));

        empleadosMSI1.setBackground(new java.awt.Color(0, 0, 0));
        empleadosMSI1.setForeground(new java.awt.Color(255, 255, 255));
        empleadosMSI1.setText("0");
        jPanel2.add(empleadosMSI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 20, -1));

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Almacen");
        jLabel79.setAlignmentX(5.0F);
        jLabel79.setAlignmentY(0.0F);
        jLabel79.setFocusable(false);
        jLabel79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 90, 30));

        jLabel80.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Placas Base");
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 200, 30));

        fechaEntregaSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        fechaEntregaSq.setForeground(new java.awt.Color(0, 0, 0));
        fechaEntregaSq.setText("0");
        jPanel2.add(fechaEntregaSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 20, 30));

        cantNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        cantNivelesS.setForeground(new java.awt.Color(255, 255, 255));
        cantNivelesS.setText("0");
        jPanel2.add(cantNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 40, 30));

        jLabel81.setBackground(new java.awt.Color(0, 0, 0));
        jLabel81.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Productores");
        jLabel81.setAlignmentX(5.0F);
        jLabel81.setAlignmentY(0.0F);
        jLabel81.setFocusable(false);
        jLabel81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Director");
        jLabel82.setAlignmentX(5.0F);
        jLabel82.setAlignmentY(0.0F);
        jLabel82.setFocusable(false);
        jLabel82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 100, 30));

        estadoDirectorS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        estadoDirectorS.setForeground(new java.awt.Color(255, 255, 255));
        estadoDirectorS.setText("estado");
        jPanel2.add(estadoDirectorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 100, 30));

        jLabel83.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Ganancias en bruto");
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 180, 30));

        estadoPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        estadoPmS.setForeground(new java.awt.Color(255, 255, 255));
        estadoPmS.setText("Estado");
        jPanel2.add(estadoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 170, 30));

        descuentoPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        descuentoPmS.setForeground(new java.awt.Color(255, 255, 255));
        descuentoPmS.setText("0");
        jPanel2.add(descuentoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 80, 30));

        faltasPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        faltasPmS.setForeground(new java.awt.Color(255, 255, 255));
        faltasPmS.setText("0");
        jPanel2.add(faltasPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 70, 30));

        jLabel84.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Computadoras");
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 130, 30));

        jLabel85.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Costos operativos");
        jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 200, 30));

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Utilidad");
        jLabel86.setAlignmentX(5.0F);
        jLabel86.setAlignmentY(0.0F);
        jLabel86.setFocusable(false);
        jLabel86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 120, 50));

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Día número");
        jLabel87.setAlignmentX(5.0F);
        jLabel87.setAlignmentY(0.0F);
        jLabel87.setFocusable(false);
        jLabel87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 130, 30));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setText("Días para la entrega");
        jLabel88.setAlignmentX(5.0F);
        jLabel88.setAlignmentY(0.0F);
        jLabel88.setFocusable(false);
        jLabel88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 180, 30));

        jLabel89.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("de ");
        jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 30, 30));

        maxNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        maxNivelesS.setForeground(new java.awt.Color(255, 255, 255));
        maxNivelesS.setText("20");
        jPanel2.add(maxNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 30, 30));

        jLabel90.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("de ");
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 30, 30));

        maxSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        maxSpritesS.setForeground(new java.awt.Color(255, 255, 255));
        maxSpritesS.setText("55");
        jPanel2.add(maxSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 30, 30));

        jLabel91.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("de ");
        jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 30, 30));

        maxSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        maxSistemasS.setForeground(new java.awt.Color(255, 255, 255));
        maxSistemasS.setText("35");
        jPanel2.add(maxSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 30, 30));

        jLabel92.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("de ");
        jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 30, 30));

        maxDlcS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        maxDlcS.setForeground(new java.awt.Color(255, 255, 255));
        maxDlcS.setText("10");
        jPanel2.add(maxDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, 30, 30));

        jLabel93.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("de ");
        jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 660, 30, 30));

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 0));
        jLabel94.setText("Totales");
        jLabel94.setAlignmentX(5.0F);
        jLabel94.setAlignmentY(0.0F);
        jLabel94.setFocusable(false);
        jLabel94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 90, 30));

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Computadoras");
        jLabel95.setAlignmentX(5.0F);
        jLabel95.setAlignmentY(0.0F);
        jLabel95.setFocusable(false);
        jLabel95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 160, 50));

        gananciasBrutasS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        gananciasBrutasS.setForeground(new java.awt.Color(255, 255, 255));
        gananciasBrutasS.setText("0");
        jPanel2.add(gananciasBrutasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 90, 30));

        jLabel112.setBackground(new java.awt.Color(255, 255, 255));
        jLabel112.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Computadoras");
        jLabel112.setAlignmentX(5.0F);
        jLabel112.setAlignmentY(0.0F);
        jLabel112.setFocusable(false);
        jLabel112.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 160, 30));

        juegosTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        juegosTotalesSq.setForeground(new java.awt.Color(0, 0, 0));
        juegosTotalesSq.setText("0");
        jPanel2.add(juegosTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 110, 30));

        gananciaTotalSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        gananciaTotalSq.setForeground(new java.awt.Color(255, 255, 255));
        gananciaTotalSq.setText("0");
        jPanel2.add(gananciaTotalSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 110, 30));

        historicoDlcSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        historicoDlcSq.setForeground(new java.awt.Color(0, 0, 0));
        historicoDlcSq.setText("0");
        jPanel2.add(historicoDlcSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 40, 30));

        historicoJuegosSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        historicoJuegosSq.setForeground(new java.awt.Color(0, 0, 0));
        historicoJuegosSq.setText("0");
        jPanel2.add(historicoJuegosSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 40, 30));

        cantGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        cantGuionesS.setForeground(new java.awt.Color(255, 255, 255));
        cantGuionesS.setText("0");
        jPanel2.add(cantGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 40, 30));

        costosOpeS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        costosOpeS.setForeground(new java.awt.Color(255, 255, 255));
        costosOpeS.setText("0");
        jPanel2.add(costosOpeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 80, 30));

        label1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Faltas");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 70, 30));

        label3.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Dinero descontado");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 160, 30));

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Economía");
        jLabel97.setAlignmentX(5.0F);
        jLabel97.setAlignmentY(0.0F);
        jLabel97.setFocusable(false);
        jLabel97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 120, 30));

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Para  entregar");
        jLabel98.setAlignmentX(5.0F);
        jLabel98.setAlignmentY(0.0F);
        jLabel98.setFocusable(false);
        jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 180, 30));

        readyToShipSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        readyToShipSq.setForeground(new java.awt.Color(255, 255, 255));
        readyToShipSq.setText("0");
        jPanel2.add(readyToShipSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 40, 30));

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("BankGothic-Medium", 1, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 0, 0));
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
        jLabel99.setAlignmentX(5.0F);
        jLabel99.setAlignmentY(0.0F);
        jLabel99.setFocusable(false);
        jLabel99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 100));

        jLabel104.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("CPU");
        jPanel2.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, 30));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Blanco.jpg"))); // NOI18N
        jLabel100.setText("jLabel100");
        jPanel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        jLabel108.setBackground(new java.awt.Color(255, 255, 255));
        jLabel108.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Computadoras");
        jLabel108.setAlignmentX(5.0F);
        jLabel108.setAlignmentY(0.0F);
        jLabel108.setFocusable(false);
        jLabel108.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 160, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 260, 270));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel21.setText("jLabel20");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 280, 150));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel22.setText("jLabel20");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 270));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel30.setText("jLabel20");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 290, 210));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel34.setText("jLabel20");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 280, 30));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel38.setText("jLabel20");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 280, 130));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Dragon1.png"))); // NOI18N
        jLabel45.setText("jLabel45");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 430, 290));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Dragon2.png"))); // NOI18N
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Imagen1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, 1060, 620));

        javax.swing.GroupLayout squarePanelLayout = new javax.swing.GroupLayout(squarePanel);
        squarePanel.setLayout(squarePanelLayout);
        squarePanelLayout.setHorizontalGroup(
            squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        squarePanelLayout.setVerticalGroup(
            squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MSI", squarePanel);

        nintendoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setBackground(new java.awt.Color(153, 153, 153));
        jLabel111.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(153, 153, 153));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("Totales");
        jLabel111.setAlignmentX(5.0F);
        jLabel111.setAlignmentY(0.0F);
        jLabel111.setFocusable(false);
        jLabel111.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 150, 60));

        cantDlcN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        cantDlcN.setForeground(new java.awt.Color(255, 255, 255));
        cantDlcN.setText("0");
        nintendoPanel.add(cantDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 40, 30));

        jLabel5.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPU");
        nintendoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 30));

        jLabel6.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Memoria ram");
        nintendoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        jLabel7.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuente de alimentacion");
        nintendoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 30));

        jLabel8.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ensambladores");
        nintendoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 30));

        spinnerIntegradorN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerIntegradorNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerIntegradorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 60, -1));

        spinnerNarrativoN.setValue(1);
        spinnerNarrativoN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNarrativoNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerNarrativoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, -1));

        spinnerNivelesN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNivelesNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 60, -1));

        spinnerSpritesN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSpritesNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 60, -1));

        spinnerLogicaN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerLogicaNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerLogicaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 60, -1));

        jLabel9.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Targeta grafica");
        nintendoPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 220, 30));

        spinnerDlcN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDlcNStateChanged(evt);
            }
        });
        nintendoPanel.add(spinnerDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 60, -1));

        jLabel10.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Placas base");
        nintendoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 30));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Juegos con DLC ");
        jLabel12.setAlignmentX(5.0F);
        jLabel12.setAlignmentY(0.0F);
        jLabel12.setFocusable(false);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        jLabel13.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tarjetas graficas");
        nintendoPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 200, 30));

        jLabel15.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Comp con Grafica");
        nintendoPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 190, 30));

        jLabel16.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CPU");
        nintendoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 200, 30));

        jLabel17.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RaM");
        nintendoPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 200, 30));

        jLabel18.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fuentes");
        nintendoPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 200, 30));

        maxGuionesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        maxGuionesN.setForeground(new java.awt.Color(255, 255, 255));
        maxGuionesN.setText("25");
        nintendoPanel.add(maxGuionesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 30, 30));

        diasTotalesN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        diasTotalesN.setForeground(new java.awt.Color(255, 255, 255));
        diasTotalesN.setText("0");
        nintendoPanel.add(diasTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 40, 40));

        readyToShipDLC.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        readyToShipDLC.setForeground(new java.awt.Color(255, 255, 255));
        readyToShipDLC.setText("0");
        nintendoPanel.add(readyToShipDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 70, 30));

        cantSpritesN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        cantSpritesN.setForeground(new java.awt.Color(255, 255, 255));
        cantSpritesN.setText("0");
        nintendoPanel.add(cantSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 40, 30));

        cantSistemasN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        cantSistemasN.setForeground(new java.awt.Color(255, 255, 255));
        cantSistemasN.setText("0");
        nintendoPanel.add(cantSistemasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 40, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Project Manager");
        jLabel3.setAlignmentX(5.0F);
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Almacen");
        jLabel26.setAlignmentX(5.0F);
        jLabel26.setAlignmentY(0.0F);
        jLabel26.setFocusable(false);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 200, 30));

        empleadosApple1.setText("0");
        nintendoPanel.add(empleadosApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Placas base");
        nintendoPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 200, 30));

        fechaEntregaN.setBackground(new java.awt.Color(153, 153, 153));
        fechaEntregaN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        fechaEntregaN.setForeground(new java.awt.Color(153, 153, 153));
        fechaEntregaN.setText("0");
        nintendoPanel.add(fechaEntregaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 60, 30));

        cantNivelesN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        cantNivelesN.setForeground(new java.awt.Color(255, 255, 255));
        cantNivelesN.setText("0");
        nintendoPanel.add(cantNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 40, 30));

        estadoPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
        estadoPmN.setForeground(new java.awt.Color(255, 255, 255));
        estadoPmN.setText("estado");
        nintendoPanel.add(estadoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 160, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Productores");
        jLabel31.setAlignmentX(5.0F);
        jLabel31.setAlignmentY(0.0F);
        jLabel31.setFocusable(false);
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Director");
        jLabel32.setAlignmentX(5.0F);
        jLabel32.setAlignmentY(0.0F);
        jLabel32.setFocusable(false);
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 100, 30));

        jLabel33.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Ganancias en bruto");
        nintendoPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 180, 30));

        descuentoPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
        descuentoPmN.setForeground(new java.awt.Color(255, 255, 255));
        descuentoPmN.setText("0");
        nintendoPanel.add(descuentoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 90, 30));

        faltasPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
        faltasPmN.setForeground(new java.awt.Color(255, 255, 255));
        faltasPmN.setText("0");
        nintendoPanel.add(faltasPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 70, 30));

        jLabel39.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Computadoras");
        nintendoPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 160, 40));

        jLabel40.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Costos operativos");
        nintendoPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 180, 30));

        jLabel41.setBackground(new java.awt.Color(153, 153, 153));
        jLabel41.setFont(new java.awt.Font("Super Mario 256", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Utilidad");
        jLabel41.setAlignmentX(5.0F);
        jLabel41.setAlignmentY(0.0F);
        jLabel41.setFocusable(false);
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 150, 30));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Díias en simulacion ");
        jLabel42.setAlignmentX(5.0F);
        jLabel42.setAlignmentY(0.0F);
        jLabel42.setFocusable(false);
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 230, 40));

        jLabel43.setBackground(new java.awt.Color(153, 153, 153));
        jLabel43.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Dias para la entrega");
        jLabel43.setAlignmentX(5.0F);
        jLabel43.setAlignmentY(0.0F);
        jLabel43.setFocusable(false);
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 120, 30));

        jLabel24.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("de ");
        nintendoPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 30, 30));

        maxNivelesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        maxNivelesN.setForeground(new java.awt.Color(255, 255, 255));
        maxNivelesN.setText("20");
        nintendoPanel.add(maxNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 30, 30));

        jLabel29.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("de ");
        nintendoPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 30, 30));

        maxSpritesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        maxSpritesN.setForeground(new java.awt.Color(255, 255, 255));
        maxSpritesN.setText("55");
        nintendoPanel.add(maxSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 30, 30));

        jLabel44.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("de ");
        nintendoPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 30, 30));

        maxSistemasN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        maxSistemasN.setForeground(new java.awt.Color(255, 255, 255));
        maxSistemasN.setText("35");
        nintendoPanel.add(maxSistemasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 30, 30));

        jLabel46.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("de ");
        nintendoPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 30, 30));

        maxDlcN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        maxDlcN.setForeground(new java.awt.Color(255, 255, 255));
        maxDlcN.setText("10");
        nintendoPanel.add(maxDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, 30, 30));

        jLabel48.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("de ");
        nintendoPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 30, 30));

        jLabel67.setBackground(new java.awt.Color(153, 153, 153));
        jLabel67.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 153, 153));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Juegos");
        jLabel67.setAlignmentX(5.0F);
        jLabel67.setAlignmentY(0.0F);
        jLabel67.setFocusable(false);
        jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 150, 60));

        jLabel68.setBackground(new java.awt.Color(153, 153, 153));
        jLabel68.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(153, 153, 153));
        jLabel68.setText("Juegos entregados");
        jLabel68.setAlignmentX(5.0F);
        jLabel68.setAlignmentY(0.0F);
        jLabel68.setFocusable(false);
        jLabel68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 230, 30));

        gananciasBrutasN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        gananciasBrutasN.setForeground(new java.awt.Color(255, 255, 255));
        gananciasBrutasN.setText("0");
        nintendoPanel.add(gananciasBrutasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 70, 30));

        juegosTotalesN.setBackground(new java.awt.Color(153, 153, 153));
        juegosTotalesN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        juegosTotalesN.setForeground(new java.awt.Color(153, 153, 153));
        juegosTotalesN.setText("0");
        nintendoPanel.add(juegosTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, 40));

        gananciaTotalN.setBackground(new java.awt.Color(153, 153, 153));
        gananciaTotalN.setFont(new java.awt.Font("Super Mario 256", 1, 24)); // NOI18N
        gananciaTotalN.setForeground(new java.awt.Color(255, 255, 255));
        gananciaTotalN.setText("0");
        nintendoPanel.add(gananciaTotalN, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 80, 30));

        historicoDlcN.setBackground(new java.awt.Color(153, 153, 153));
        historicoDlcN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        historicoDlcN.setForeground(new java.awt.Color(153, 153, 153));
        historicoDlcN.setText("0");
        nintendoPanel.add(historicoDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 30, 30));

        historicoJuegosN.setBackground(new java.awt.Color(153, 153, 153));
        historicoJuegosN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
        historicoJuegosN.setForeground(new java.awt.Color(153, 153, 153));
        historicoJuegosN.setText("0");
        nintendoPanel.add(historicoJuegosN, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 30, 30));

        cantGuionesN6.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        cantGuionesN6.setForeground(new java.awt.Color(255, 255, 255));
        cantGuionesN6.setText("0");
        nintendoPanel.add(cantGuionesN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 40, 30));

        costosOpeN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        costosOpeN.setForeground(new java.awt.Color(255, 255, 255));
        costosOpeN.setText("0");
        nintendoPanel.add(costosOpeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 60, 30));

        label.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Faltas");
        nintendoPanel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 70, 30));

        label2.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Dinero descontado");
        nintendoPanel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 140, 30));

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Economíia");
        jLabel73.setAlignmentX(5.0F);
        jLabel73.setAlignmentY(0.0F);
        jLabel73.setFocusable(false);
        jLabel73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 120, 30));

        estadoPmN1.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
        estadoPmN1.setForeground(new java.awt.Color(255, 255, 255));
        estadoPmN1.setText("estado");
        nintendoPanel.add(estadoPmN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 70, 30));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Pretendo", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Para  entregar");
        jLabel35.setAlignmentX(5.0F);
        jLabel35.setAlignmentY(0.0F);
        jLabel35.setFocusable(false);
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nintendoPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 170, 30));

        readyToShip1.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
        readyToShip1.setForeground(new java.awt.Color(255, 255, 255));
        readyToShip1.setText("0");
        nintendoPanel.add(readyToShip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 70, 40));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/apple-5-logo-png-transparent.png"))); // NOI18N
        nintendoPanel.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 100));

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel66.setText("jLabel66");
        nintendoPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 310, 40));

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel69.setText("jLabel66");
        nintendoPanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 260));

        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel96.setText("jLabel66");
        nintendoPanel.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 310, 130));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Blanco.jpg"))); // NOI18N
        jLabel103.setText("jLabel103");
        nintendoPanel.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel109.setText("jLabel66");
        nintendoPanel.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 310, 100));

        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel110.setText("jLabel66");
        nintendoPanel.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 310, 130));

        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel113.setText("jLabel66");
        nintendoPanel.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 310, 160));

        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
        jLabel114.setText("jLabel66");
        nintendoPanel.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 310, 200));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Apple.jpg.png"))); // NOI18N
        jLabel115.setText("jLabel115");
        nintendoPanel.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 100, 1250, 630));

        jTabbedPane1.addTab("APPLE", nintendoPanel);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1010, 756));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void spinnerNarrativoNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadPlacasBaseApple();
            if ((int) this.spinnerNarrativoN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 0, this.initialValues.getDayDuration() * 1000, this.apple.getAlmacen(), this.apple.getDevsMutex(), 20);
                dev.start();
                this.initialValues.setCantidadPlacasBaseApple((int) this.spinnerNarrativoN.getValue());
                apple.getPlacasBaseWorkers().agregarAlFinal(dev);
            } else {
                this.initialValues.setCantidadPlacasBaseApple(this.initialValues.getCantidadPlacasBaseApple() + 1);
                apple.getPlacasBaseWorkers().obtenerNodoUltimo().getDatos().interrupt();
                apple.getPlacasBaseWorkers().eliminarAlFinal();
                this.initialValues.setCantidadPlacasBaseApple((int) this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerNarrativoN, this.spinnerNarrativoN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerNarrativoNStateChanged

    private void spinnerNivelesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadCpuApple();
            if ((int) this.spinnerNivelesN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 1, this.initialValues.getDayDuration() * 1000, apple.getAlmacen(), apple.getDevsMutex(), 26);
                dev.start();
                this.initialValues.setCantidadCpuApple((int) this.spinnerNivelesN.getValue());
                apple.getCpuWorkers().agregarAlFinal(dev);
            } else {
                apple.getCpuWorkers().obtenerNodoUltimo().getDatos().interrupt();
                apple.getCpuWorkers().eliminarAlFinal();
                this.initialValues.setCantidadCpuApple((int) this.spinnerNivelesN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerNivelesN, this.spinnerNivelesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerNivelesNStateChanged

    private void spinnerSpritesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadRamApple();
            if ((int) this.spinnerSpritesN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 2, this.initialValues.getDayDuration() * 1000, apple.getAlmacen(), apple.getDevsMutex(), 40);
                dev.start();
                this.initialValues.setCantidadRamApple((int) this.spinnerSpritesN.getValue());
                apple.getRamWorkers().agregarAlFinal(dev);
            } else {
                apple.getRamWorkers().obtenerNodoUltimo().getDatos().interrupt();
                apple.getRamWorkers().eliminarAlFinal();
                this.initialValues.setCantidadRamApple((int) this.spinnerSpritesN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerSpritesN, this.spinnerSpritesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerSpritesNStateChanged

    private void spinnerLogicaNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadFuentesApple();
            if ((int) this.spinnerLogicaN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 3, this.initialValues.getDayDuration() * 1000, apple.getAlmacen(), apple.getDevsMutex(), 16);
                dev.start();
                this.initialValues.setCantidadFuentesApple((int) this.spinnerLogicaN.getValue());
                apple.getFuentesWorkers().agregarAlFinal(dev);
            } else {
                apple.getFuentesWorkers().obtenerNodoUltimo().getDatos().interrupt();
                apple.getFuentesWorkers().eliminarAlFinal();
                this.initialValues.setCantidadFuentesApple((int) this.spinnerLogicaN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerLogicaN, this.spinnerLogicaN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerLogicaNStateChanged

    private void spinnerDlcNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadGraficasApple();
            if ((int) this.spinnerDlcN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 4, this.initialValues.getDayDuration() * 1000, apple.getAlmacen(), apple.getDevsMutex(), 34);
                dev.start();
                this.initialValues.setCantidadGraficasApple((int) this.spinnerDlcN.getValue());
                apple.getGraficasWorkers().agregarAlFinal(dev);
            } else {
                apple.getGraficasWorkers().obtenerNodoUltimo().getDatos().interrupt();
                apple.getGraficasWorkers().eliminarAlFinal();
                this.initialValues.setCantidadGraficasApple((int) this.spinnerDlcN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerDlcN, this.spinnerDlcN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerDlcNStateChanged

    private void spinnerIntegradorNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorNStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadEnsambladoresApple();
            if ((int) this.spinnerIntegradorN.getValue() > antesCambio) {
                Worker dev = new Worker("Apple", 5, this.initialValues.getDayDuration() * 1000, apple.getAlmacen(), this.apple.getIntegratorsMutex(), 50);
                dev.start();
                this.initialValues.setCantidadEnsambladoresApple((int) this.spinnerIntegradorN.getValue());
                apple.getEnsambladores().agregarAlFinal(dev);
            } else {
                apple.getEnsambladores().obtenerNodoUltimo().getDatos().interrupt();
                apple.getEnsambladores().eliminarAlFinal();
                this.initialValues.setCantidadEnsambladoresApple((int) this.spinnerIntegradorN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
        this.setSameSpinners(this.spinnerIntegradorN, this.spinnerIntegradorN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
    }//GEN-LAST:event_spinnerIntegradorNStateChanged

    private void startSimulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulActionPerformed
        if (this.flag == false) {

            this.initialValues.setDayDuration((int) spinnerDuracion.getValue());
            this.initialValues.setDeadline((int) spinnerDeadline.getValue());

            this.initialValues.setCantidadPlacasBaseApple((int) spinnerNarrativoN1.getValue());
            this.initialValues.setCantidadCpuApple((int) spinnerNivelesN1.getValue());
            this.initialValues.setCantidadRamApple((int) spinnerSpritesN1.getValue());
            this.initialValues.setCantidadFuentesApple((int) spinnerLogicaN1.getValue());
            this.initialValues.setCantidadGraficasApple((int) spinnerDlcN1.getValue());
            this.initialValues.setCantidadEnsambladoresApple((int) spinnerIntegradorN1.getValue());

            this.initialValues.setCantidadPlacasBaseMSI((int) spinnerNarrativoN2.getValue());
            this.initialValues.setCantidadCpuMSI((int) spinnerNivelesN2.getValue());
            this.initialValues.setCantidadRamMSI((int) spinnerSpritesN2.getValue());
            this.initialValues.setCantidadFuentesMSI((int) spinnerLogicaN2.getValue());
            this.initialValues.setCantidadGraficasMSI((int) spinnerDlcN2.getValue());
            this.initialValues.setCantidadEnsambladoresMSI((int) spinnerIntegradorN2.getValue());

            initialValues.escribirTXT();

            apple = new Simulation(7, initialValues.getDayDuration() * 1000, initialValues.getDeadline(), initialValues.getCantidadPlacasBaseApple(), initialValues.getCantidadCpuApple(), initialValues.getCantidadRamApple(), initialValues.getCantidadFuentesApple(), initialValues.getCantidadGraficasApple(), initialValues.getCantidadEnsambladoresApple(), "Apple");
            msi = new Simulation(9, initialValues.getDayDuration() * 1000, initialValues.getDeadline(), initialValues.getCantidadPlacasBaseMSI(), initialValues.getCantidadCpuMSI(), initialValues.getCantidadRamMSI(), initialValues.getCantidadFuentesMSI(), initialValues.getCantidadGraficasMSI(), initialValues.getCantidadEnsambladoresMSI(), "MSI");
            apple.start();
            msi.start();
            this.flag = true;
        }
    }//GEN-LAST:event_startSimulActionPerformed

    private void txtSimuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimuActionPerformed
        if (this.flag == false) {

            String path = "";
            try {
                JFileChooser archivo = new JFileChooser();
                archivo.showOpenDialog(archivo);
                path = archivo.getSelectedFile().getAbsolutePath();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el archivo, se procedera a cargar uno archivo por default");
                path = "test\\parametros.txt";
            }

            initialValues.leerTXT(path);
            spinnerDuracion.setValue((int) initialValues.getDayDuration());
            spinnerDeadline.setValue((int) initialValues.getDeadline());
            spinnerNarrativoN1.setValue((int) initialValues.getCantidadPlacasBaseApple());
            spinnerNivelesN1.setValue((int) initialValues.getCantidadCpuApple());
            spinnerSpritesN1.setValue((int) initialValues.getCantidadRamApple());
            spinnerLogicaN1.setValue((int) initialValues.getCantidadFuentesApple());
            spinnerDlcN1.setValue((int) initialValues.getCantidadGraficasApple());
            spinnerIntegradorN1.setValue((int) initialValues.getCantidadEnsambladoresApple());
            spinnerNarrativoN2.setValue((int) initialValues.getCantidadPlacasBaseMSI());
            spinnerNivelesN2.setValue((int) initialValues.getCantidadCpuMSI());
            spinnerSpritesN2.setValue((int) initialValues.getCantidadRamMSI());
            spinnerLogicaN2.setValue((int) initialValues.getCantidadFuentesMSI());
            spinnerDlcN2.setValue((int) initialValues.getCantidadGraficasMSI());
            spinnerIntegradorN2.setValue((int) initialValues.getCantidadEnsambladoresMSI());
        }
    }//GEN-LAST:event_txtSimuActionPerformed

    private void spinnerIntegradorN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerIntegradorN1, this.spinnerIntegradorN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerIntegradorN1StateChanged

    private void spinnerNarrativoN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerNarrativoN1, this.spinnerNarrativoN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerNarrativoN1StateChanged

    private void spinnerNivelesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerNivelesN1, this.spinnerNivelesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerNivelesN1StateChanged

    private void spinnerSpritesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerSpritesN1, this.spinnerSpritesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerSpritesN1StateChanged

    private void spinnerLogicaN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerLogicaN1, this.spinnerLogicaN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerLogicaN1StateChanged

    private void spinnerDlcN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1, this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, this.maxEmpleadosApple, this.empleadosApple1);
        this.setSameSpinners(this.spinnerDlcN1, this.spinnerDlcN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN, this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, this.maxEmpleadosApple, this.empleadosApple);
    }//GEN-LAST:event_spinnerDlcN1StateChanged

    private void spinnerIntegradorN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerIntegradorN2, this.spinnerIntegradorS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerIntegradorN2StateChanged

    private void spinnerNarrativoN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerNarrativoN2, this.spinnerNarrativoS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerNarrativoN2StateChanged

    private void spinnerNivelesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerNivelesN2, this.spinnerNivelesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerNivelesN2StateChanged

    private void spinnerSpritesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerSpritesN2, this.spinnerSpritesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerSpritesN2StateChanged

    private void spinnerLogicaN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerLogicaN2, this.spinnerLogicaS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerLogicaN2StateChanged

    private void spinnerDlcN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
        this.setSameSpinners(this.spinnerDlcN2, this.spinnerDlcS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
    }//GEN-LAST:event_spinnerDlcN2StateChanged

    private void spinnerIntegradorSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadEnsambladoresMSI();
            if ((int) this.spinnerIntegradorS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 5, this.initialValues.getDayDuration() * 1000, msi.getAlmacen(), this.msi.getIntegratorsMutex(), 50);
                dev.start();
                this.initialValues.setCantidadEnsambladoresMSI((int) this.spinnerIntegradorS.getValue());
                msi.getEnsambladores().agregarAlFinal(dev);
            } else {
                msi.getEnsambladores().obtenerNodoUltimo().getDatos().interrupt();
                msi.getEnsambladores().eliminarAlFinal();
                this.initialValues.setCantidadEnsambladoresMSI((int) this.spinnerIntegradorS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerIntegradorS, this.spinnerIntegradorN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);

    }//GEN-LAST:event_spinnerIntegradorSStateChanged

    private void spinnerNarrativoSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadPlacasBaseMSI();
            if ((int) this.spinnerNarrativoS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 0, this.initialValues.getDayDuration() * 1000, this.msi.getAlmacen(), this.msi.getDevsMutex(), 20);
                dev.start();
                this.initialValues.setCantidadPlacasBaseMSI((int) this.spinnerNarrativoS.getValue());
                msi.getPlacasBaseWorkers().agregarAlFinal(dev);
            } else {
                this.initialValues.setCantidadPlacasBaseMSI(this.initialValues.getCantidadPlacasBaseMSI() + 1);
                msi.getPlacasBaseWorkers().obtenerNodoUltimo().getDatos().interrupt();
                msi.getPlacasBaseWorkers().eliminarAlFinal();
                this.initialValues.setCantidadPlacasBaseMSI((int) this.spinnerNarrativoS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerNarrativoS, this.spinnerNarrativoN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
    }//GEN-LAST:event_spinnerNarrativoSStateChanged

    private void spinnerNivelesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadCpuMSI();
            if ((int) this.spinnerNivelesS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 1, this.initialValues.getDayDuration() * 1000, msi.getAlmacen(), msi.getDevsMutex(), 26);
                dev.start();
                this.initialValues.setCantidadCpuMSI((int) this.spinnerNivelesS.getValue());
                msi.getCpuWorkers().agregarAlFinal(dev);
            } else {
                msi.getCpuWorkers().obtenerNodoUltimo().getDatos().interrupt();
                msi.getCpuWorkers().eliminarAlFinal();
                this.initialValues.setCantidadCpuMSI((int) this.spinnerNivelesS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerNivelesS, this.spinnerNivelesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);
    }//GEN-LAST:event_spinnerNivelesSStateChanged

    private void spinnerSpritesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {
            int antesCambio = this.initialValues.getCantidadRamMSI();
            if ((int) this.spinnerSpritesS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 2, this.initialValues.getDayDuration() * 1000, msi.getAlmacen(), msi.getDevsMutex(), 40);
                dev.start();
                this.initialValues.setCantidadRamMSI((int) this.spinnerSpritesS.getValue());
                msi.getRamWorkers().agregarAlFinal(dev);
            } else {
                msi.getRamWorkers().obtenerNodoUltimo().getDatos().interrupt();
                msi.getRamWorkers().eliminarAlFinal();
                this.initialValues.setCantidadRamMSI((int) this.spinnerSpritesS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerSpritesS, this.spinnerSpritesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);

    }//GEN-LAST:event_spinnerSpritesSStateChanged

    private void spinnerLogicaSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {

            int antesCambio = this.initialValues.getCantidadFuentesMSI();
            if ((int) this.spinnerLogicaS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 3, this.initialValues.getDayDuration() * 1000, msi.getAlmacen(), msi.getDevsMutex(), 16);
                dev.start();
                this.initialValues.setCantidadFuentesMSI((int) this.spinnerLogicaS.getValue());
                msi.getFuentesWorkers().agregarAlFinal(dev);
            } else {
                msi.getFuentesWorkers().obtenerNodoUltimo().getDatos().interrupt();
                msi.getFuentesWorkers().eliminarAlFinal();
                this.initialValues.setCantidadFuentesMSI((int) this.spinnerLogicaS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerLogicaS, this.spinnerLogicaN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);

    }//GEN-LAST:event_spinnerLogicaSStateChanged

    private void spinnerDlcSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcSStateChanged
        // TODO add your handling code here:
        if (this.flag == true) {
            int antesCambio = this.initialValues.getCantidadGraficasMSI();
            if ((int) this.spinnerDlcS.getValue() > antesCambio) {
                Worker dev = new Worker("MSI", 4, this.initialValues.getDayDuration() * 1000, msi.getAlmacen(), msi.getDevsMutex(), 34);
                dev.start();
                this.initialValues.setCantidadGraficasMSI((int) this.spinnerDlcS.getValue());
                msi.getGraficasWorkers().agregarAlFinal(dev);
            } else {
                msi.getGraficasWorkers().obtenerNodoUltimo().getDatos().interrupt();
                msi.getGraficasWorkers().eliminarAlFinal();
                this.initialValues.setCantidadGraficasMSI((int) this.spinnerDlcS.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS, this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, this.maxEmpleadosMSI, this.empleadosMSI1);
        this.setSameSpinners(this.spinnerDlcS, this.spinnerDlcN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2, this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, this.maxEmpleadosMSI, this.empleadosMSI);

    }//GEN-LAST:event_spinnerDlcSStateChanged

    private void spinnerDuracionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDuracionStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_spinnerDuracionStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        grafica.graficar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardBueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardBueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardBueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardBueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardBueno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private static javax.swing.JLabel cantDlcN;
    private static javax.swing.JLabel cantDlcS;
    private static javax.swing.JLabel cantGuionesN6;
    private static javax.swing.JLabel cantGuionesS;
    private static javax.swing.JLabel cantNivelesN;
    private static javax.swing.JLabel cantNivelesS;
    private static javax.swing.JLabel cantSistemasN;
    private static javax.swing.JLabel cantSistemasS;
    private static javax.swing.JLabel cantSpritesN;
    private static javax.swing.JLabel cantSpritesS;
    private static javax.swing.JLabel costosOpeN;
    private static javax.swing.JLabel costosOpeS;
    private static javax.swing.JLabel descuentoPmN;
    private static javax.swing.JLabel descuentoPmS;
    private static javax.swing.JLabel diasTotalesN;
    private static javax.swing.JLabel diasTotalesSq;
    private javax.swing.JLabel empleadosApple;
    private javax.swing.JLabel empleadosApple1;
    private javax.swing.JLabel empleadosMSI;
    private javax.swing.JLabel empleadosMSI1;
    private static javax.swing.JLabel estadoDirectorS;
    private static javax.swing.JLabel estadoPmN;
    private static javax.swing.JLabel estadoPmN1;
    private static javax.swing.JLabel estadoPmS;
    private static javax.swing.JLabel faltasPmN;
    private static javax.swing.JLabel faltasPmS;
    private static javax.swing.JLabel fechaEntregaN;
    private static javax.swing.JLabel fechaEntregaSq;
    private static javax.swing.JLabel gananciaTotalN;
    private static javax.swing.JLabel gananciaTotalSq;
    private static javax.swing.JLabel gananciasBrutasN;
    private static javax.swing.JLabel gananciasBrutasS;
    private static javax.swing.JLabel historicoDlcN;
    private static javax.swing.JLabel historicoDlcSq;
    private static javax.swing.JLabel historicoJuegosN;
    private static javax.swing.JLabel historicoJuegosSq;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JLabel juegosTotalesN;
    private static javax.swing.JLabel juegosTotalesSq;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel maxDlcN;
    private javax.swing.JLabel maxDlcS;
    private javax.swing.JLabel maxGuionesN;
    private javax.swing.JLabel maxGuionesS;
    private javax.swing.JLabel maxNivelesN;
    private javax.swing.JLabel maxNivelesS;
    private javax.swing.JLabel maxSistemasN;
    private javax.swing.JLabel maxSistemasS;
    private javax.swing.JLabel maxSpritesN;
    private javax.swing.JLabel maxSpritesS;
    private javax.swing.JPanel nintendoPanel;
    private static javax.swing.JLabel readyToShip1;
    private static javax.swing.JLabel readyToShipDLC;
    private static javax.swing.JLabel readyToShipDLCSq;
    private static javax.swing.JLabel readyToShipSq;
    private javax.swing.JSpinner spinnerDeadline;
    private javax.swing.JSpinner spinnerDlcN;
    private javax.swing.JSpinner spinnerDlcN1;
    private javax.swing.JSpinner spinnerDlcN2;
    private javax.swing.JSpinner spinnerDlcS;
    private javax.swing.JSpinner spinnerDuracion;
    private javax.swing.JSpinner spinnerIntegradorN;
    private javax.swing.JSpinner spinnerIntegradorN1;
    private javax.swing.JSpinner spinnerIntegradorN2;
    private javax.swing.JSpinner spinnerIntegradorS;
    private javax.swing.JSpinner spinnerLogicaN;
    private javax.swing.JSpinner spinnerLogicaN1;
    private javax.swing.JSpinner spinnerLogicaN2;
    private javax.swing.JSpinner spinnerLogicaS;
    private javax.swing.JSpinner spinnerNarrativoN;
    private javax.swing.JSpinner spinnerNarrativoN1;
    private javax.swing.JSpinner spinnerNarrativoN2;
    private javax.swing.JSpinner spinnerNarrativoS;
    private javax.swing.JSpinner spinnerNivelesN;
    private javax.swing.JSpinner spinnerNivelesN1;
    private javax.swing.JSpinner spinnerNivelesN2;
    private javax.swing.JSpinner spinnerNivelesS;
    private javax.swing.JSpinner spinnerSpritesN;
    private javax.swing.JSpinner spinnerSpritesN1;
    private javax.swing.JSpinner spinnerSpritesN2;
    private javax.swing.JSpinner spinnerSpritesS;
    private javax.swing.JPanel squarePanel;
    private javax.swing.JButton startSimul;
    private javax.swing.JButton txtSimu;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the grafica
     */
    public Grafica getGrafica() {
        return grafica;
    }

    /**
     * @param grafica the grafica to set
     */
    public void setGrafica(Grafica grafica) {
        this.grafica = grafica;
    }
}
