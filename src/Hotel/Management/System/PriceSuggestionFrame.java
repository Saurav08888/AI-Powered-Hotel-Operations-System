package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PriceSuggestionFrame extends JFrame {

    private JTextArea output;

    public PriceSuggestionFrame() {

        setTitle("AI Room Price Suggestion");
        setSize(700, 500);
        //setLocationRelativeTo(null);
        setLocation(300, 150);

        setUndecorated(true);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(8, 12, 25));

        // 🔥 TITLE
        JLabel title = new JLabel("AI Room-wise Price Suggestion", JLabel.CENTER);
        title.setForeground(new Color(255, 150, 0));
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));

        // 🔥 OUTPUT
        output = new JTextArea();
        output.setEditable(false);
        output.setBackground(new Color(10, 15, 30));
        output.setForeground(new Color(255, 220, 180));
        output.setFont(new Font("Consolas", Font.PLAIN, 14));
        output.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JScrollPane scroll = new JScrollPane(output);

        // 🔥 BUTTON PANEL (BOTTOM)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(8, 12, 25));

        JButton generateBtn = new JButton("GENERATE PRICES");
        generateBtn.setBackground(new Color(255, 150, 0));
        generateBtn.setFocusPainted(false);
        generateBtn.setForeground(Color.BLACK);
        generateBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JButton backBtn = new JButton("Back");
        backBtn.setBackground(new Color(60, 60, 60));
        backBtn.setFocusPainted(false);
        backBtn.setForeground(Color.WHITE);
        backBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        // 🔥 ACTIONS
        generateBtn.addActionListener(e -> generateRoomPricing());
        backBtn.addActionListener(e -> dispose());

        buttonPanel.add(backBtn);
        buttonPanel.add(generateBtn);

        add(title, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // 🔗 DB CONNECTION
    private Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/hotel_management_system?useSSL=false";
            String user = "root";
            String pass = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error!");
            return null;
        }
    }

    // 🚀 MAIN LOGIC
    private void generateRoomPricing() {

        try {
            Connection con = connect();
            if (con == null) return;

            String query = "SELECT room.roomnumber, room.price, COUNT(customer.room) as total " +
                    "FROM room LEFT JOIN customer ON room.roomnumber = customer.room " +
                    "GROUP BY room.roomnumber, room.price";

            ResultSet rs = con.createStatement().executeQuery(query);

            output.setText("ROOM-WISE AI PRICE SUGGESTION\n");
            output.append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n\n");

            while (rs.next()) {

                String roomNo = rs.getString("roomnumber");
                int price = Integer.parseInt(rs.getString("price"));
                int demand = rs.getInt("total");

                int newPrice;
                String level;

                if (demand > 5) {
                    newPrice = price + (price * 20 / 100);
                    level = "HIGH";
                }
                else if (demand == 0) {
                    newPrice = price - (price * 15 / 100);
                    level = "LOW";
                }
                else {
                    newPrice = price + (price * 5 / 100);
                    level = "MODERATE";
                }

                output.append("Room: " + roomNo + "\n");
                output.append("Current Price: ₹" + price + "\n");
                output.append("Customers: " + demand + "\n");
                output.append("Demand Level: " + level + "\n");
                output.append("Suggested Price: ₹" + newPrice + "\n");
                output.append("────────────────────────────\n\n");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PriceSuggestionFrame().setVisible(true);
    }
}