package ru.dia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reader extends JFrame{
	JButton b1, b2, b3;
	JLabel l1, l2;
	JTextField t1, t2;
	int cordinate, quantity;
	String a, b;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("New herd");
		b2 = new JButton("Go");	
		l1 = new JLabel("Enter cordinate of herdsman"); 
		l2 = new JLabel("Enter quantity of cows");		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
	}

	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				if (e.getSource() == b1){
					cordinate = Integer.parseInt(t1.getText());
					quantity = Integer.parseInt(t2.getText());
					//write add in memory
					//????
					t1.setText(null);
					t2.setText(null);									
				}
				if (e.getSource() == b2){
					cordinate = Integer.parseInt(t1.getText());
					quantity = Integer.parseInt(t2.getText());
					//write add in memory
					//????
					//go
					//????
					
				}
			} catch (Exception ex){JOptionPane.showMessageDialog(null, "Enter data");}
		}
	}
}

