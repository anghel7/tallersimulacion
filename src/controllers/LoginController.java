/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.LoginView;

/**
 *
 * @author skypper
 */
public class LoginController {

    LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        loadConf();
    }

    public void login() {
    }

    public void loadConf() {
        loginView.labelError.setText("");
    }
}
