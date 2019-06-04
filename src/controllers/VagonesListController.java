/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.GroupLayout;
import models.Vagon;
import views.ListLineaView;
import views.VagonItemView;
import views.VagonesListView;

/**
 *
 * @author skypper
 */
public class VagonesListController {

    VagonesListView vagonesListView;
    ArrayList<Vagon> vagones;

    public VagonesListController(VagonesListView view, ArrayList<Vagon> model) {
        this.vagonesListView = view;
        this.vagones = model;
        loadConf();
    }

    public void loadConf() {

        vagonesListView.containerScrollPane = new javax.swing.JScrollPane();
        vagonesListView.containerPanel = new javax.swing.JPanel();
        ArrayList<VagonItemView> components = new ArrayList<VagonItemView>();
        for (Vagon vagon : vagones) {
            VagonItemView vagonItemView = new VagonItemView();
            VagonItemController vagonItemController = new VagonItemController(vagonItemView, vagon);
            components.add(vagonItemView);
        }

        vagonesListView.containerScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagones"));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(vagonesListView.containerPanel);
        vagonesListView.containerPanel.setLayout(containerPanelLayout);

        GroupLayout.ParallelGroup createParallelGroupHorizontal = containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        for (VagonItemView component : components) {
            createParallelGroupHorizontal.addComponent(component, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
        }
        containerPanelLayout.setHorizontalGroup(
                createParallelGroupHorizontal
        );

        GroupLayout.SequentialGroup createSequentialGroupVertical = containerPanelLayout.createSequentialGroup();
        for (VagonItemView component : components) {
            createSequentialGroupVertical
                    .addComponent(component, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        }

        containerPanelLayout.setVerticalGroup(
                containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                createSequentialGroupVertical
                        )
        );

        vagonesListView.containerScrollPane.setViewportView(vagonesListView.containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(vagonesListView);
        vagonesListView.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vagonesListView.containerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vagonesListView.containerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

    }
}
