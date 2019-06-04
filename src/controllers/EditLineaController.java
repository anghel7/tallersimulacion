/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
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
public class EditLineaController extends Controller {

    EditLineaView editLineaView;
    Linea linea;
    //Controller and view embeded
    EditLineaFormController editLineaFormController;
    ParadaListViewController paradaListViewController;
    VagonesListController vagonesListController;

    public EditLineaController(EditLineaView view, Router router, Linea linea) {
        this.router = router;
        this.editLineaView = view;
        this.linea = linea;
        loadConf();
    }

    public void loadConf() {
        editLineaView.nameLabel.setText(linea.getNombre());
        editLineaFormController = new EditLineaFormController(editLineaView.editLineaFormView, linea);
        paradaListViewController = new ParadaListViewController(editLineaView.paradaListView, linea.getParadas());
        vagonesListController = new VagonesListController(editLineaView.vagonesListView, linea.getVagones());
        //editLineaView.vagonesListView
        editLineaView.simularButton.addActionListener((ActionEvent evt) -> {
            showsimulacionView(evt);
        });
    }

    private void showsimulacionView(ActionEvent evt) {
        this.router.showSimulacionView(evt, linea);
    }

}
