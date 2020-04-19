package jx07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyDraw3 extends JPanel implements MouseListener {
	private int x1,x2, y1,y2,x0,y0,width,height;
	static int gp=1,R=1,G=1,B=1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setTitle("MyDraw3View");

		Container c = f.getContentPane();
		DrawOption dop = new DrawOption();
		MyDraw3 md = new MyDraw3();
		c.add(md);
		c.add(dop,BorderLayout.SOUTH);
		f.setVisible(true);
	}
	public MyDraw3() {

		addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		g.setColor(new Color(R,G,B));
		switch(gp){
		case 1:
			g.drawLine(x1,y1,x2,y2);
			break;
		case 2:
			g.drawRect(x0, y0, width, height);
			break;
		case 3:
			g.fillRect(x0, y0, width, height);
			break;		
		case 4:
			g.drawOval(x0, y0, width, height);
			break;
		case 5:
			g.fillOval(x0, y0, width, height);
			break;
		case 6:
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



