/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.WindowConstants;
import models.ModelManager;
import views.CreateLineaView;
import views.HomeView;
import views.ListLineaView;
import views.ListParadaView;
import views.LoginView;
import views.MainView;

/**
 *
 * @author skypper
 */
public class MainController implements Router {

    MainView mainView;
    HomeView homeView;

    LoginView loginView;
    LoginController loginController;

    CreateLineaView createLineaView;
    CreateLineaController createLineaController;

    ListLineaView listLineaView;
    ListLineaController listLineaController;

    ListParadaView listParadaView;
    ListParadaController listParadaController;
    ModelManager modelManager;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        modelManager = ModelManager.getPopulateMainModel();
        homeView = new HomeView();
        loginView = new LoginView();
        loginController = new LoginController(loginView, this);

        createLineaView = new CreateLineaView();
        createLineaController = new CreateLineaController(createLineaView, this, modelManager);

        listLineaView = new ListLineaView();
        listLineaController = new ListLineaController(listLineaView, modelManager);

        listParadaView = new ListParadaView();
        listParadaController = new ListParadaController(listParadaView);

        initController();
    }

    private void removeAllElements() {
        this.mainView.getContentPane().removeAll();
    }

    public void initController() {
        enableMenubar(true);
        mainView.loginMenuItem.addActionListener((ActionEvent evt) -> {
            showLoginView(evt);
        });
        mainView.logoutMenuItem.addActionListener((ActionEvent evt) -> {
            showHomeView(evt);
            enableMenubar(false);
        });
        mainView.createLineaMenuItem.addActionListener((ActionEvent evt) -> {
            showCreateLineaView(evt);
        });
        mainView.listLineaMenuItem.addActionListener((ActionEvent evt) -> {
            showListLineaView(evt);
        });
        mainView.listParadaMenuItem.addActionListener((ActionEvent evt) -> {
            showListParadaView(evt);
        });

    }

    private void loadView(JComponent viewComponent) {
        removeAllElements();
        //set close Operation
        mainView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Creating Group Layout
        GroupLayout layout = new GroupLayout(mainView.getContentPane());
        //Set up Layout
        mainView.getContentPane().setLayout(layout);
        //Set up Horizontal Layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(viewComponent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Set up Vertical Layout
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(viewComponent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainView.pack();
    }

    @Override
    public void showLoginView(ActionEvent evt) {
        loadView(loginView);
    }

    @Override
    public void showHomeView(ActionEvent evt) {
        loadView(homeView);
    }

    @Override
    public void showCreateLineaView(ActionEvent evt) {
        loadView(createLineaView);
    }

    @Override
    public void showListLineaView(ActionEvent evt) {
        listLineaController.loadConf();
        loadView(listLineaView);
    }

    @Override
    public void showListParadaView(ActionEvent evt) {
        loadView(listParadaView);
    }

    @Override
    public void enableMenubar(boolean isEnabled) {
        mainView.lineasMenu.setEnabled(isEnabled);
        mainView.rutasMenu.setEnabled(isEnabled);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainView mainview = new MainView();
            MainController mainController = new MainController(mainview);
            mainview.setLocationRelativeTo(null);
            mainview.setVisible(true);
        });
    }

}
