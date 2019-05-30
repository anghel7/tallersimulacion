/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.GroupLayout;
import models.Linea;
import models.Vagon;
import views.EditLineaView;
import views.VagonItemView;

/**
 *
 * @author skypper
 */
public class EditLineaController {

    EditLineaView editLineaView;
    Linea linea;

    public EditLineaController(EditLineaView view, Linea linea) {
        this.editLineaView = view;
        this.linea = linea;
        loadConf();
    }

    public void loadConf() {
        System.out.println("controllers.EditLineaController.loadConf()");
    }

}
