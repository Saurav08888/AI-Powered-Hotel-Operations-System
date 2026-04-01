package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec,bb;
    Dashboard(){
        super("Simba");

        rec = new JButton("RECEPTION");
        rec.setBounds(425,610,140,30);
        rec.setFont(new Font("serif", Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        rec.setBorder(BorderFactory.createEmptyBorder());
        rec.setFocusPainted(false);

        rec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rec.setBorder(BorderFactory.createLineBorder(new Color(255,180,80),2));
                rec.setBackground(new Color(255,130,0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rec.setBorder(BorderFactory.createLineBorder(new Color(255,180,80),1));
                rec.setBackground(new Color(255,98,0));
            }
        });


        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,610,140,30);
        add.setFont(new Font("serif", Font.BOLD,15));
        add.setBackground(new Color(59,130,246));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add.setBorder(BorderFactory.createEmptyBorder());
        add.setFocusPainted(false);

        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add.setBorder(BorderFactory.createLineBorder(new Color(0,255,255),2));
                add.setBackground(new Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add.setBorder(BorderFactory.createLineBorder(new Color(0,200,255),1));
                add.setBackground(new Color(0,123,255));
            }
        });
        add(add);


        bb = new JButton("Close");
        bb.setBounds(670,700,120,30);
        bb.setForeground(Color.white);
        bb.setBackground(new Color(30,41,59));
        bb.setFont(new Font("serif",Font.BOLD,15));
        bb.addActionListener(this);
        bb.setBorder(BorderFactory.createEmptyBorder());
        bb.setFocusPainted(false);

        bb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bb.setBorder(BorderFactory.createLineBorder(new Color(0,90,120),2));
                bb.setBackground(new Color(51,65,85)); // thoda lighter
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bb.setBorder(BorderFactory.createEmptyBorder());
                bb.setBackground(new Color(30,41,59)); // original
            }
        });

        add(bb);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/admin1.png"));
        Image i2 = i11.getImage().getScaledInstance(160,160, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(850,420,200,195);
        add(label1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(160,160, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(400,420,200,195);
        add(label11);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Simba1111.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1600,1090);
        add(label);

        setLayout(null);
        setSize(1950,1090);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rec){
            new Reception();
            setVisible(false);
        }else if(e.getSource()==bb){
            System.exit(0);


        }else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}