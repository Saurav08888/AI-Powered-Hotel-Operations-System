package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {

    Splash(){

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/AA.gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(0,0,270,480);
        add(label);





        setLayout(null);
        setLocation(650,200);
        setSize(270,480);

        setUndecorated(true);
        setVisible(true);

        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);

        }catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Splash();
    }
}
