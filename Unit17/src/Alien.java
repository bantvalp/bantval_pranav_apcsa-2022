//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive = true;
	private boolean right = true;
	private boolean left = false;
	public Alien()
	{
		this(0,0,30,30,0);
		try
		{
			URL url = getClass().getResource("\\alien.JPG");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("eeee");
		}
	}

	public Alien(int x, int y)
	{
		//add code here
		super(x,y);
		try
		{
			URL url = getClass().getResource("\\alien.JPG");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("eeee");
		}
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		super(x,y);
		speed = s;
		try
		{
			URL url = getClass().getResource("\\alien.JPG");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("eeee");
		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("\\alien.JPG");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("eeee");
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
public String getDirection() {
	if(right) {
		return "RIGHT";
	}
	return "LEFT";
}
public void setDirection(String s) {
	if(s.equals("RIGHT")) {
		right=true;
		left=false;
	}
	else {
		left = true;
		right=false;
	}
}
   public void move(String direction)
	{
	   //add code here
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

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	public boolean isAlive() {
		return alive;
	}
	public void dead() {
		alive = false;
	}
	public String toString()
	{
		return "";
	}
}
