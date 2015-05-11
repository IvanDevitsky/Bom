package ru.dia;

import javax.swing.JFrame;

public class Main {
	private int bom = 100000;
	private int range = 10000;
	private int quantum = 1000;
	private int v_cow = 1;
	private int v_herdsman = 2;
	
	private int hat = 0;
	
	
	public static void main(String[] args) {
		//create picture
		/* //????
		Picture p = new Picture ("Bom");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(250, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		*/
		//start data interface
		Reader r = new Reader ("StartData");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200, 170);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
		
		/*
		while (true)
		{
			
		}
*/
	}

}
