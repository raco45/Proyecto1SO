/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Developer.Developer;
import classes.InitialValues;
import classes.Simulation;
import classes.Tools;
import javax.management.timer.Timer;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author raco1
 */
public class Dashboard extends javax.swing.JFrame {

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
        return  cantGuionesS;
    }

  
    
    // Es 7 ya que ambos tenemos el mismo ultimo numero de carnet
    InitialValues initialValues = new InitialValues(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    Simulation nintendo;
    Simulation square;
    boolean flag=false;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        this.verifySpinners();
        //Spinners desarroladores ventana Nintendo
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
        this.spinnerNarrativoN2.setModel(this.verifySpinners());
        this.spinnerLogicaN2.setModel(this.verifySpinners());
        this.spinnerDlcN2.setModel(this.verifySpinners());
        this.spinnerSpritesN2.setModel(this.verifySpinners());
        this.spinnerNivelesN2.setModel(this.verifySpinners());
        this.spinnerIntegradorN2.setModel(this.verifySpinners());
        //spinners desarrolladores ventana Square
        this.spinnerNarrativoS.setModel(this.verifySpinners());
        this.spinnerLogicaS.setModel(this.verifySpinners());
        this.spinnerDlcS.setModel(this.verifySpinners());
        this.spinnerSpritesS.setModel(this.verifySpinners());
        this.spinnerNivelesS.setModel(this.verifySpinners());
        this.spinnerIntegradorS.setModel(this.verifySpinners());
        
        this.spinnerDuracion.setModel(this.verifySpinners());
        this.spinnerDeadline.setModel(this.verifySpinners());
    }
    
    
    public SpinnerNumberModel verifySpinners(){
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(17);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
        return modeloSpinner;      
        }
    
    public void checkCantEmpleados(JSpinner narrativa, JSpinner niveles, JSpinner sprites, JSpinner logica, JSpinner dlc, JSpinner integrador, int maxEmpleados){
        int narra= (int) narrativa.getValue();
        int nive= (int) niveles.getValue();
        int spri= (int) sprites.getValue();
        int log= (int) logica.getValue();
        int dlcs= (int) dlc.getValue();
        int inte= (int) integrador.getValue();
        int sum= narra+ nive+ spri+ log+dlcs+inte;
        if(sum == maxEmpleados){
            this.setMaxSpinn(narrativa, narra);
            this.setMaxSpinn(niveles, nive);
            this.setMaxSpinn(sprites, spri);
            this.setMaxSpinn(logica, log);
            this.setMaxSpinn(dlc, dlcs);
            this.setMaxSpinn(integrador, inte);
        }else{
            int resta= maxEmpleados - sum;
            this.setMaxSpinn(narrativa, narra+resta);
            this.setMaxSpinn(niveles, nive+resta);
            this.setMaxSpinn(sprites, spri+resta);
            this.setMaxSpinn(logica, log+resta);
            this.setMaxSpinn(dlc, dlcs+resta);
            this.setMaxSpinn(integrador, inte+resta);
        }
        
    }
    public void setMaxSpinn(JSpinner current, int max){
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(max);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue((int) current.getValue());
        current.setModel(modeloSpinner);
    }    
    public void setSameSpinners(JSpinner current, JSpinner arrival){
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
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        spinnerIntegradorN2 = new javax.swing.JSpinner();
        spinnerNarrativoN2 = new javax.swing.JSpinner();
        spinnerNivelesN2 = new javax.swing.JSpinner();
        spinnerSpritesN2 = new javax.swing.JSpinner();
        spinnerLogicaN2 = new javax.swing.JSpinner();
        spinnerDlcN2 = new javax.swing.JSpinner();
        jLabel66 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        squarePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        cantDlcS = new javax.swing.JLabel();
        spinnerIntegradorS = new javax.swing.JSpinner();
        spinnerNarrativoS = new javax.swing.JSpinner();
        spinnerNivelesS = new javax.swing.JSpinner();
        spinnerSpritesS = new javax.swing.JSpinner();
        spinnerLogicaS = new javax.swing.JSpinner();
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
        jLabel122 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        nintendoPanel = new javax.swing.JPanel();
        cantDlcN = new javax.swing.JLabel();
        spinnerIntegradorN = new javax.swing.JSpinner();
        spinnerNarrativoN = new javax.swing.JSpinner();
        spinnerNivelesN = new javax.swing.JSpinner();
        spinnerSpritesN = new javax.swing.JSpinner();
        spinnerLogicaN = new javax.swing.JSpinner();
        spinnerDlcN = new javax.swing.JSpinner();
        diasTotalesN = new javax.swing.JLabel();
        readyToShipDLC = new javax.swing.JLabel();
        cantSpritesN = new javax.swing.JLabel();
        cantSistemasN = new javax.swing.JLabel();
        fechaEntregaN = new javax.swing.JLabel();
        cantNivelesN = new javax.swing.JLabel();
        estadoPmN = new javax.swing.JLabel();
        descuentoPmN = new javax.swing.JLabel();
        faltasPmN = new javax.swing.JLabel();
        gananciasBrutasN = new javax.swing.JLabel();
        juegosTotalesN = new javax.swing.JLabel();
        gananciaTotalN = new javax.swing.JLabel();
        historicoDlcN = new javax.swing.JLabel();
        historicoJuegosN = new javax.swing.JLabel();
        cantGuionesN6 = new javax.swing.JLabel();
        costosOpeN = new javax.swing.JLabel();
        estadoPmN1 = new javax.swing.JLabel();
        readyToShip1 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        maxGuionesS1 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        maxNivelesS1 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        maxSpritesS1 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        maxSistemasS1 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        maxDlcS1 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        jLabel102.setText("jLabel102");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Pretendo", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
        jLabel45.setAlignmentX(5.0F);
        jLabel45.setAlignmentY(0.0F);
        jLabel45.setFocusable(false);
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 290, 110));

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Un software de Ricardo  y Christian");
        adminPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 360, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("grafica \\");
            jScrollPane1.setViewportView(jTextArea1);

            adminPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 610, 360));
            adminPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1010, -1));

            jLabel4.setFont(new java.awt.Font("Haettenschweiler", 2, 48)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(204, 204, 0));
            jLabel4.setText("Dashboard");
            adminPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 60));

            startSimul.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
            startSimul.setText("Iniciar");
            startSimul.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    startSimulActionPerformed(evt);
                }
            });
            adminPanel.add(startSimul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 30));

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
            adminPanel.add(spinnerDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 20));
            adminPanel.add(spinnerDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 20));

            jLabel49.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel49.setForeground(new java.awt.Color(0, 0, 0));
            jLabel49.setText("CPU");
            adminPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 200, 30));

            jLabel50.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel50.setForeground(new java.awt.Color(0, 0, 0));
            jLabel50.setText("Memoria RAM");
            adminPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 200, 30));

            jLabel51.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel51.setForeground(new java.awt.Color(0, 0, 0));
            jLabel51.setText("Fuentes de Alimentación");
            adminPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 200, 30));

            jLabel52.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel52.setForeground(new java.awt.Color(0, 0, 0));
            jLabel52.setText("Ensambladores");
            adminPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 200, 30));

            spinnerIntegradorN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerIntegradorN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 60, -1));

            spinnerNarrativoN1.setValue(1);
            spinnerNarrativoN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNarrativoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 60, -1));

            spinnerNivelesN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNivelesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 60, -1));

            spinnerSpritesN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerSpritesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 60, -1));

            spinnerLogicaN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerLogicaN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 60, -1));

            jLabel53.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel53.setForeground(new java.awt.Color(0, 0, 0));
            jLabel53.setText("Tarjetas Gráficas");
            adminPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 200, 30));

            spinnerDlcN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerDlcN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 60, -1));

            jLabel55.setBackground(new java.awt.Color(255, 255, 255));
            jLabel55.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel55.setForeground(new java.awt.Color(153, 153, 0));
            jLabel55.setText("Trabajadores Disponibles");
            jLabel55.setAlignmentX(5.0F);
            jLabel55.setAlignmentY(0.0F);
            jLabel55.setFocusable(false);
            jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 190, 30));

            jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel56.setForeground(new java.awt.Color(255, 255, 255));
            jLabel56.setText("PARÁMETROS DE LA SIMULACIÓN");
            adminPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, -1));

            jLabel57.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
            jLabel57.setForeground(new java.awt.Color(153, 153, 0));
            jLabel57.setText("0");
            adminPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 20, 30));

            jLabel58.setBackground(new java.awt.Color(255, 255, 255));
            jLabel58.setFont(new java.awt.Font("BankGothic-Medium", 1, 24)); // NOI18N
            jLabel58.setForeground(new java.awt.Color(255, 0, 0));
            jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/apple-5-logo-png-transparent.png"))); // NOI18N
            jLabel58.setAlignmentX(5.0F);
            jLabel58.setAlignmentY(0.0F);
            jLabel58.setFocusable(false);
            jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 300, 120));

            spinnerIntegradorN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerIntegradorN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 690, 60, -1));

            spinnerNarrativoN2.setValue(1);
            spinnerNarrativoN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNarrativoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 60, -1));

            spinnerNivelesN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNivelesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 60, -1));

            spinnerSpritesN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerSpritesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, 60, -1));

            spinnerLogicaN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerLogicaN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 60, -1));

            spinnerDlcN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerDlcN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 60, -1));

            jLabel66.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
            jLabel66.setForeground(new java.awt.Color(153, 153, 0));
            jLabel66.setText("0");
            adminPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 20, 30));

            jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/dashborad_logo.png"))); // NOI18N
            adminPanel.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 60));

            jLabel113.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel113.setForeground(new java.awt.Color(0, 0, 0));
            jLabel113.setText("Placas Bases");
            adminPanel.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 100, 30));

            jLabel115.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel115.setForeground(new java.awt.Color(0, 0, 0));
            jLabel115.setText("Productores");
            adminPanel.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 200, 30));

            jLabel54.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel54.setForeground(new java.awt.Color(0, 0, 0));
            jLabel54.setText("Ensambladores");
            adminPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 680, 200, 30));

            jLabel116.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel116.setForeground(new java.awt.Color(0, 0, 0));
            jLabel116.setText("Tarjetas Gráficas");
            adminPanel.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 200, 30));

            jLabel117.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel117.setForeground(new java.awt.Color(0, 0, 0));
            jLabel117.setText("Fuentes de Alimentación");
            adminPanel.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 200, 30));

            jLabel118.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel118.setForeground(new java.awt.Color(0, 0, 0));
            jLabel118.setText("Memoria RAM");
            adminPanel.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 200, 30));

            jLabel119.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel119.setForeground(new java.awt.Color(0, 0, 0));
            jLabel119.setText("CPU");
            adminPanel.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 200, 30));

            jLabel120.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel120.setForeground(new java.awt.Color(0, 0, 0));
            jLabel120.setText("Placas Bases");
            adminPanel.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 100, 30));

            jLabel121.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel121.setForeground(new java.awt.Color(0, 0, 0));
            jLabel121.setText("Productores");
            adminPanel.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 200, 30));

            jLabel67.setBackground(new java.awt.Color(255, 255, 255));
            jLabel67.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel67.setForeground(new java.awt.Color(153, 153, 0));
            jLabel67.setText("Trabajadores Disponibles");
            jLabel67.setAlignmentX(5.0F);
            jLabel67.setAlignmentY(0.0F);
            jLabel67.setFocusable(false);
            jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 190, 30));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/OS.png"))); // NOI18N
            adminPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel26.setText("jLabel21");
            adminPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 180));

            jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/black.jpg"))); // NOI18N
            jLabel41.setText("jLabel37");
            adminPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 80));

            jLabel8.setForeground(new java.awt.Color(153, 153, 0));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/OS_wallpaper.jpg"))); // NOI18N
            adminPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -40, 2360, 890));

            jTabbedPane1.addTab("Admin", adminPanel);

            jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
            jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1030, 10));

            cantDlcS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            cantDlcS.setForeground(new java.awt.Color(255, 255, 255));
            cantDlcS.setText("0");
            jPanel2.add(cantDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 40, 30));

            spinnerIntegradorS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerIntegradorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 60, -1));

            spinnerNarrativoS.setValue(1);
            spinnerNarrativoS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerNarrativoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 60, -1));

            spinnerNivelesS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 60, -1));

            spinnerSpritesS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, -1));

            spinnerLogicaS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerLogicaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 60, -1));

            spinnerDlcS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, -1));

            jLabel71.setBackground(new java.awt.Color(255, 255, 255));
            jLabel71.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel71.setForeground(new java.awt.Color(0, 0, 0));
            jLabel71.setText("Tarjetas Gráficas anexadas");
            jLabel71.setAlignmentX(5.0F);
            jLabel71.setAlignmentY(0.0F);
            jLabel71.setFocusable(false);
            jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 240, 30));

            jLabel72.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel72.setForeground(new java.awt.Color(255, 255, 255));
            jLabel72.setText("Tarjetas Gráficas");
            jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, 200, 30));

            jLabel74.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel74.setForeground(new java.awt.Color(255, 255, 255));
            jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel74.setText("Tarjetas gráficas");
            jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 130, 30));

            jLabel75.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel75.setForeground(new java.awt.Color(255, 255, 255));
            jLabel75.setText("CPU");
            jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 80, 30));

            jLabel76.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel76.setForeground(new java.awt.Color(255, 255, 255));
            jLabel76.setText("Memorias RAM");
            jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, 200, 30));

            jLabel77.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel77.setForeground(new java.awt.Color(255, 255, 255));
            jLabel77.setText("Fuentes Alimentación");
            jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, 200, 30));

            maxGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxGuionesS.setForeground(new java.awt.Color(255, 255, 255));
            maxGuionesS.setText("25");
            jPanel2.add(maxGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 30, 30));

            diasTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
            diasTotalesSq.setForeground(new java.awt.Color(255, 255, 255));
            diasTotalesSq.setText("0");
            jPanel2.add(diasTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 40, 30));

            readyToShipDLCSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            readyToShipDLCSq.setForeground(new java.awt.Color(255, 255, 255));
            readyToShipDLCSq.setText("0");
            jPanel2.add(readyToShipDLCSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 40, 30));

            cantSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            cantSpritesS.setForeground(new java.awt.Color(255, 255, 255));
            cantSpritesS.setText("0");
            jPanel2.add(cantSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 40, 30));

            cantSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            cantSistemasS.setForeground(new java.awt.Color(255, 255, 255));
            cantSistemasS.setText("0");
            jPanel2.add(cantSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 40, 30));

            jLabel78.setBackground(new java.awt.Color(255, 255, 255));
            jLabel78.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel78.setForeground(new java.awt.Color(255, 255, 255));
            jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel78.setText("PROJECT MANAGER");
            jLabel78.setAlignmentX(5.0F);
            jLabel78.setAlignmentY(0.0F);
            jLabel78.setFocusable(false);
            jLabel78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 30));

            jLabel79.setBackground(new java.awt.Color(255, 255, 255));
            jLabel79.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel79.setForeground(new java.awt.Color(255, 255, 255));
            jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel79.setText("ALMACEN");
            jLabel79.setAlignmentX(5.0F);
            jLabel79.setAlignmentY(0.0F);
            jLabel79.setFocusable(false);
            jLabel79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 260, 30));

            jLabel80.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel80.setForeground(new java.awt.Color(255, 255, 255));
            jLabel80.setText("Placas Base");
            jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 90, 30));

            fechaEntregaSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            fechaEntregaSq.setForeground(new java.awt.Color(0, 0, 0));
            fechaEntregaSq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fechaEntregaSq.setText("0");
            jPanel2.add(fechaEntregaSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 160, 30));

            cantNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            cantNivelesS.setForeground(new java.awt.Color(255, 255, 255));
            cantNivelesS.setText("0");
            jPanel2.add(cantNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 40, 30));

            jLabel81.setBackground(new java.awt.Color(0, 0, 0));
            jLabel81.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel81.setForeground(new java.awt.Color(204, 204, 204));
            jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel81.setText("EMPLEADOS");
            jLabel81.setAlignmentX(5.0F);
            jLabel81.setAlignmentY(0.0F);
            jLabel81.setFocusable(false);
            jLabel81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 30));

            jLabel82.setBackground(new java.awt.Color(255, 255, 255));
            jLabel82.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel82.setForeground(new java.awt.Color(255, 255, 255));
            jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel82.setText("DIRECTOR");
            jLabel82.setAlignmentX(5.0F);
            jLabel82.setAlignmentY(0.0F);
            jLabel82.setFocusable(false);
            jLabel82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 30));

            estadoDirectorS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            estadoDirectorS.setForeground(new java.awt.Color(255, 255, 255));
            estadoDirectorS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            estadoDirectorS.setText("Estado");
            jPanel2.add(estadoDirectorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 190, 30));

            jLabel83.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel83.setForeground(new java.awt.Color(255, 255, 255));
            jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel83.setText("Ganancias en bruto");
            jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 180, 30));

            estadoPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            estadoPmS.setForeground(new java.awt.Color(255, 255, 255));
            estadoPmS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            estadoPmS.setText("Estado");
            jPanel2.add(estadoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 170, 30));

            descuentoPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            descuentoPmS.setForeground(new java.awt.Color(255, 255, 255));
            descuentoPmS.setText("0");
            jPanel2.add(descuentoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 80, 30));

            faltasPmS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            faltasPmS.setForeground(new java.awt.Color(255, 255, 255));
            faltasPmS.setText("0");
            jPanel2.add(faltasPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 70, 30));

            jLabel84.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel84.setForeground(new java.awt.Color(255, 255, 255));
            jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel84.setText("Computadoras");
            jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 110, 30));

            jLabel85.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel85.setForeground(new java.awt.Color(255, 255, 255));
            jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel85.setText("Costos operativos");
            jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 200, 30));

            jLabel86.setBackground(new java.awt.Color(255, 255, 255));
            jLabel86.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
            jLabel86.setForeground(new java.awt.Color(255, 255, 255));
            jLabel86.setText("Utilidad");
            jLabel86.setAlignmentX(5.0F);
            jLabel86.setAlignmentY(0.0F);
            jLabel86.setFocusable(false);
            jLabel86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 120, 50));

            jLabel87.setBackground(new java.awt.Color(255, 255, 255));
            jLabel87.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel87.setForeground(new java.awt.Color(255, 255, 255));
            jLabel87.setText("Día trascurridos");
            jLabel87.setAlignmentX(5.0F);
            jLabel87.setAlignmentY(0.0F);
            jLabel87.setFocusable(false);
            jLabel87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 170, 30));

            jLabel88.setBackground(new java.awt.Color(255, 255, 255));
            jLabel88.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel88.setForeground(new java.awt.Color(0, 0, 0));
            jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel88.setText("Días para la entrega");
            jLabel88.setAlignmentX(5.0F);
            jLabel88.setAlignmentY(0.0F);
            jLabel88.setFocusable(false);
            jLabel88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 180, 30));

            jLabel89.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel89.setForeground(new java.awt.Color(255, 255, 255));
            jLabel89.setText("de ");
            jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 30, 30));

            maxNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxNivelesS.setForeground(new java.awt.Color(255, 255, 255));
            maxNivelesS.setText("20");
            jPanel2.add(maxNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 30, 30));

            jLabel90.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel90.setForeground(new java.awt.Color(255, 255, 255));
            jLabel90.setText("de ");
            jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 30, 30));

            maxSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSpritesS.setForeground(new java.awt.Color(255, 255, 255));
            maxSpritesS.setText("55");
            jPanel2.add(maxSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 30, 30));

            jLabel91.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel91.setForeground(new java.awt.Color(255, 255, 255));
            jLabel91.setText("de ");
            jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 30, 30));

            maxSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSistemasS.setForeground(new java.awt.Color(255, 255, 255));
            maxSistemasS.setText("35");
            jPanel2.add(maxSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 640, 30, 30));

            jLabel92.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel92.setForeground(new java.awt.Color(255, 255, 255));
            jLabel92.setText("de ");
            jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 30, 30));

            maxDlcS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxDlcS.setForeground(new java.awt.Color(255, 255, 255));
            maxDlcS.setText("10");
            jPanel2.add(maxDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, 30, 30));

            jLabel93.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel93.setForeground(new java.awt.Color(255, 255, 255));
            jLabel93.setText("de ");
            jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 30, 30));

            jLabel94.setBackground(new java.awt.Color(255, 255, 255));
            jLabel94.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel94.setForeground(new java.awt.Color(0, 0, 0));
            jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel94.setText("totales");
            jLabel94.setAlignmentX(5.0F);
            jLabel94.setAlignmentY(0.0F);
            jLabel94.setFocusable(false);
            jLabel94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 160, 30));

            jLabel95.setBackground(new java.awt.Color(255, 255, 255));
            jLabel95.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel95.setForeground(new java.awt.Color(0, 0, 0));
            jLabel95.setText("Computadoras ensambladas");
            jLabel95.setAlignmentX(5.0F);
            jLabel95.setAlignmentY(0.0F);
            jLabel95.setFocusable(false);
            jLabel95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 240, 30));

            gananciasBrutasS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            gananciasBrutasS.setForeground(new java.awt.Color(255, 255, 255));
            gananciasBrutasS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            gananciasBrutasS.setText("0");
            jPanel2.add(gananciasBrutasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 50, 30));

            juegosTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            juegosTotalesSq.setForeground(new java.awt.Color(0, 0, 0));
            juegosTotalesSq.setText("0");
            jPanel2.add(juegosTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 30, 30));

            gananciaTotalSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
            gananciaTotalSq.setForeground(new java.awt.Color(255, 255, 255));
            gananciaTotalSq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            gananciaTotalSq.setText("0");
            jPanel2.add(gananciaTotalSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, 50, 30));

            historicoDlcSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            historicoDlcSq.setForeground(new java.awt.Color(0, 0, 0));
            historicoDlcSq.setText("0");
            jPanel2.add(historicoDlcSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 40, 30));

            historicoJuegosSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            historicoJuegosSq.setForeground(new java.awt.Color(0, 0, 0));
            historicoJuegosSq.setText("0");
            jPanel2.add(historicoJuegosSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 30));

            cantGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            cantGuionesS.setForeground(new java.awt.Color(255, 255, 255));
            cantGuionesS.setText("0");
            jPanel2.add(cantGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 40, 30));

            costosOpeS.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            costosOpeS.setForeground(new java.awt.Color(255, 255, 255));
            costosOpeS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            costosOpeS.setText("0");
            jPanel2.add(costosOpeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 360, 50, 30));

            label1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label1.setForeground(new java.awt.Color(255, 255, 255));
            label1.setText("Faltas");
            jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 70, 30));

            label3.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label3.setForeground(new java.awt.Color(255, 255, 255));
            label3.setText("Dinero descontado");
            jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 30));

            jLabel97.setBackground(new java.awt.Color(255, 255, 255));
            jLabel97.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel97.setForeground(new java.awt.Color(255, 255, 255));
            jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel97.setText("ECONOMÍA");
            jLabel97.setAlignmentX(5.0F);
            jLabel97.setAlignmentY(0.0F);
            jLabel97.setFocusable(false);
            jLabel97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 260, 30));

            jLabel98.setBackground(new java.awt.Color(255, 255, 255));
            jLabel98.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel98.setForeground(new java.awt.Color(255, 255, 255));
            jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel98.setText("POR ENTREGAR");
            jLabel98.setAlignmentX(5.0F);
            jLabel98.setAlignmentY(0.0F);
            jLabel98.setFocusable(false);
            jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 260, 30));

            readyToShipSq.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
            readyToShipSq.setForeground(new java.awt.Color(255, 255, 255));
            readyToShipSq.setText("0");
            jPanel2.add(readyToShipSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 40, 30));

            jLabel122.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel122.setForeground(new java.awt.Color(255, 255, 255));
            jLabel122.setText("Productores");
            jPanel2.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

            jLabel114.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel114.setForeground(new java.awt.Color(255, 255, 255));
            jLabel114.setText("Placas Bases");
            jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, 30));

            jLabel59.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel59.setForeground(new java.awt.Color(255, 255, 255));
            jLabel59.setText("CPU");
            jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 30));

            jLabel60.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel60.setForeground(new java.awt.Color(255, 255, 255));
            jLabel60.setText("Memoria RAM");
            jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, 30));

            jLabel61.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel61.setForeground(new java.awt.Color(255, 255, 255));
            jLabel61.setText("Fuentes de Alimentación");
            jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 160, 30));

            jLabel62.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel62.setForeground(new java.awt.Color(255, 255, 255));
            jLabel62.setText("Tarjetas Gráficas");
            jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 30));

            jLabel63.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel63.setForeground(new java.awt.Color(255, 255, 255));
            jLabel63.setText("Ensambladores");
            jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 30));

            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel21.setText("jLabel21");
            jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 80));

            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel22.setText("jLabel21");
            jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 260));

            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel23.setText("jLabel21");
            jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 260, 150));

            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel28.setText("jLabel21");
            jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 160));

            jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel30.setText("jLabel21");
            jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 260, 190));

            jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel34.setText("jLabel21");
            jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 260, 110));

            jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel36.setText("jLabel21");
            jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 230, 50));

            jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Dragon2.png"))); // NOI18N
            jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 330, 220));

            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Dragon1.png"))); // NOI18N
            jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Imagen1.jpg"))); // NOI18N
            jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 110, 1070, 610));

            jLabel99.setBackground(new java.awt.Color(255, 255, 255));
            jLabel99.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel99.setForeground(new java.awt.Color(0, 0, 0));
            jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel99.setText("Computadoras");
            jLabel99.setAlignmentX(5.0F);
            jLabel99.setAlignmentY(0.0F);
            jLabel99.setFocusable(false);
            jLabel99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 160, 30));

            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
            jLabel20.setText("jLabel20");
            jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

            jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
            jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

            jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Blanco.jpg"))); // NOI18N
            jLabel37.setText("jLabel37");
            jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 110));

            jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/MSI-Logo.png"))); // NOI18N
            jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

            javax.swing.GroupLayout squarePanelLayout = new javax.swing.GroupLayout(squarePanel);
            squarePanel.setLayout(squarePanelLayout);
            squarePanelLayout.setHorizontalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(squarePanelLayout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            squarePanelLayout.setVerticalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            jTabbedPane1.addTab("MSI", squarePanel);

            nintendoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            cantDlcN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            cantDlcN.setForeground(new java.awt.Color(255, 255, 255));
            cantDlcN.setText("0");
            nintendoPanel.add(cantDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 40, 30));

            spinnerIntegradorN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerIntegradorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 60, -1));

            spinnerNarrativoN.setValue(1);
            spinnerNarrativoN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerNarrativoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 60, -1));

            spinnerNivelesN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, -1));

            spinnerSpritesN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 60, -1));

            spinnerLogicaN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerLogicaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 60, -1));

            spinnerDlcN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 60, -1));

            diasTotalesN.setFont(new java.awt.Font("Super Mario 256", 1, 24)); // NOI18N
            diasTotalesN.setForeground(new java.awt.Color(255, 255, 255));
            diasTotalesN.setText("0");
            nintendoPanel.add(diasTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 40, 30));

            readyToShipDLC.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            readyToShipDLC.setForeground(new java.awt.Color(255, 255, 255));
            readyToShipDLC.setText("0");
            nintendoPanel.add(readyToShipDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 30, 40));

            cantSpritesN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            cantSpritesN.setForeground(new java.awt.Color(255, 255, 255));
            cantSpritesN.setText("0");
            nintendoPanel.add(cantSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 40, 30));

            cantSistemasN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            cantSistemasN.setForeground(new java.awt.Color(255, 255, 255));
            cantSistemasN.setText("0");
            nintendoPanel.add(cantSistemasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 40, 30));

            fechaEntregaN.setBackground(new java.awt.Color(153, 153, 153));
            fechaEntregaN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
            fechaEntregaN.setForeground(new java.awt.Color(0, 0, 0));
            fechaEntregaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fechaEntregaN.setText("0");
            nintendoPanel.add(fechaEntregaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 160, 30));

            cantNivelesN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            cantNivelesN.setForeground(new java.awt.Color(255, 255, 255));
            cantNivelesN.setText("0");
            nintendoPanel.add(cantNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 40, 30));

            estadoPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
            estadoPmN.setForeground(new java.awt.Color(255, 255, 255));
            estadoPmN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            estadoPmN.setText("Estado");
            nintendoPanel.add(estadoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 190, 30));

            descuentoPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
            descuentoPmN.setForeground(new java.awt.Color(255, 255, 255));
            descuentoPmN.setText("0");
            nintendoPanel.add(descuentoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 90, 30));

            faltasPmN.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
            faltasPmN.setForeground(new java.awt.Color(255, 255, 255));
            faltasPmN.setText("0");
            nintendoPanel.add(faltasPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 70, 30));

            gananciasBrutasN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            gananciasBrutasN.setForeground(new java.awt.Color(255, 255, 255));
            gananciasBrutasN.setText("0");
            nintendoPanel.add(gananciasBrutasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 40, 30));

            juegosTotalesN.setBackground(new java.awt.Color(153, 153, 153));
            juegosTotalesN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
            juegosTotalesN.setForeground(new java.awt.Color(0, 0, 0));
            juegosTotalesN.setText("0");
            nintendoPanel.add(juegosTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 90, 40));

            gananciaTotalN.setBackground(new java.awt.Color(153, 153, 153));
            gananciaTotalN.setFont(new java.awt.Font("Super Mario 256", 1, 24)); // NOI18N
            gananciaTotalN.setForeground(new java.awt.Color(255, 255, 255));
            gananciaTotalN.setText("0");
            nintendoPanel.add(gananciaTotalN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 40, 30));

            historicoDlcN.setBackground(new java.awt.Color(153, 153, 153));
            historicoDlcN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
            historicoDlcN.setForeground(new java.awt.Color(0, 0, 0));
            historicoDlcN.setText("0");
            nintendoPanel.add(historicoDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 30, 30));

            historicoJuegosN.setBackground(new java.awt.Color(153, 153, 153));
            historicoJuegosN.setFont(new java.awt.Font("Super Mario 256", 1, 18)); // NOI18N
            historicoJuegosN.setForeground(new java.awt.Color(0, 0, 0));
            historicoJuegosN.setText("0");
            nintendoPanel.add(historicoJuegosN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 30, 30));

            cantGuionesN6.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            cantGuionesN6.setForeground(new java.awt.Color(255, 255, 255));
            cantGuionesN6.setText("0");
            nintendoPanel.add(cantGuionesN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 40, 30));

            costosOpeN.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            costosOpeN.setForeground(new java.awt.Color(255, 255, 255));
            costosOpeN.setText("0");
            nintendoPanel.add(costosOpeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, 40, 30));

            estadoPmN1.setFont(new java.awt.Font("Super Mario 256", 1, 12)); // NOI18N
            estadoPmN1.setForeground(new java.awt.Color(255, 255, 255));
            estadoPmN1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            estadoPmN1.setText("Estado");
            nintendoPanel.add(estadoPmN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 190, 30));

            readyToShip1.setFont(new java.awt.Font("Super Mario 256", 1, 13)); // NOI18N
            readyToShip1.setForeground(new java.awt.Color(255, 255, 255));
            readyToShip1.setText("0");
            nintendoPanel.add(readyToShip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 30, 40));

            jLabel65.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel65.setForeground(new java.awt.Color(255, 255, 255));
            jLabel65.setText("Ensambladores");
            nintendoPanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 30));

            jLabel103.setBackground(java.awt.Color.white);
            jLabel103.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel103.setForeground(new java.awt.Color(255, 255, 255));
            jLabel103.setText("Tarjetas Gráficas");
            nintendoPanel.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 30));

            jLabel104.setBackground(java.awt.Color.white);
            jLabel104.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel104.setForeground(new java.awt.Color(255, 255, 255));
            jLabel104.setText("Fuentes de Alimentación");
            nintendoPanel.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 160, 30));

            jLabel112.setBackground(java.awt.Color.white);
            jLabel112.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel112.setForeground(new java.awt.Color(255, 255, 255));
            jLabel112.setText("Memoria RAM");
            nintendoPanel.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, 30));

            jLabel123.setBackground(java.awt.Color.white);
            jLabel123.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel123.setForeground(new java.awt.Color(255, 255, 255));
            jLabel123.setText("CPU");
            nintendoPanel.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 30));

            jLabel124.setBackground(java.awt.Color.white);
            jLabel124.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel124.setForeground(new java.awt.Color(255, 255, 255));
            jLabel124.setText("Placas Bases");
            nintendoPanel.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, 30));

            jLabel125.setBackground(java.awt.Color.white);
            jLabel125.setFont(new java.awt.Font("Super Mario 256", 0, 14)); // NOI18N
            jLabel125.setForeground(new java.awt.Color(255, 255, 255));
            jLabel125.setText("Productores");
            nintendoPanel.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

            jLabel126.setBackground(java.awt.Color.white);
            jLabel126.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel126.setForeground(new java.awt.Color(204, 204, 204));
            jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel126.setText("EMPLEADOS");
            jLabel126.setAlignmentX(5.0F);
            jLabel126.setAlignmentY(0.0F);
            jLabel126.setFocusable(false);
            jLabel126.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 30));

            jLabel100.setBackground(java.awt.Color.white);
            jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel100.setText("jLabel21");
            nintendoPanel.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 260));

            jLabel128.setBackground(new java.awt.Color(255, 255, 255));
            jLabel128.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel128.setForeground(new java.awt.Color(255, 255, 255));
            jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel128.setText("DIRECTOR");
            jLabel128.setAlignmentX(5.0F);
            jLabel128.setAlignmentY(0.0F);
            jLabel128.setFocusable(false);
            jLabel128.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 30));

            jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel127.setText("jLabel21");
            nintendoPanel.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 80));

            label4.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label4.setForeground(new java.awt.Color(255, 255, 255));
            label4.setText("Dinero descontado");
            nintendoPanel.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 30));

            label5.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label5.setForeground(new java.awt.Color(255, 255, 255));
            label5.setText("Faltas");
            nintendoPanel.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 70, 30));

            jLabel129.setBackground(new java.awt.Color(255, 255, 255));
            jLabel129.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel129.setForeground(new java.awt.Color(255, 255, 255));
            jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel129.setText("PROJECT MANAGER");
            jLabel129.setAlignmentX(5.0F);
            jLabel129.setAlignmentY(0.0F);
            jLabel129.setFocusable(false);
            jLabel129.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 30));

            jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel130.setText("jLabel21");
            nintendoPanel.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 160));

            jLabel96.setBackground(new java.awt.Color(255, 255, 255));
            jLabel96.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel96.setForeground(new java.awt.Color(255, 255, 255));
            jLabel96.setText("Día trascurridos");
            jLabel96.setAlignmentX(5.0F);
            jLabel96.setAlignmentY(0.0F);
            jLabel96.setFocusable(false);
            jLabel96.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 170, 30));

            jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel39.setText("jLabel21");
            nintendoPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 230, 50));

            jLabel109.setBackground(new java.awt.Color(255, 255, 255));
            jLabel109.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel109.setForeground(new java.awt.Color(255, 255, 255));
            jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel109.setText("POR ENTREGAR");
            jLabel109.setAlignmentX(5.0F);
            jLabel109.setAlignmentY(0.0F);
            jLabel109.setFocusable(false);
            jLabel109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 260, 30));

            jLabel110.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel110.setForeground(new java.awt.Color(255, 255, 255));
            jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel110.setText("Computadoras");
            nintendoPanel.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 110, 30));

            jLabel111.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel111.setForeground(new java.awt.Color(255, 255, 255));
            jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel111.setText("Tarjetas gráficas");
            nintendoPanel.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 130, 30));

            jLabel131.setBackground(new java.awt.Color(255, 255, 255));
            jLabel131.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel131.setForeground(new java.awt.Color(255, 255, 255));
            jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel131.setText("ECONOMÍA");
            jLabel131.setAlignmentX(5.0F);
            jLabel131.setAlignmentY(0.0F);
            jLabel131.setFocusable(false);
            jLabel131.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 260, 30));

            jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel35.setText("jLabel21");
            nintendoPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 260, 110));

            jLabel132.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel132.setForeground(new java.awt.Color(255, 255, 255));
            jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel132.setText("Costos operativos");
            nintendoPanel.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 200, 30));

            jLabel133.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel133.setForeground(new java.awt.Color(255, 255, 255));
            jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel133.setText("Ganancias en bruto");
            nintendoPanel.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 180, 30));

            jLabel134.setBackground(new java.awt.Color(255, 255, 255));
            jLabel134.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
            jLabel134.setForeground(new java.awt.Color(255, 255, 255));
            jLabel134.setText("Utilidad");
            jLabel134.setAlignmentX(5.0F);
            jLabel134.setAlignmentY(0.0F);
            jLabel134.setFocusable(false);
            jLabel134.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 120, 50));

            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel24.setText("jLabel21");
            nintendoPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 260, 150));

            jLabel135.setBackground(new java.awt.Color(255, 255, 255));
            jLabel135.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
            jLabel135.setForeground(new java.awt.Color(255, 255, 255));
            jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel135.setText("ALMACEN");
            jLabel135.setAlignmentX(5.0F);
            jLabel135.setAlignmentY(0.0F);
            jLabel135.setFocusable(false);
            jLabel135.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 260, 30));

            jLabel73.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel73.setForeground(new java.awt.Color(255, 255, 255));
            jLabel73.setText("Tarjetas Gráficas");
            nintendoPanel.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, 200, 30));

            jLabel136.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel136.setForeground(new java.awt.Color(255, 255, 255));
            jLabel136.setText("CPU");
            nintendoPanel.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 80, 30));

            jLabel137.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel137.setForeground(new java.awt.Color(255, 255, 255));
            jLabel137.setText("Memorias RAM");
            nintendoPanel.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, 200, 30));

            jLabel138.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel138.setForeground(new java.awt.Color(255, 255, 255));
            jLabel138.setText("Fuentes Alimentación");
            nintendoPanel.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, 200, 30));

            maxGuionesS1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxGuionesS1.setForeground(new java.awt.Color(255, 255, 255));
            maxGuionesS1.setText("25");
            nintendoPanel.add(maxGuionesS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 30, 30));

            jLabel139.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel139.setForeground(new java.awt.Color(255, 255, 255));
            jLabel139.setText("Placas Base");
            nintendoPanel.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 90, 30));

            jLabel140.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel140.setForeground(new java.awt.Color(255, 255, 255));
            jLabel140.setText("de ");
            nintendoPanel.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 30, 30));

            maxNivelesS1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxNivelesS1.setForeground(new java.awt.Color(255, 255, 255));
            maxNivelesS1.setText("20");
            nintendoPanel.add(maxNivelesS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 30, 30));

            jLabel141.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel141.setForeground(new java.awt.Color(255, 255, 255));
            jLabel141.setText("de ");
            nintendoPanel.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 30, 30));

            maxSpritesS1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSpritesS1.setForeground(new java.awt.Color(255, 255, 255));
            maxSpritesS1.setText("55");
            nintendoPanel.add(maxSpritesS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 30, 30));

            jLabel142.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel142.setForeground(new java.awt.Color(255, 255, 255));
            jLabel142.setText("de ");
            nintendoPanel.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 30, 30));

            maxSistemasS1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSistemasS1.setForeground(new java.awt.Color(255, 255, 255));
            maxSistemasS1.setText("35");
            nintendoPanel.add(maxSistemasS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 640, 30, 30));

            jLabel143.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel143.setForeground(new java.awt.Color(255, 255, 255));
            jLabel143.setText("de ");
            nintendoPanel.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 30, 30));

            maxDlcS1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxDlcS1.setForeground(new java.awt.Color(255, 255, 255));
            maxDlcS1.setText("10");
            nintendoPanel.add(maxDlcS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, 30, 30));

            jLabel144.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel144.setForeground(new java.awt.Color(255, 255, 255));
            jLabel144.setText("de ");
            nintendoPanel.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 30, 30));

            jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Negro.png"))); // NOI18N
            jLabel31.setText("jLabel21");
            nintendoPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 260, 190));

            jLabel145.setBackground(new java.awt.Color(255, 255, 255));
            jLabel145.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel145.setForeground(new java.awt.Color(0, 0, 0));
            jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel145.setText("Computadoras");
            jLabel145.setAlignmentX(5.0F);
            jLabel145.setAlignmentY(0.0F);
            jLabel145.setFocusable(false);
            jLabel145.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 160, 30));

            jLabel146.setBackground(new java.awt.Color(255, 255, 255));
            jLabel146.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel146.setForeground(new java.awt.Color(0, 0, 0));
            jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel146.setText("totales");
            jLabel146.setAlignmentX(5.0F);
            jLabel146.setAlignmentY(0.0F);
            jLabel146.setFocusable(false);
            jLabel146.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 160, 30));

            jLabel147.setBackground(new java.awt.Color(255, 255, 255));
            jLabel147.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel147.setForeground(new java.awt.Color(0, 0, 0));
            jLabel147.setText("Computadoras ensambladas");
            jLabel147.setAlignmentX(5.0F);
            jLabel147.setAlignmentY(0.0F);
            jLabel147.setFocusable(false);
            jLabel147.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 240, 30));

            jLabel148.setBackground(new java.awt.Color(255, 255, 255));
            jLabel148.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel148.setForeground(new java.awt.Color(0, 0, 0));
            jLabel148.setText("Tarjetas Gráficas anexadas");
            jLabel148.setAlignmentX(5.0F);
            jLabel148.setAlignmentY(0.0F);
            jLabel148.setFocusable(false);
            jLabel148.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 240, 30));

            jLabel149.setBackground(new java.awt.Color(255, 255, 255));
            jLabel149.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel149.setForeground(new java.awt.Color(0, 0, 0));
            jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel149.setText("Días para la entrega");
            jLabel149.setAlignmentX(5.0F);
            jLabel149.setAlignmentY(0.0F);
            jLabel149.setFocusable(false);
            jLabel149.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 180, 30));

            jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
            nintendoPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1030, 10));

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/apple-5-logo-png-transparent.png"))); // NOI18N
            nintendoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
            nintendoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Apple.jpg.png"))); // NOI18N
            nintendoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 110, -1, 670));

            jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo_Blanco.jpg"))); // NOI18N
            jLabel40.setText("jLabel37");
            nintendoPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 110));

            jTabbedPane1.addTab("APPLE", nintendoPanel);

            jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 760));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1010, 756));

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void spinnerNarrativoNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNarrativoN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 0, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
                nintendo.getScriptsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getScriptsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getScriptsDevs().eliminarAlFinal();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerNarrativoN, this.spinnerNarrativoN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerNarrativoNStateChanged

    private void spinnerNivelesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNivelesN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 1, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityLevelsDevsN((int)this.spinnerNivelesN.getValue());
                nintendo.getLevelsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getLevelsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getLevelsDevs().eliminarAlFinal();
                this.initialValues.setQuantityLevelsDevsN((int)this.spinnerNivelesN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerNivelesN, this.spinnerNivelesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerNivelesNStateChanged

    private void spinnerSpritesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNarrativoN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 0, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
                nintendo.getScriptsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getScriptsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getScriptsDevs().eliminarAlFinal();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerSpritesN, this.spinnerSpritesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerSpritesNStateChanged

    private void spinnerLogicaNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNarrativoN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 0, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
                nintendo.getScriptsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getScriptsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getScriptsDevs().eliminarAlFinal();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerLogicaN, this.spinnerLogicaN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerLogicaNStateChanged

    private void spinnerDlcNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNarrativoN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 0, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
                nintendo.getScriptsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getScriptsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getScriptsDevs().eliminarAlFinal();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerDlcN, this.spinnerDlcN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerDlcNStateChanged

    private void spinnerIntegradorNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorNStateChanged
        // TODO add your handling code here:
        if(this.flag==true){
            
            int antesCambio=this.initialValues.getQuantitySpritesDevsN();
            if((int)this.spinnerNarrativoN.getValue() > antesCambio){
                Developer dev= new Developer("Nintendo", 0, this.initialValues.getDayDuration(), nintendo.getDrive(), nintendo.getDevsMutex(), 10);
                dev.start();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
                nintendo.getScriptsDevs().agregarAlFinal(dev);
            }else{
                nintendo.getScriptsDevs().obtenerNodoUltimo().getDatos().interrupt();
                nintendo.getScriptsDevs().eliminarAlFinal();
                this.initialValues.setQuantityScriptsDevsN((int)this.spinnerNarrativoN.getValue());
            }
        }
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerIntegradorN, this.spinnerIntegradorN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerIntegradorNStateChanged

    private void startSimulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulActionPerformed

        this.initialValues.setDayDuration((int) spinnerDuracion.getValue());
        this.initialValues.setDeadline((int) spinnerDeadline.getValue());
        
        this.initialValues.setQuantityScriptsDevsN((int) spinnerNarrativoN1.getValue());
        this.initialValues.setQuantityLevelsDevsN((int) spinnerNivelesN1.getValue());
        this.initialValues.setQuantitySpritesDevsN((int) spinnerSpritesN1.getValue());
        this.initialValues.setQuantitySystemsDevsN((int) spinnerLogicaN1.getValue());
        this.initialValues.setQuantityDLCsDevsN((int) spinnerDlcN1.getValue());
        this.initialValues.setQuantityIntegratorsN((int) spinnerIntegradorN1.getValue());
        
        this.initialValues.setQuantityScriptsDevsS((int) spinnerNarrativoN2.getValue());
        this.initialValues.setQuantityLevelsDevsS((int) spinnerNivelesN2.getValue());
        this.initialValues.setQuantitySpritesDevsS((int) spinnerSpritesN2.getValue());
        this.initialValues.setQuantitySystemsDevsS((int) spinnerLogicaN2.getValue());
        this.initialValues.setQuantityDLCsDevsS((int) spinnerDlcN2.getValue());
        this.initialValues.setQuantityIntegratorsS((int) spinnerIntegradorN2.getValue());
        
        initialValues.escribirTXT();
        
        nintendo= new Simulation(7,initialValues.getDayDuration()*1000,initialValues.getDeadline(),initialValues.getQuantityScriptsDevsN(),initialValues.getQuantityLevelsDevsN(),initialValues.getQuantitySpritesDevsN(),initialValues.getQuantitySystemsDevsN(),initialValues.getQuantityDLCsDevsN(),initialValues.getQuantityIntegratorsN(),"Nintendo");
        square= new Simulation(7,initialValues.getDayDuration()*1000,initialValues.getDeadline(),initialValues.getQuantityScriptsDevsS(),initialValues.getQuantityLevelsDevsS(),initialValues.getQuantitySpritesDevsS(),initialValues.getQuantitySystemsDevsS(),initialValues.getQuantityDLCsDevsS(),initialValues.getQuantityIntegratorsS(),"Square Enix");
        
        nintendo.start();
        square.start();
        this.flag=true;
        
    }//GEN-LAST:event_startSimulActionPerformed

    private void txtSimuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimuActionPerformed

        initialValues.leerTXT();

        spinnerDuracion.setValue((int) initialValues.getDayDuration());
        spinnerDeadline.setValue((int) initialValues.getDeadline());

        spinnerNarrativoN1.setValue((int) initialValues.getQuantityScriptsDevsN());
        spinnerNivelesN1.setValue((int) initialValues.getQuantityLevelsDevsN());
        spinnerSpritesN1.setValue((int) initialValues.getQuantitySpritesDevsN());
        spinnerLogicaN1.setValue((int) initialValues.getQuantitySystemsDevsN());
        spinnerDlcN1.setValue((int) initialValues.getQuantityDLCsDevsN());
        spinnerIntegradorN1.setValue((int) initialValues.getQuantityIntegratorsN());

        spinnerNarrativoN2.setValue((int) initialValues.getQuantityScriptsDevsS());
        spinnerNivelesN2.setValue((int) initialValues.getQuantityLevelsDevsS());
        spinnerSpritesN2.setValue((int) initialValues.getQuantitySpritesDevsS());
        spinnerLogicaN2.setValue((int) initialValues.getQuantitySystemsDevsS());
        spinnerDlcN2.setValue((int) initialValues.getQuantityDLCsDevsS());
        spinnerIntegradorN2.setValue((int) initialValues.getQuantityIntegratorsS());
        
    }//GEN-LAST:event_txtSimuActionPerformed

    private void spinnerIntegradorN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerIntegradorN1, this.spinnerIntegradorN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerIntegradorN1StateChanged

    private void spinnerNarrativoN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerNarrativoN1, this.spinnerNarrativoN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerNarrativoN1StateChanged

    private void spinnerNivelesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerNivelesN1, this.spinnerNivelesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerNivelesN1StateChanged

    private void spinnerSpritesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerSpritesN1, this.spinnerSpritesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerSpritesN1StateChanged

    private void spinnerLogicaN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerLogicaN1, this.spinnerLogicaN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerLogicaN1StateChanged

    private void spinnerDlcN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerDlcN1, this.spinnerDlcN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerDlcN1StateChanged

    private void spinnerIntegradorN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerIntegradorN2, this.spinnerIntegradorS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerIntegradorN2StateChanged

    private void spinnerNarrativoN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerNarrativoN2, this.spinnerNarrativoS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerNarrativoN2StateChanged

    private void spinnerNivelesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerNivelesN2, this.spinnerNivelesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerNivelesN2StateChanged

    private void spinnerSpritesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerSpritesN2, this.spinnerSpritesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerSpritesN2StateChanged

    private void spinnerLogicaN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerLogicaN2, this.spinnerLogicaS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerLogicaN2StateChanged

    private void spinnerDlcN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerDlcN2, this.spinnerDlcS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerDlcN2StateChanged

    private void spinnerIntegradorSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerIntegradorS, this.spinnerIntegradorN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerIntegradorSStateChanged

    private void spinnerNarrativoSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerNarrativoS, this.spinnerNarrativoN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
    }//GEN-LAST:event_spinnerNarrativoSStateChanged

    private void spinnerNivelesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerNivelesS, this.spinnerNivelesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
    }//GEN-LAST:event_spinnerNivelesSStateChanged

    private void spinnerSpritesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerSpritesS, this.spinnerSpritesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerSpritesSStateChanged

    private void spinnerLogicaSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerLogicaS, this.spinnerLogicaN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerLogicaSStateChanged

    private void spinnerDlcSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerDlcS, this.spinnerDlcN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerDlcSStateChanged

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
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
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private static javax.swing.JLabel juegosTotalesN;
    private static javax.swing.JLabel juegosTotalesSq;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel maxDlcS;
    private javax.swing.JLabel maxDlcS1;
    private javax.swing.JLabel maxGuionesS;
    private javax.swing.JLabel maxGuionesS1;
    private javax.swing.JLabel maxNivelesS;
    private javax.swing.JLabel maxNivelesS1;
    private javax.swing.JLabel maxSistemasS;
    private javax.swing.JLabel maxSistemasS1;
    private javax.swing.JLabel maxSpritesS;
    private javax.swing.JLabel maxSpritesS1;
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
}
