package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, logout, back, demand,price,incom;
    admin(){

        add_Employee = new JButton( "ADD EMPLOYEE");
        add_Employee.setBounds(250,250,200,30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Employee.addActionListener(this);

        add_Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_Employee.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                add_Employee.setBackground(new Color(0,150,255));
                add_Employee.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_Employee.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                add_Employee.setBackground(Color.WHITE);
                add_Employee.setForeground(Color.BLACK);
            }
        });
        add_Employee.setFocusPainted(false);

        add(add_Employee);



        demand = new JButton( "Demand");
        demand.setBounds(750,250,200,30);
        demand.setBackground(Color.WHITE);
        demand.setForeground(Color.BLACK);
        demand.setFont(new Font("Tahoma", Font.BOLD, 15));
        demand.addActionListener(this);

        demand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                demand.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                demand.setBackground(new Color(0,150,255));
                demand.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                demand.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                demand.setBackground(Color.WHITE);
                demand.setForeground(Color.BLACK);
            }
        });
        demand.setFocusPainted(false);

        add(demand);


        price = new JButton( "Price Suggest");
        price.setBounds(750,420,200,30);
        price.setBackground(Color.WHITE);
        price.setForeground(Color.BLACK);
        price.setFont(new Font("Tahoma", Font.BOLD, 15));
        price.addActionListener(this);

        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                price.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                price.setBackground(new Color(0,150,255));
                price.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                price.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                price.setBackground(Color.WHITE);
                price.setForeground(Color.BLACK);
            }
        });
        price.setFocusPainted(false);

        add(price);



        incom = new JButton( "Missing Details");
        incom.setBounds(750,580,200,30);
        incom.setBackground(Color.WHITE);
        incom.setForeground(Color.BLACK);
        incom.setFont(new Font("Tahoma", Font.BOLD, 15));
        incom.addActionListener(this);

        incom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                incom.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                incom.setBackground(new Color(0,150,255));
                incom.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                incom.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                incom.setBackground(Color.WHITE);
                incom.setForeground(Color.BLACK);
            }
        });
        incom.setFocusPainted(false);

        add(incom);






        add_Room = new JButton( "ADD ROOM");
        add_Room.setBounds(250,420,200,30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Room.addActionListener(this);

        add_Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_Room.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                add_Room.setBackground(new Color(0,150,255));
                add_Room.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_Room.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                add_Room.setBackground(Color.WHITE);
                add_Room.setForeground(Color.BLACK);
            }
        });
        add_Room.setFocusPainted(false);


        add(add_Room);

        add_Drivers = new JButton( "ADD DRIVERS");
        add_Drivers.setBounds(250,580,200,30);
        add_Drivers.setBackground(Color.WHITE);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Drivers.addActionListener(this);

        add_Drivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_Drivers.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                add_Drivers.setBackground(new Color(0,150,255));
                add_Drivers.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_Drivers.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                add_Drivers.setBackground(Color.WHITE);
                add_Drivers.setForeground(Color.BLACK);
            }
        });
        add_Drivers.setFocusPainted(false);

        add(add_Drivers);

        logout = new JButton( "Logout");
        logout.setBounds(30,750,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                logout.setBackground(new Color(255, 102, 102));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                logout.setBackground(Color.BLACK);
            }
        });
        logout.setFocusPainted(false);

        add(logout);

        back = new JButton( "Back");
        back.setBounds(350,750,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/division.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);



        ImageIcon l2 = new ImageIcon(ClassLoader.getSystemResource("icon/pro.png"));
        Image l112 = l2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(l112);
        JLabel label22 = new JLabel(imageIcon22);
        label22.setBounds(600,170,120,120);
        add(label22);



        ImageIcon l23 = new ImageIcon(ClassLoader.getSystemResource("icon/price.png"));
        Image l1123 = l23.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon223 = new ImageIcon(l1123);
        JLabel label223 = new JLabel(imageIcon223);
        label223.setBounds(600,350,120,120);
        add(label223);



        ImageIcon l234 = new ImageIcon(ClassLoader.getSystemResource("icon/miss.png"));
        Image l11234 = l234.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2234 = new ImageIcon(l11234);
        JLabel label2234 = new JLabel(imageIcon2234);
        label2234.setBounds(600,500,120,120);
        add(label2234);







        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/bed.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/Drive.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/simba_text.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(1000,250,400,400);
        add(label3);


        getContentPane().setBackground(new Color(15, 23, 42));
        setLayout(null);
        setSize(1950,1090);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Employee){
            new AddEmployee();
        } else if (e.getSource() == demand){
            new DemandPredictionFrame().setVisible(true);
        } else if (e.getSource()== price) {
            new PriceSuggestionFrame().setVisible(true);
        } else if (e.getSource()==incom) {
            new AdminPanel().setVisible(true);
        } else if (e.getSource() == add_Room) {
            new AddRoom();
        } else if (e.getSource() ==  add_Drivers) {
            new addDriver();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new admin();
    }
}