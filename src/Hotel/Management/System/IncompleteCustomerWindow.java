package Hotel.Management.System;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class IncompleteCustomerWindow extends JFrame {

    JTable table;
    DefaultTableModel model;

    public IncompleteCustomerWindow() {

        setTitle("⚠️ Incomplete Customer Records");
        setSize(850, 400);

        setUndecorated(true);
        //setLocationRelativeTo(null);
        setLocation(180, 200);
        setLayout(new BorderLayout());

        // Table setup
        model = new DefaultTableModel();
        model.addColumn("Room");
        model.addColumn("Customer Name");
        model.addColumn("Missing Fields");

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        add(sp, BorderLayout.CENTER);

        // 🔙 BACK BUTTON (BOTTOM)
        JButton backBtn = new JButton("Back");
        backBtn.setFocusPainted(false);
        backBtn.setBackground(new Color(200, 50, 50));
        backBtn.setForeground(Color.WHITE);

        backBtn.addActionListener(e -> {
            dispose();
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(backBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        loadIncompleteData();

        setVisible(true);
    }

    public void loadIncompleteData() {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotel_management_system",
                    "root",
                    "root"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM customer");

            while (rs.next()) {

                String missing = "";

                if (rs.getString("document") == null || rs.getString("document").trim().isEmpty())
                    missing += "Document, ";

                if (rs.getString("number") == null || rs.getString("number").trim().isEmpty())
                    missing += "Number, ";

                if (rs.getString("name") == null || rs.getString("name").trim().isEmpty())
                    missing += "Name, ";

                if (rs.getString("gender") == null || rs.getString("gender").trim().isEmpty())
                    missing += "Gender, ";

                if (rs.getString("country") == null || rs.getString("country").trim().isEmpty())
                    missing += "Country, ";

                if (rs.getString("room") == null || rs.getString("room").trim().isEmpty())
                    missing += "Room, ";

                if (rs.getString("checkintime") == null || rs.getString("checkintime").trim().isEmpty())
                    missing += "Check-in Time, ";

                if (rs.getString("deposit") == null || rs.getString("deposit").trim().isEmpty())
                    missing += "Deposit, ";

                if (!missing.isEmpty()) {

                    missing = missing.substring(0, missing.length() - 2);

                    model.addRow(new Object[]{
                            rs.getString("room"),
                            rs.getString("name"),
                            missing
                    });
                }
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// 🏠 ADMIN PANEL
class AdminPanel extends JFrame {

    public AdminPanel() {

        setTitle("Admin Panel");
        setUndecorated(true);
        setSize(350, 240);
        //setLocationRelativeTo(null);
        setLocation(550,300);
        setLayout(new BorderLayout());


        // 🔝 HEADING
        JLabel heading = new JLabel("Incomplete Details of Customers", JLabel.CENTER);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 16));
        heading.setForeground(new Color(200, 50, 50));

        // 🔥 PARAGRAPH
        JLabel desc = new JLabel(
                "<html><center>This section helps you identify customers with missing or incomplete details.<br>" +
                        "Ensure all required information is properly filled to maintain accurate records.</center></html>",
                JLabel.CENTER
        );
        desc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        desc.setForeground(Color.DARK_GRAY);

        // TOP PANEL
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);

        topPanel.add(Box.createVerticalStrut(10));
        topPanel.add(heading);
        topPanel.add(Box.createVerticalStrut(8));
        topPanel.add(desc);

        add(topPanel, BorderLayout.CENTER);

        // 🔽 BUTTONS
        JButton openBtn = new JButton("Incomplete Customers");
        openBtn.setFocusPainted(false);

        openBtn.addActionListener(e -> {
            new IncompleteCustomerWindow();
            setVisible(false);
        });

        JButton backBtn = new JButton("Back");
        backBtn.setFocusPainted(false);
        backBtn.setBackground(new Color(200, 50, 50));
        backBtn.setForeground(Color.WHITE);

        backBtn.addActionListener(e -> {
            dispose();
        });

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        bottomPanel.add(openBtn);
        bottomPanel.add(backBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPanel();
    }
}