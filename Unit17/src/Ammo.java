//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean alive = true;
	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x,y);
		speed = 1;
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		speed = s;
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

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
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
	public boolean isAlive() {
		if(getY()<0) {
			alive = false;
		}
		return alive;
	}
	public boolean didCollide(Alien al) {
		if(getX()+5>=al.getX()&&getX()<=al.getX() + al.getWidth() && getY() <=al.getY()+al.getHeight() && getY()-5>=al.getY()) {
			alive = false;
			return true;
		}
		return false;
	}
	public void dead() {
		alive=false;
	}
	public String toString()
	{
		return "";
	}
}
