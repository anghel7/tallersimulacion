/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.GroupLayout;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import views.GraficoView;

/**
 *
 * @author skypper
 */
public class GraficoController {

    GraficoView graficoView;

    public GraficoController(GraficoView view) {
        this.graficoView = view;
        DefaultCategoryDataset defaultData = new DefaultCategoryDataset();        
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

        GroupLayout layout = new GroupLayout(graficoView);
        graficoView.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(charPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(charPanel, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        graficoView.repaint();
    }
}
