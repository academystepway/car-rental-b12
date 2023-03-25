package org.carrental.ui;

import javax.swing.*;
import java.awt.*;

public class HomeUi {

    public static void main(String[] args) {
        new HomeUi();
    }
    public HomeUi(){
        JFrame frame = new JFrame("Car Rental APP - HOME");

        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JButton customerBtn = new JButton("Customer");
        addImageOnButton(customerBtn,"src/main/resources/customer-icon.png",100,100);


        customerBtn.addActionListener(e->{
            frame.dispose();
            new CustomerPanelUi();
        });


        JButton vehicleBtn = new JButton("Vehicle");
        addImageOnButton(vehicleBtn,"src/main/resources/car-vehicle-insurance-icon.png",100,100);

        JButton vehicleOwnerBtn = new JButton("VehicleOwner");

        JButton bookingBtn = new JButton("Booking");

        JButton userBtn = new JButton("User");

        JButton logoutBtn = new JButton("Logout");

        frame.add(customerBtn);
        frame.add(vehicleBtn);
        frame.add(vehicleOwnerBtn);
        frame.add(bookingBtn);
        frame.add(userBtn);
        frame.add(logoutBtn);


        frame.setSize(1500,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addImageOnButton(JButton button,String imagePath,int height,int width){
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image newImage = imageIcon.getImage().getScaledInstance(width,height,Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(newImage));

    }
}
