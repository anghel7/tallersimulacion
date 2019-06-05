/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;
import models.Linea;
import models.Provider;
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

    TimerTask timerTask = new TimerTask() {
        public void run() { 
            DefaultCategoryDataset data = providerLineaRoja.getData();
            simulacionView.graficoViewPanel.removeAll();
            graficoController.loadConf(data);
            simulacionView.repaint();   
            simulacionView.horaLabel.setText(providerLineaRoja.getLastData().getHora());
        }
    };

    // Aquí se pone en marcha el timer cada segundo. 
    Timer timer = new Timer();
    Provider providerLineaRoja = new Provider("Linea Roja");

    private void startSimulation(ActionEvent evt) {
        // Dentro de 0 milisegundos avísame cada 1000 milisegundos 
        timer.scheduleAtFixedRate(timerTask, 0, 1000);

    }
}
