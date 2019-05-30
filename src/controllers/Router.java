/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import models.Linea;

/**
 *
 * @author skypper
 */
public interface Router {

    public void showLoginView(ActionEvent evt);

    public void showHomeView(ActionEvent evt);

    public void showCreateLineaView(ActionEvent evt);

    public void showListLineaView(ActionEvent evt);

    public void showListParadaView(ActionEvent evt);

    public void enableMenubar(boolean isEnabled);

    public void showEditLineaView(ActionEvent evt, Linea linea);
}
