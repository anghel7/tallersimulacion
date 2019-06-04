/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Parada;
import views.ListLineaView;
import views.ParadaListView;

/**
 *
 * @author skypper
 */
public class ParadaListViewController {

    ParadaListView paradaListView;
    ArrayList<Parada> paradas;

    public ParadaListViewController(ParadaListView view, ArrayList<Parada> models) {
        this.paradaListView = view;
        this.paradas = models;
        loadConf();
    }

    public void loadConf() {
        
    }
}
