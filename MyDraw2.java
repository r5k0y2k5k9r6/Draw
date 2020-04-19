package jx07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyDraw2 extends JPanel implements MouseListener {
	private int x1,x2, y1,y2,x0,y0,width,height;
	static int gp=1,gc=1;
	

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setTitle("MyDraw2");

		Container c = f.getContentPane();
		DrawButton db = new DrawButton();
		MyDraw2 md = new MyDraw2();
		c.add(md);
		c.add(db,BorderLayout.SOUTH);

		f.setVisible(true);

	}
	
	public MyDraw2(){
		addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		switch(gc) {
		case 1:
			g.setColor(Color.black);
			break;
		case 2:
			g.setColor(Color.red);
			break;
		case 3:
			g.setColor(Color.green);
			break;
		}
		switch(gp){
		case 1:
			g.drawLine(x1,y1,x2,y2);
			break;
		case 2:
			g.drawRect(x0, y0, width, height);
			break;
		case 3:
			g.drawOval(x0, y0, width, height);
			break;		
		case 4:
			super.paintComponent(g);
			break;
		}

	}

	public void mousePressed(MouseEvent e){
		x0 = x1 = e.getX();
		y0 = y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();
		width = Math.abs(x1-x2);
		height = Math.abs(y1-y2);	
		if(x0 > x2) x0 = x2;
		if(y0 > y2) y0 = y2;
		repaint();
	}
	public void mouseClicked(MouseEvent e){}

	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

}
