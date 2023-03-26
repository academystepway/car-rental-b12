package org.carrental.ui;

import org.carrental.service.CustomerService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomerPanelUi {



    private final CustomerService customerService = new CustomerService();

    public CustomerPanelUi(){
        JFrame frame = new JFrame("Car Rental APP - Customer Panel");

        JPanel tblAndSearchPanel = new JPanel();
        tblAndSearchPanel.setBackground(Color.GRAY);
        tblAndSearchPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JTextField searchTf = new JTextField(30);



        String[][] data = customerService.getAllCustomerForJTable();


        String column[]={"NAME","PHONE_NUMBER","CNIC","ADDRESS","REF_PH_NO"};


        DefaultTableModel dtm = new DefaultTableModel(data,column);
        JTable jt=new JTable(dtm);
       // jt.setBounds(30,40,200,300);
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

        addCustomerButton.addActionListener(e->{
            frame.dispose();
            new AddCustomerUI();
        });


        searchTf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {

            }
            @Override
            public void keyReleased(KeyEvent e) {
                String[][] data =  customerService.searchByName(searchTf.getText());
                DefaultTableModel dtm = new DefaultTableModel(data,column);
                jt.setModel(dtm);

            }
        });



        frame.setLayout(new GridLayout(1,2,150,5));

        frame.add(tblAndSearchPanel);
        frame.add(actionButtonPanel);

        frame.setSize(1500,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
