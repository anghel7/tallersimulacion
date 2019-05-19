/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author skypper
 */
public class MainModel {

    private ArrayList<Linea> lineas;

    public MainModel() {
        lineas = new ArrayList<Linea>();
    }

    public void addLinea(Linea linea) {
        lineas.add(linea);
    }

    public MainModel getPopulateMainModel() {
        MainModel tren = new MainModel();
        Linea lineaAmarilla = new Linea();
        Linea lineVerde = new Linea();
        Linea lineaRoja = new Linea();
        tren.addLinea(lineaRoja);
        tren.addLinea(lineVerde);
        tren.addLinea(lineaAmarilla);
        return tren;
    }

}
