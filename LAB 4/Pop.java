


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pop extends JFrame implements ActionListener,MouseListener
{
	JPopupMenu file ;
	JMenuItem sa,cut,copy,paste,exit;
	JTextArea ta;
	JLabel label;

	public Pop() {
		setSize(400,500);
		file=new JPopupMenu();
		add(file);
	
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
		label.setBounds(2,4,300,70);
		
		ta=new JTextArea("TYPE SOMETHING");
		ta.setBounds(150,170,200,70);
		add(label);
		add(ta);
		setLayout(null);
		setVisible(true);
		sa.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		exit.addActionListener(this);	
		addMouseListener(this);
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
		new Pop();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		file.show(this,e.getX(),e.getY());		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}



