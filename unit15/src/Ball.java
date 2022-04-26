//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200, 20, 20);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors

	public Ball(int x, int y) {
		super(x, y, 20, 20);
		xSpeed = 3;
		ySpeed = 1;
		setColor(Color.black);
	}

	public Ball(int x, int y, int xs, int ys) {
		super(x, y, 20, 20);
		xSpeed = xs;
		ySpeed = ys;
		setColor(Color.black);
	}

	public Ball(int x, int y, int w, int h, int xs, int ys) {
		super(x, y, w, h);
		xSpeed = xs;
		ySpeed = ys;
		setColor(Color.black);
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h);
		xSpeed = xs;
		ySpeed = ys;
		setColor(c);
	}

	// add the set methods
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	public void setSpeed(int x, int y) {
		xSpeed = x;
		ySpeed = y;
	}
	public void setYSpeed(int y) {
		ySpeed = y;
	}
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.white);
		setX(getX() + xSpeed);
		// setY
		setY(getY()+ySpeed);
		// draw the ball at its new location
		draw(window);
	}

	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		return false;
	}

	// add the get methods

	// add a toString() method
	public String toString() {
		return "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
	}

	
}
