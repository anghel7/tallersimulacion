/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ListLineaView;
import views.LoginView;

/**
 *
 * @author skypper
 */
public class ExampleController {

    ListLineaView listLineaView;

    public ExampleController(ListLineaView view) {
        this.listLineaView = view;
        loadConf();
    }

    public void loadConf() {

    }
}
