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
public class ModelManager {

    private ArrayList<Linea> lineas;

    public ModelManager() {
        lineas = new ArrayList<Linea>();
    }

    public void addLinea(Linea linea) {
        lineas.add(linea);
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    public static ModelManager getPopulateMainModel() {
        ModelManager tren = new ModelManager();
        Linea lineaRoja = new Linea(
                "Linea Roja",
                "Recorrerá desde la Estación hasta la Facultad de Agronomía de la Universidad Mayor de San Simón en la avenida Petrolera. Tendrá una longitud aproximada de 5.5 kilómetros y siete nuevas estaciones a parte de la Central."
        );
        Linea lineaAmarilla = new Linea(
                "Linea Amarilla",
                "Tendrá un tramo de 10 kilómetros, recorrerá entre San Antonio y la zona de El Castillo del municipio de Sacaba. Se calcula un recorrido de 25 minutos aproximadamente para esta ruta.  Contará con ocho estaciones, que estarán en los siguientes sectores: Cementerio General, aeropuerto, pasará por la avenida Ayacucho, la Empresa de Luz y Fuerza Cochabamba (ELFEC), puente de Quillacollo, Parque de la Familia, plazuela de las Banderas, plazuela Cobija, estadio Félix Capriles, Recoleta, Muyurina y el Castillo"
        );
        Linea lineaVerde = new Linea(
                "Linea Verde",
                "La longitud de este tramo es la más larga, se calcula una distancia de 27 kilómetros aproximadamente desde la estación Central hasta el término municipal de Suticollo. Atraviesa los municipios de Cochabamba, Colcapirhua, Quillacollo, Vinto y Sipe Sipe . Incluye 23 nuevas estaciones."
        );
        tren.addLinea(lineaVerde);
        tren.addLinea(lineaAmarilla);
        tren.addLinea(lineaRoja);
        return tren;
    }

}
