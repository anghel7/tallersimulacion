/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Parada;
import views.ListLineaView;
import views.ParadaItemView;

/**
 *
 * @author skypper
 */
public class ParadaItemController {
    
    ParadaItemView paradaItemView;
    Parada parada;
    
    public ParadaItemController(ParadaItemView view, Parada model) {
        this.paradaItemView = view;
        this.parada = model;
        loadConf();
    }
    
    public void loadConf() {
        paradaItemView.origenTextField.setText(parada.getOrigen());
        paradaItemView.destinoTextField.setText(parada.getDestino());
    }
}
