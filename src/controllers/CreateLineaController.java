/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import models.Linea;
import models.ModelManager;
import views.CreateLineaView;

/**
 *
 * @author skypper
 */
public class CreateLineaController extends Controller {

    CreateLineaView createLineaView;
    ModelManager modelManager;

    public CreateLineaController(CreateLineaView createLineaView, Router router, ModelManager modelManager) {
        this.router = router;
        this.modelManager = modelManager;
        this.createLineaView = createLineaView;
        loadConf();
    }

    public void loadConf() {
        createLineaView.aceptarButton.addActionListener((ActionEvent evt) -> {
            crearLinea(evt);
        });
        createLineaView.cancelarButton.addActionListener((ActionEvent evt) -> {
            cancelarLinea(evt);
        });
    }

    private void cancelarLinea(ActionEvent evt) {
        router.showListLineaView(evt);
    }

    private void crearLinea(ActionEvent evt) {
        String nombre = createLineaView.descripcionTextArea.getText();
        String descripcion = createLineaView.nombreTextField.getText();
        modelManager.addLinea(new Linea(nombre, descripcion));
        router.showListLineaView(evt);
    }

}
