/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Linea;
import views.EditLineaFormView;

/**
 *
 * @author skypper
 */
public class EditLineaFormController {

    EditLineaFormView editLineaFormView;
    Linea linea;

    public EditLineaFormController(EditLineaFormView view, Linea model) {
        this.editLineaFormView = view;
        this.linea = model;
        loadConf();
    }

    public void loadConf() {
        editLineaFormView.nombreTextField.setText(linea.getNombre());
        editLineaFormView.descripcionTextArea.setText(linea.getDescripcion());
        editLineaFormView.descripcionTextArea.setLineWrap(true);
    }
}
