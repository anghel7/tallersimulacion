/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
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

    public void login(ActionEvent evt) {
        String username = loginView.userTextField.getText();
        String password = new String(loginView.passwordField.getPassword());
        if (!"admin".equals(username)) {
            loginView.labelError.setText("Usuario Invalido");
        } else if (!"admin".equals(password)) {
            loginView.labelError.setText("Contraseña Invlida");
        } else {
            System.out.println("controllers.LoginController.login()");
        }
    }

    public void loadConf() {
        loginView.labelError.setText("");
        loginView.aceptarButton.addActionListener((ActionEvent evt) -> {
            login(evt);
        });
    }
}
