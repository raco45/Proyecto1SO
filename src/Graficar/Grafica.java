package Graficar;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafica {

    public XYSeries series1 = new XYSeries("Apple");
    public XYSeries series2 = new XYSeries("MSI");

    public Grafica() {
        this.series1.add(0, 0);
        this.series2.add(0, 0);
    }

    public void graficar() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(getSeries1());
        dataset.addSeries(getSeries2());

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Utilidad vs Tiempo",
                "Tiempo",
                "Utilidad",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public void addSerie(int dias, int apple, XYSeries xy) {
        xy.add(dias, apple);

    }
    public void addSerie2( int diasM, int msi, XYSeries xy) {
        xy.add(diasM, msi);

    }

    public void addSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the series1
     */
    public XYSeries getSeries1() {
        return series1;
    }

    /**
     * @param series1 the series1 to set
     */
    public void setSeries1(XYSeries series1) {
        this.series1 = series1;
    }

    /**
     * @return the series2
     */
    public XYSeries getSeries2() {
        return series2;
    }

    /**
     * @param series2 the series2 to set
     */
    public void setSeries2(XYSeries series2) {
        this.series2 = series2;
    }
}
