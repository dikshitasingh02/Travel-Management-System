package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class splash {
    public static void main(String[] args){
        splashFrame f1 = new splashFrame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f1.setLocation(900 - ((i+x)/2), 500 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        
    }
}
class splashFrame extends JFrame implements Runnable{
    Thread t1;
    splashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash4.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1030, 550,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}