/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Linea;
import views.ListLineaView;
import views.SimulacionView;

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
        simulacionView.tituloLabel.setText("Simulación de "+linea.getNombre());
    }
}
