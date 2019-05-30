/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.GroupLayout;
import models.Linea;
import views.EditLineaView;

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
        editLineaView.nameLabel.setText(linea.getNombre());
        //Panel container
        GroupLayout containerPanelLayout = new GroupLayout(editLineaView.containerPanel);
        editLineaView.containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            //.addComponent(vagonItemView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            //.addComponent(vagonItemView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            //.addComponent(vagonItemView3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                //.addComponent(vagonItemView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(vagonItemView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(vagonItemView3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            )
        );
    }

}
