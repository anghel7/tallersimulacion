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
public class LoginController extends Controller {

    LoginView loginView;

    public LoginController(LoginView loginView, Router router) {
        this.loginView = loginView;
        this.router = router;
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
            router.showHomeView(evt);
            router.enableMenubar(true);
        }
    }

    public void loadConf() {
        loginView.labelError.setText("");
        loginView.aceptarButton.addActionListener((ActionEvent evt) -> {
            login(evt);
        });
    }
}
