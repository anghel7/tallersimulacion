/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ListLineaView;
import views.ListParadaView;

/**
 *
 * @author skypper
 */
public class ListParadaController {

    ListParadaView listParadaView;

    public ListParadaController(ListParadaView view) {
        this.listParadaView = view;
        loadConf();
    }

    public void loadConf() {

    }
}
