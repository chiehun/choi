package com.hun;

import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class BoxLabel {
	final int MAXSIZE = 10;
	int currentSize;

	public BoxLabel() {
		currentSize = MAXSIZE;
	}
	public boolean consume() {
		if(currentSize >0) {
			currentSize--;
			return true;
		}else {
			return false;
		}
	}// consume() END
	public void reset() {
		currentSize = MAXSIZE;
	}
	public boolean isEmpty() {
		return currentSize==0;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY);
		int y = this.getHeight() - (currentSize*this.getHeight()/ MAXSIZE);
		g.fillRect(0, y, this.getWidth,this.getHeight()-y);
		
		g.setColor(Color.GRAY);
		g.drawRect(0, 0, this.getWidth()-1,this.getheight()-1);
	}// paintComponent() END
	}//class END
