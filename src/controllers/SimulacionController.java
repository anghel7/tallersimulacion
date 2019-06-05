/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import models.Linea;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import views.SimulacionView;

/**
 *
 * @author skypper
 */
public class SimulacionController {

    SimulacionView simulacionView;
    Linea linea;
    GraficoController graficoController;

    public SimulacionController(SimulacionView view, Linea model) {
        this.simulacionView = view;
        this.linea = model;
        loadConf();
    }

    public void loadConf() {
        simulacionView.tituloLabel.setText("Simulación de " + linea.getNombre());
        simulacionView.startButton.addActionListener((ActionEvent evt) -> {
            startSimulation(evt);
        });
        graficoController = new GraficoController(simulacionView.graficoViewPanel);
    }

    private void startSimulation(ActionEvent evt) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(1, "Linea Roja", "06:00");
        data.addValue(2, "Linea Roja", "08:30");
        data.addValue(3, "Linea Roja", "10:30");
        data.addValue(4, "Linea Roja", "12:00");
        data.addValue(5, "Linea Roja", "16:30");
        data.addValue(6, "Linea Roja", "19:30");
        data.addValue(7, "Linea Roja", "23:30");
        graficoController.loadConf(data);
        simulacionView.graficoViewPanel.revalidate();
        simulacionView.graficoViewPanel.repaint();
        simulacionView.revalidate();
        simulacionView.repaint();
        System.out.println("controllers.SimulacionController.startSimulation()");
    }
}
