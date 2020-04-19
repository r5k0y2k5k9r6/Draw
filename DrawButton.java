package jx07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawButton extends MyDraw2 implements ActionListener{
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;



	public DrawButton(){
		b1 = new JButton("Line");
		b2 = new JButton("Rect");
		b3 = new JButton("Oval");
		b4 = new JButton("Black");
		b5 = new JButton("Red");
		b6 = new JButton("Green");
		b7 = new JButton("Clear");
		b8 = new JButton("Quit");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.setLayout(new GridLayout(2,3));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p2.setLayout(new GridLayout(1,2));
		p2.add(b7);
		p2.add(b8);
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){ 
		if(e.getSource() == b1){ 
			gp = 1;
		}else if(e.getSource() == b2){
			gp = 2;
		}else if(e.getSource() == b3) {
			gp = 3;
		}else if(e.getSource() == b4) {
			gc = 1;
		}else if(e.getSource() == b5) {
			gc = 2;
		}else if(e.getSource() == b6) {
			gc = 3;
		}else if(e.getSource() == b7) {
			gp = 4;
		}else if(e.getSource() == b8) {
			System.exit(0);
		}
	}
}