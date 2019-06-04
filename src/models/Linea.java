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
public class Linea {

    private String nombre;
    private String descripcion;
    private ArrayList<Vagon> vagones;
    private ArrayList<Parada> paradas;
    private int contadorVagones;

    public Linea(String nombre, String descripcion) {
        this.nombre = nombre;
        contadorVagones = 0;
        this.descripcion = descripcion;
        this.vagones = new ArrayList<>();
        this.paradas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void addVagon(Vagon e) {
        contadorVagones++;
        e.setNumero(contadorVagones);
        vagones.add(e);
    }

    public void addParada(Parada e) {
        paradas.add(e);
    }

    public ArrayList<Vagon> getVagones() {
        return vagones;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

}
