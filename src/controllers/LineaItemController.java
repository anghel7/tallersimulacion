/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import views.LineaItemView;

/**
 *
 * @author skypper
 */
import models.Linea;

public class LineaItemController {

    LineaItemView lineaItemView;
    Linea linea;

    public LineaItemController(LineaItemView view, Linea linea, Router router) {
        this.lineaItemView = view;
        this.linea = linea;
        loadConf();
    }

    public void loadConf() {
        this.lineaItemView.descripcionTextArea.setText(linea.getDescripcion());
        this.lineaItemView.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(linea.getNombre())));
        lineaItemView.descripcionTextArea.setLineWrap(true);
        lineaItemView.editarButton.addActionListener((ActionEvent evt) -> {
            editLinea(evt);
        });
    }

    private void editLinea(ActionEvent evt) {
        System.out.println("controllers.LineaItemController.editLinea()");
    }
}
