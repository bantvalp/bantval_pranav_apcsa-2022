//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.black;

	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h) {
		width = w;
		height = h;
		xPos = x;
		yPos = y;
		color = Color.black;
	}

	public Block(int x, int y, int w, int h, Color c) {
		width = w;
		height = h;
		xPos = x;
		yPos = y;
		color = c;
	}
	// add the other get methods

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}
	// add the other set methods
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos=y;
	}
public Color getColor() {
	return color;
}
	public void setColor(Color col) {
		color = col;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		 window.setColor(color);
		 window.fillRect(getX(), getY(), getWidth(), getHeight());
		 
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		 window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public boolean equals(Object obj) {
		if(obj ==this) {
			return true;
		}
		return false;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return "x: " + xPos + " y: "+ yPos + " w: " + width+" h: "+height + " color: "+ color;
	}
}