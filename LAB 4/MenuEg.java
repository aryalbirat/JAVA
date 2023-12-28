package first;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuEg extends JFrame implements ActionListener
{
	JMenuBar bar;
	JMenu file ;
	JMenuItem sa,cut,copy,paste,exit;
	JTextArea ta;
	JLabel label;

	public MenuEg() {
		setSize(400,500);
		bar=new JMenuBar();
		setJMenuBar(bar);
		file=new JMenu("FILE");
		bar.add(file);
		sa=new JMenuItem ("SELECT ALL");
		cut=new JMenuItem ("CUT");
		copy=new JMenuItem ("COPY");
		paste=new JMenuItem ("PASTE");
		exit=new JMenuItem ("EXIT");
		file.add(sa);
		file.add(cut);
		file.add(copy);
		file.add(paste);
		file.addSeparator();
		file.add(exit);
		
		label= new JLabel();
		label.setBounds(2,4,100,70);
		
		ta=new JTextArea("TYPE SOMETHING");
		ta.setBounds(150,20,90,60);
		add(label);
		add(ta);
		setLayout(null);
		setVisible(true);
		sa.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		exit.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String item=e.getActionCommand();
		label.setText ("YOU CLICKED :"+item);
		
		switch(item)
		{
		case "SELECT ALL":
		ta.selectAll();
		break;
		
		case "CUT":
		ta.cut();
		break;
		
		case "COPY":
		ta.copy();
		break;
		
		case "PASTE":
		ta.paste();
		break;
		
		case "EXIT":
		System.exit(0);
		break;
	
		}
	}
	
	public static void main(String[] args)
	{
		new MenuEg();
	}
}



