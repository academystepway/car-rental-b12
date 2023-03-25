package org.carrental.ui;

import javax.swing.*;
import java.awt.*;

public class CustomerPanelUi {


    public CustomerPanelUi(){
        JFrame frame = new JFrame("Car Rental APP - Customer Panel");

        JPanel tblAndSearchPanel = new JPanel();
        tblAndSearchPanel.setBackground(Color.GRAY);
        tblAndSearchPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JTextField searchTf = new JTextField(30);

        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);

        tblAndSearchPanel.add(searchTf);
        tblAndSearchPanel.add(sp);


        JPanel actionButtonPanel = new JPanel();
        actionButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JButton addCustomerButton = new JButton("ADD");
        JButton editCustomerButton = new JButton("EDIT");
        JButton deleteCustomerButton = new JButton("DELETE");
        JButton back = new JButton("BACK");

        actionButtonPanel.add(addCustomerButton);
        actionButtonPanel.add(editCustomerButton);
        actionButtonPanel.add(deleteCustomerButton);
        actionButtonPanel.add(back);





        frame.setLayout(new GridLayout(1,2,150,5));

        frame.add(tblAndSearchPanel);
        frame.add(actionButtonPanel);

        frame.setSize(1500,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
