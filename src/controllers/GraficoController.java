/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import views.GraficoView;
import views.ListLineaView;

/**
 *
 * @author skypper
 */
public class GraficoController {

    GraficoView graficoView;

    public GraficoController(GraficoView view) {
        this.graficoView = view;
        DefaultCategoryDataset defaultData = new DefaultCategoryDataset();
        defaultData.addValue(1, "Linea Roja", "06:00");
        defaultData.addValue(2, "Linea Roja", "08:30");
        defaultData.addValue(3, "Linea Roja", "10:30");
        defaultData.addValue(4, "Linea Roja", "12:00");
        defaultData.addValue(3, "Linea Roja", "16:30");
        defaultData.addValue(5, "Linea Roja", "19:30");
        defaultData.addValue(7, "Linea Roja", "23:30");
        loadConf(defaultData);
    }

    public void loadConf(DefaultCategoryDataset data) {
        JFreeChart grafica;        
        grafica = ChartFactory.createLineChart("Frecuencia de pasajeros",
                "Horas", "Pasajeros", data,
                PlotOrientation.VERTICAL, true, true, false);
        ChartPanel charPanel = new ChartPanel(grafica);

        graficoView.setPreferredSize(new java.awt.Dimension(850, 550));
        graficoView.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(graficoView);
        graficoView.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(charPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(charPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}
