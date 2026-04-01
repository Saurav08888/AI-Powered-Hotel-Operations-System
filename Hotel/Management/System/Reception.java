package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(15, 23, 42));
        add(panel1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/ABC.gif"));
        Image i22 = i111.getImage().getScaledInstance(1300,800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(0,0,1300,800);
        panel.add(label11);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/simba_text.gif"));
        Image i2 = i11.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(5,530,250,250);
        panel1.add(label1);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setFont(new Font("serif", Font.BOLD,15));

        btnNCF.setBackground(new Color(59,130,246));
        btnNCF.setForeground(Color.WHITE);

        btnNCF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNCF.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnNCF.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNCF.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnNCF.setBackground(new Color(0,123,255));
            }
        });
        btnNCF.setFocusPainted(false);


        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setFont(new Font("serif", Font.BOLD,15));

        btnRoom.setBackground(new Color(59,130,246));
        btnRoom.setForeground(Color.WHITE);

        btnRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRoom.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnRoom.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRoom.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnRoom.setBackground(new Color(0,123,255));
            }
        });
        btnRoom.setFocusPainted(false);

        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setFont(new Font("serif", Font.BOLD,15));

        btnDepartment.setBackground(new Color(59,130,246));
        btnDepartment.setForeground(Color.WHITE);

        btnDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepartment.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnDepartment.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepartment.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnDepartment.setBackground(new Color(0,123,255));
            }
        });
        btnDepartment.setFocusPainted(false);

        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setFont(new Font("serif", Font.BOLD,15));

        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(new Color(59,130,246));
        btnAEI.setForeground(Color.WHITE);

        btnAEI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAEI.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnAEI.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAEI.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnAEI.setBackground(new Color(0,123,255));
            }
        });
        btnAEI.setFocusPainted(false);

        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setFont(new Font("serif", Font.BOLD,15));

        btnCI.setBackground(new Color(59,130,246));
        btnCI.setForeground(Color.WHITE);

        btnCI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCI.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnCI.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCI.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnCI.setBackground(new Color(0,123,255));
            }
        });
        btnCI.setFocusPainted(false);

        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setFont(new Font("serif", Font.BOLD,15));

        btnMI.setBackground(new Color(59,130,246));
        btnMI.setForeground(Color.WHITE);

        btnMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMI.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnMI.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMI.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnMI.setBackground(new Color(0,123,255));
            }
        });
        btnMI.setFocusPainted(false);

        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,200,30);
        btnCO.setFont(new Font("serif", Font.BOLD,15));

        btnCO.setBackground(new Color(59,130,246));
        btnCO.setForeground(Color.WHITE);

        btnCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCO.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnCO.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCO.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnCO.setBackground(new Color(0,123,255));
            }
        });
        btnCO.setFocusPainted(false);

        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setFont(new Font("serif", Font.BOLD,15));

        btnUC.setBounds(30,310,200,30);
        btnUC.setBackground(new Color(59,130,246));
        btnUC.setForeground(Color.WHITE);

        btnUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUC.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnUC.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUC.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnUC.setBackground(new Color(0,123,255));
            }
        });
        btnUC.setFocusPainted(false);

        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,200,30);
        btnURS.setFont(new Font("serif", Font.BOLD,15));

        btnURS.setBackground(new Color(59,130,246));
        btnURS.setForeground(Color.WHITE);

        btnURS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnURS.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnURS.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnURS.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnURS.setBackground(new Color(0,123,255));
            }
        });
        btnURS.setFocusPainted(false);

        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick up Service");
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setFont(new Font("serif", Font.BOLD,15));

        btnPUS.setBackground(new Color(59,130,246));
        btnPUS.setForeground(Color.WHITE);

        btnPUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPUS.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnPUS.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPUS.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnPUS.setBackground(new Color(0,123,255));
            }
        });
        btnPUS.setFocusPainted(false);

        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setFont(new Font("serif", Font.BOLD,15));

        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(new Color(59,130,246));
        btnSR.setForeground(Color.WHITE);

        btnSR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSR.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                btnSR.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSR.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                btnSR.setBackground(new Color(0,123,255));
            }
        });
        btnSR.setFocusPainted(false);

        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,490,95,30);
        logout.setFont(new Font("serif", Font.BOLD,15));

        logout.setBackground(new Color(59,130,246));
        logout.setForeground(Color.WHITE);

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                logout.setBackground(new Color(255, 102, 102));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                logout.setBackground(new Color(0,123,255));
            }
        });
        logout.setFocusPainted(false);

        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,490,95,30);
        back.setFont(new Font("serif", Font.BOLD,15));

        back.setBackground(new Color(59,130,246));
        back.setForeground(Color.WHITE);

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                back.setBackground(new Color(140, 140, 140));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                back.setBackground(new Color(0,123,255));
            }
        });
        back.setFocusPainted(false);

        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }
}