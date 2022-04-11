//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10,10,10);
      speed =5;
      setColor(Color.black);
   }


   //add the other Paddle constructors

   public Paddle(int x, int y) {
	   super(x,y,10,10);
	   speed = 5;
	   setColor(Color.black);
   }
   public Paddle(int x, int y, int s) {
	   super(x,y,10,10);
	   speed = s;
	   setColor(Color.black);
   }
   public Paddle(int x, int y, int w, int h) {
	   super(x,y,w,h);
	   speed = 5;
	   setColor(Color.black);
   }

   public Paddle(int x, int y, int w ,int h, int s) {
	   super(x,y,w,h);
	   speed = s;
	   setColor(Color.black);
   }
   public Paddle(int x, int y, int w ,int h, Color c, int s) {
	   super(x,y,w,h);
	   speed = s;
	   setColor(c);
   }






   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()-speed);
	   draw(window, Color.black);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()+speed);
	   draw(window, Color.black);

   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString() + "speed: "+ speed;
   }
}