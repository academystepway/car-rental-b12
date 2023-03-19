package org.carrental.ui;

import org.carrental.service.AuthenticationService;

import javax.swing.*;
import java.awt.*;

public class LoginUI {

    private final AuthenticationService authenticationService = new AuthenticationService();

    public LoginUI(){
        //defining a frame
        JFrame frame = new JFrame("Rental Car APP");

        JTextField usertf = new JTextField("username");
        usertf.setBounds(150,100,200,30);

        JTextField passtf = new JTextField("password");
        passtf.setBounds(150,150,200,30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(200,300,100,30);


        frame.add(usertf);
        frame.add(passtf);
        frame.add(loginBtn);

        //check login
        loginBtn.addActionListener((event)->{
            if(authenticationService.checkLogin(usertf.getText(),passtf.getText())){
                frame.dispose();
                new HomeUi();
            }else {
                JOptionPane.showMessageDialog(frame,"Incorrect credentials");
            }
        });


        //basic properties
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
