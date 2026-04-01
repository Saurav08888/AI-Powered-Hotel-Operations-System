package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;


    Login(){

        JLabel label1=new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Segoe UI",Font.BOLD,16));
        label1.setForeground(Color.white);
        add(label1);

        JLabel label2=new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Segoe UT",Font.BOLD,16));
        label2.setForeground(Color.white);
        add(label2);


        textField1=new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.white);
        textField1.setBackground(new Color(51,65,85));
        textField1.setFont(new Font("Segoe UI",Font.BOLD,16));
        textField1.setBorder(BorderFactory.createLineBorder(new Color(0, 200, 255)));
        add(textField1);

        passwordField1=new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.white);
        passwordField1.setBackground(new Color(51,65,85));
        passwordField1.setFont(new Font("Segoe UI",Font.BOLD,16));
        passwordField1.setBorder(BorderFactory.createLineBorder(new Color(0, 200, 255)));
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Simba.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(255, 300, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,10,255,270);

        add(label);

        b1=new JButton("Login");
        b1.setBounds(40,180,120,30);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(59,130,246));
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFocusPainted(false);

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                b1.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                b1.setBackground(new Color(0,123,255));
            }
        });

        add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(180,180,120,30);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(30,41,59));
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createEmptyBorder());

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2.setBorder(BorderFactory.createLineBorder(new Color(0,90,120),2));
                b2.setBackground(new Color(51,65,85)); // thoda lighter
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2.setBorder(BorderFactory.createEmptyBorder());
                b2.setBackground(new Color(30,41,59)); // original
            }
        });

        b2.setFocusPainted(false);

        add(b2);



        getContentPane().setBackground(new  Color(0,0,0));
        setLayout(null);

        setLocation(400,270);
        setSize(600,300);
        setUndecorated(true);

        getContentPane().addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ((JComponent)getContentPane()).setBorder(
                        BorderFactory.createLineBorder(new Color(0,255,255), 2)
                );
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ((JComponent)getContentPane()).setBorder(
                        BorderFactory.createLineBorder(new Color(0,180,255), 1)
                );
            }
        });


        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){

            try{
                con c = new con();
                String user=textField1.getText();
                String pass=passwordField1.getText();

                String q="select * from login where username='"+user+"' and password='"+pass+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    new Dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password");
                }


            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            System.exit(102);
        }

    }

    public static void main(String[] args) {
        new Login();

    }
}
