package jx07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DrawOption extends MyDraw3 implements ActionListener,ChangeListener{
	private JButton b1;
	private JButton b2;
	private JComboBox combo;
	private JSlider s1;
	private JSlider s2;
	private JSlider s3;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private String[] combodata = {"Line", "Rect", "FillRect", "Orval","FillOrval"};


	public DrawOption(){
		b1 = new JButton("Clear");
		b2 = new JButton("Quit");
		combo = new JComboBox(combodata);
		s1 = new JSlider(JSlider.HORIZONTAL,0,255,0);
		s2 = new JSlider(JSlider.HORIZONTAL,0,255,0);
		s3 = new JSlider(JSlider.HORIZONTAL,0,255,0);
		l1 = new JLabel("R");
		l2 = new JLabel("G");
		l3 = new JLabel("B");


		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setLayout(new GridLayout(3,2));
		p1.add(l1);
		p1.add(s1);
		p1.add(l2);
		p1.add(s2);
		p1.add(l3);
		p1.add(s3);
		p2.setLayout(new GridLayout(1,2));
		p2.add(b1);
		p2.add(b2);
		setLayout(new BorderLayout());
		add(combo,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		combo.addActionListener(this);
		s1.addChangeListener(this);
		s2.addChangeListener(this);
		s3.addChangeListener(this);

	}
	public void stateChanged(ChangeEvent e) {
		R = s1.getValue();
		G = s2.getValue();
		B = s3.getValue();
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == combo) {
			switch(combo.getSelectedIndex()) {
			case 0:
				gp = 1;
				break;
			case 1:	
				gp = 2;
				break;
			case 2:
				gp = 3;
				break;
			case 3:
				gp = 4;
				break;
			case 4:
				gp = 5;
				break;
			}			
		}else if(e.getSource() == b1){ 
			gp = 6;
		}else if(e.getSource() == b2){
			System.exit(0);
		}
	}
}






