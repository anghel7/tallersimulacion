/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author skypper
 */
public class DataSimulation {

    private int cantPasajeros;
    private String hora;
    private String linea;

    public DataSimulation(int cantPasajeros, String linea, String hora) {
        this.cantPasajeros = cantPasajeros;
        this.hora = hora;
        this.linea = linea;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

}
