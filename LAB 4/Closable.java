import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Closable extends WindowAdapter {

    JFrame f;

    public Closable() {
        f=new JFrame();
        f.setSize(200,300);
        f.setVisible(true);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public void windowClosing(WindowEvent e)
    {
        int choice=JOptionPane.showConfirmDialog(f,"ARE YOU SURE?");
        if(choice==JOptionPane.YES_OPTION)
        {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args)
    {
        new Closable();
    }
}