package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber ,TextName, TextCountry,TextDeposite;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;

    JButton add,back;
    NewCustomer(){

        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d=(Graphics2D) g;
                Color color1=new Color(15,45,60);
                Color color2=new Color(10,25,35);
                GradientPaint gp=new GradientPaint(0,0,color1,0,getHeight(),color2);
                g2d.setPaint(gp);
                g2d.fillRect(0,0,getWidth(),getHeight());
            }
        };
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(15,45,60));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/rating.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Segoe UI", Font.BOLD,20));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(new Color(0,255,200));
        labelID.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setForeground(new Color(0,255,200));
        labelNumber.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(35,151,200,16);
        labelname.setForeground(new Color(0,255,200));
        labelname.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        panel.add(labelname);
        TextName = new JTextField();
        TextName.setBackground(new Color(230,230,230));
        TextName.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
        TextName.setBounds(271,151,150,20);
        panel.add(TextName);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,200,14);
        labelGender.setForeground(new Color(0,255,200));
        labelGender.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        r1.setOpaque(false);
        r1.setFocusPainted(false);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Segoe UI", Font.BOLD, 13));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,80,12);
        r2.setOpaque(false);
        r2.setFocusPainted(false);
        panel.add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,231,200,14);
        labelCountry.setForeground(new Color(0,255,200));
        labelCountry.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelCountry);
        TextCountry = new JTextField();
        TextCountry.setBackground(new Color(230,230,230));
        TextCountry.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
        TextCountry.setBounds(271,231,150,20);
        panel.add(TextCountry);


        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setForeground(new Color(0,255,200));
        labelRoom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelRoom);

        c1 = new Choice();
        try{

            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,316,200,14);
        labelCIS.setForeground(new Color(0,255,200));
        labelCIS.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelCIS);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(date);


        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,359,200,14);
        labelDeposite.setForeground(new Color(0,255,200));
        labelDeposite.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(labelDeposite);
        TextDeposite = new JTextField();
        TextDeposite.setBackground(new Color(230,230,230));
        TextDeposite.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
        TextDeposite.setBounds(271,359,150,20);
        panel.add(TextDeposite);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(new Color(0,120,180));
        add.setFocusPainted(false);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(15, 23, 42));
        back.setFocusPainted(false);
        back.addActionListener(this);

        panel.add(back);

        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            con c = new con();
            String radioBTn = null;
            if (r1.isSelected()){
                radioBTn = "Male";
            } else if (r2.isSelected()) {
                radioBTn = "Female";
            }

            String s1 = (String)comboBox.getSelectedItem();
            String s2 =  textFieldNumber.getText();
            String s3 =  TextName.getText();
            String s4 =  radioBTn;
            String s5 =  TextCountry.getText();
            String s6 =  c1.getSelectedItem();
            String s7 =  date.getText();
            String s8 = TextDeposite.getText();

            try {

                String q ="insert into customer values ('"+s1+"', '"+s2+"','"+s3+"','"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "added Successfully");
                setVisible(false);

            }catch (Exception E) {
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}