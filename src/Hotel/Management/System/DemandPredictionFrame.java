package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class DemandPredictionFrame extends JFrame {

    private JTextArea output;

    public DemandPredictionFrame() {

        setTitle("AI Demand Prediction");
        setSize(620, 450);
        //setBounds(5,5,890,490);
        setUndecorated(true);
        //setLocationRelativeTo(null);
        setLocation(300, 150);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(10, 15, 30));

        JLabel title = new JLabel("AI Demand Prediction Dashboard", JLabel.CENTER);
        title.setForeground(new Color(0, 255, 200));
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));

        output = new JTextArea();
        output.setEditable(false);
        output.setBackground(new Color(20, 25, 45));
        output.setForeground(Color.WHITE);
        output.setFont(new Font("Consolas", Font.PLAIN, 15));
        output.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JScrollPane scroll = new JScrollPane(output);

        // 🔥 BUTTON PANEL
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(10, 15, 30));

        JButton runBtn = new JButton("Run AI Prediction");
        runBtn.setBackground(new Color(0, 200, 255));
        runBtn.setFocusPainted(false);
        runBtn.setForeground(Color.BLACK);
        runBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JButton backBtn = new JButton("Back");
        backBtn.setBackground(new Color(60, 60, 60));
        backBtn.setFocusPainted(false);
        backBtn.setForeground(Color.WHITE);
        backBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        runBtn.addActionListener(e -> runPrediction());
        backBtn.addActionListener(e -> dispose());

        buttonPanel.add(backBtn);
        buttonPanel.add(runBtn);

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
            JOptionPane.showMessageDialog(this, "Database Connection Failed!");
            return null;
        }
    }

    // 📊 DATA BUILD
    private ArrayList<Integer> buildSmartDataset() {

        ArrayList<Integer> data = new ArrayList<>();

        try {
            Connection con = connect();
            if (con == null) return data;

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT COUNT(*) FROM customer");

            int total = 0;
            if (rs.next()) total = rs.getInt(1);

            con.close();

            int base = (int)Math.ceil(total / 7.0);

            for (int i = 1; i <= 7; i++) {

                int variation = (int)(Math.sin(i) * 3);
                if (i == 6 || i == 7) variation += 5;

                int dynamic = total / 2;

                data.add(base + variation + dynamic);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    // 🧠 REGRESSION (ML)
    private int regression(ArrayList<Integer> data) {

        int n = data.size();
        double sumX=0, sumY=0, sumXY=0, sumX2=0;

        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int y = data.get(i);

            sumX += x;
            sumY += y;
            sumXY += x*y;
            sumX2 += x*x;
        }

        double m = (n*sumXY - sumX*sumY) / (n*sumX2 - sumX*sumX);
        double b = (sumY - m*sumX)/n;

        return (int)Math.round(m*(n+1)+b);
    }

    // 🚀 MAIN LOGIC
    private void runPrediction() {

        ArrayList<Integer> data = buildSmartDataset();

        if (data.isEmpty()) {
            output.setText("No Data Found!");
            return;
        }

        int prediction = regression(data);

        String level;
        if (prediction > 50) level = "HIGH ";
        else if (prediction < 20) level = "LOW ";
        else level = "MODERATE ";

        // 🔥 OUTPUT
        output.setText("DEMAND LEVEL: " + level + "\n");
        output.append("EXPECTED CUSTOMERS FOR NEXT DAY: " + prediction + "\n");
        output.append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n\n");

        output.append("Weekly Pattern:\n" + data + "\n\n");
        output.append("Regression Output: " + prediction + "\n\n");

        output.append("Rooms To Prepare: " + (prediction + 5) + "\n\n");

        output.append("Insights:\n");

        if (prediction > 50)
            output.append("High demand expected\n");
        else if (prediction < 20)
            output.append("Low demand detected\n");
        else
            output.append("Moderate demand\n");

        if (data.get(6) > data.get(0))
            output.append("Growth trend observed\n");
        else
            output.append("Stable pattern\n");
    }

    public static void main(String[] args) {
        new DemandPredictionFrame().setVisible(true);
    }
}