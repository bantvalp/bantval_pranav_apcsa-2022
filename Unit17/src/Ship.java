//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(10, 10, 10, 10, 10);
		try {
			URL url = getClass().getResource("\\ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("AAAA");
		}
	}

	public Ship(int x, int y) {
		super(x, y);
		// add code here
		try {
			URL url = getClass().getResource("\\ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("AAAA");
		}
	}

	public Ship(int x, int y, int s) {
		super(x, y);
		speed = s;
		// add code here
		try {
			URL url = getClass().getResource("\\ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("AAAA");
		}
	}

	public Ship(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("\\ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("AAAA");
		}
	}

	public void setSpeed(int s) {
		speed = s;
		// add more code
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		// add code here
		if (direction.equalsIgnoreCase("up")) {
			super.setY(super.getY() - speed);

		}
		if (direction.equalsIgnoreCase("down")) {
			super.setY(super.getY() + speed);

		}
		if (direction.equalsIgnoreCase("left")) {
			super.setX(super.getX() - speed);

		}
		if (direction.equalsIgnoreCase("right")) {
			super.setX(super.getX() + speed);

		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}
	public String toString() {
		return super.toString() + getSpeed();
	}
}
