/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelManager;
import views.ListLineaView;

/**
 *
 * @author skypper
 */
public class ListLineaController {

    ListLineaView listLineaView;
    ModelManager modelManager;

    public ListLineaController(ListLineaView view, ModelManager modelManager) {
        this.listLineaView = view;
        this.modelManager = modelManager;
        loadConf();
    }

    public void loadConf() {

    }
}
