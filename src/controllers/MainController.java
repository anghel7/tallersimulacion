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
import views.CreateLineaView;
import views.HomeView;
import views.LoginView;
import views.MainView;

/**
 *
 * @author skypper
 */
public class MainController {

    MainView mainView;
    HomeView homeView;
    LoginView loginView;
    LoginController loginController;
    CreateLineaView createLineaView;
    CreateLineaController createLineaController;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        homeView = new HomeView();
        loginView = new LoginView();
        loginController = new LoginController(loginView);
        
        createLineaView = new CreateLineaView();
        createLineaController = new CreateLineaController(createLineaView);
        
        initController();
    }

    private void removeAllElements() {
        this.mainView.getContentPane().removeAll();
    }

    public void initController() {
        mainView.loginMenuItem.addActionListener((ActionEvent evt) -> {
            showLoginView(evt);
        });
        mainView.logoutMenuItem.addActionListener((ActionEvent evt) -> {
            showHomeView(evt);
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

    public void showLoginView(ActionEvent evt) {
        loadView(loginView);
    }

    public void showHomeView(ActionEvent evt) {
        loadView(homeView);
    }

    public void showCreateLineaView(ActionEvent evt) {
        loadView(createLineaView);
    }

    public void showListLineaView(ActionEvent evt) {
        System.out.println("controllers.MainController.showListLineaView()");
    }

    public void showListParadaView(ActionEvent evt) {
        System.out.println("controllers.MainController.showListParadaView()");
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainView mainview = new MainView();
                MainController mainController = new MainController(mainview);
                mainview.setVisible(true);
            }
        });
    }

}
