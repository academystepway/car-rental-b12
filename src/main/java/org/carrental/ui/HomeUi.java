package org.carrental.ui;

import javax.swing.*;
import java.awt.*;

public class HomeUi {
    public HomeUi(){
        JFrame frame = new JFrame("Car Rental APP - HOME");

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        btnPanel.add(new JButton("1"));
        btnPanel.add(new JButton("2"));
        btnPanel.add(new JButton("3"));
        btnPanel.add(new JButton("4"));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};

        String column[]={"ID","NAME","SALARY"};

        JTable jt=new JTable(data,column);
        JScrollPane sp=new JScrollPane(jt);
        tablePanel.add(sp);

        frame.setLayout(new BorderLayout(10,50));

        frame.add(btnPanel,BorderLayout.SOUTH);
        frame.add(tablePanel,BorderLayout.CENTER);
        frame.add(new JButton("hello"),BorderLayout.NORTH);

        frame.setSize(1500,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
