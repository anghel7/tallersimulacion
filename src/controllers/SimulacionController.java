/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import javax.swing.JButton;
import models.Linea;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import views.ListLineaView;
import views.SimulacionView;
//import libs.

/**
 *
 * @author skypper
 */
public class SimulacionController {

    SimulacionView simulacionView;
    Linea linea;

    public SimulacionController(SimulacionView view, Linea model) {
        this.simulacionView = view;
        this.linea = model;
        loadConf();
    }

    public void loadConf() {
        simulacionView.tituloLabel.setText("Simulación de " + linea.getNombre());
        JFreeChart grafico;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(1, "Negocio 1", "Lunes");
        datos.addValue(2, "Negocio 1", "Martes");
        datos.addValue(3, "Negocio 1", "Miércoles");
        datos.addValue(4, "Negocio 1", "Jueves");
        datos.addValue(5, "Negocio 1", "Viernes");
        datos.addValue(6, "Negocio 1", "Sábado");
        datos.addValue(7, "Negocio 1", "Domingo");
        grafico = ChartFactory.createBarChart("Visitas diarias",
                "Días", "Visitas", datos,
                PlotOrientation.HORIZONTAL.HORIZONTAL, true, true, false);
        ChartPanel charPanel = new ChartPanel(grafico);
        
        
        

    }
}
