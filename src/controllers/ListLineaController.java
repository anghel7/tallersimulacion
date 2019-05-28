/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.GroupLayout;
import models.Linea;
import models.ModelManager;
import views.LineaItemView;
import views.ListLineaView;

/**
 *
 * @author skypper
 */
public class ListLineaController {

    ListLineaView listLineaView;
    ModelManager modelManager;

    public ListLineaController(ListLineaView view, ModelManager modelManager) {
        this.listLineaView = view;
        this.modelManager = modelManager;
        loadConf();
    }

    public void loadConf() {
        listLineaView.jScrollPaneContainer = new javax.swing.JScrollPane();
        listLineaView.panelContainer = new javax.swing.JPanel();
        listLineaView.setPreferredSize(new java.awt.Dimension(850, 550));
        listLineaView.setRequestFocusEnabled(false);

        listLineaView.jScrollPaneContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Lineas"));

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(listLineaView.panelContainer);
        listLineaView.panelContainer.setLayout(panelContainerLayout);

        ArrayList<LineaItemView> itemViewList = new ArrayList<>();
        for (Linea linea : modelManager.getLineas()) {
            LineaItemView lineaItemView = new LineaItemView();
            LineaItemController lineaItemController = new LineaItemController(lineaItemView, linea);            
            itemViewList.add(lineaItemView);
            
        }


        /*Horizontal*/
        GroupLayout.Group groupHorizontal = panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        for (LineaItemView component : itemViewList) {
            groupHorizontal
                    .addComponent(component, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);

        }

        panelContainerLayout.setHorizontalGroup(groupHorizontal);
        /*Vertical*/
        GroupLayout.Group groupVertical = panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);

        GroupLayout.SequentialGroup sqGroup = panelContainerLayout.createSequentialGroup();
        for (LineaItemView component : itemViewList) {
            sqGroup.addComponent(component, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        }
        groupVertical.addGroup(sqGroup);
        panelContainerLayout.setVerticalGroup(groupVertical);

        listLineaView.jScrollPaneContainer.setViewportView(listLineaView.panelContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(listLineaView);
        listLineaView.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(186, Short.MAX_VALUE)
                                .addComponent(listLineaView.jScrollPaneContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(listLineaView.jScrollPaneContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );
    }
}
