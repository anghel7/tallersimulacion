/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Vagon;
import views.ListLineaView;
import views.VagonItemView;

/**
 *
 * @author skypper
 */
public class VagonItemController {
    
    VagonItemView vagonItemView;
    Vagon vagon;
    
    public VagonItemController(VagonItemView view, Vagon model) {
        this.vagonItemView = view;
        this.vagon = model;
        loadConf();
    }
    
    public void loadConf() {
        vagonItemView.capacidadTextField.setText(vagon.getCapacidad() + "");
        vagonItemView.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagon "+vagon.getNumero()));
    }
}
