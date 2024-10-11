package Graficar;



import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficoUtilidad {
    public static void main(String[] args) {
        XYSeries series1 = new XYSeries("Empresa A");
        series1.add(0, 0);
        series1.add(15, 150000);
        series1.add(30, 300000);

        XYSeries series2 = new XYSeries("Empresa B");
        series2.add(0, 0);
        series2.add(15, 180000);
        series2.add(30, 250000);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

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
}
