/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.GroupLayout;
import models.Parada;
import views.ParadaItemView;
import views.ParadaListView;

/**
 *
 * @author skypper
 */
public class ParadaListViewController {

    ParadaListView paradaListView;
    ArrayList<Parada> paradas;

    public ParadaListViewController(ParadaListView view, ArrayList<Parada> models) {
        this.paradaListView = view;
        this.paradas = models;
        loadConf();
    }

    public void loadConf() {
        paradaListView.containerScrollPane = new javax.swing.JScrollPane();
        paradaListView.containerPanel = new javax.swing.JPanel();

        ArrayList<ParadaItemView> components = new ArrayList<ParadaItemView>();

        for (Parada parada : paradas) {
            ParadaItemView paradaItemView = new ParadaItemView();
            ParadaItemController paradaItemController = new ParadaItemController(paradaItemView, parada);
            components.add(paradaItemView);
        }

        paradaListView.containerScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Paradas"));

        GroupLayout containerPanelLayout = new javax.swing.GroupLayout(paradaListView.containerPanel);
        paradaListView.containerPanel.setLayout(containerPanelLayout);

        GroupLayout.ParallelGroup parallelGroupHorizontal = containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        for (ParadaItemView component : components) {
            parallelGroupHorizontal
                    .addComponent(component, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
        }
        containerPanelLayout.setHorizontalGroup(
                containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGroup(parallelGroupHorizontal)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        //Horizontal
        GroupLayout.SequentialGroup createSequentialGroupVertical = containerPanelLayout.createSequentialGroup();
        for (ParadaItemView component : components) {
            createSequentialGroupVertical
                    .addComponent(component, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        }

        containerPanelLayout.setVerticalGroup(
                containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createSequentialGroupVertical)
        );

        paradaListView.containerScrollPane.setViewportView(paradaListView.containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(paradaListView);
        paradaListView.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paradaListView.containerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paradaListView.containerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
    }
}
