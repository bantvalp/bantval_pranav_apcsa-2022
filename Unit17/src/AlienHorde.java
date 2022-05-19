//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private ArrayList<Alien> aliens;
	private int size = 0;
	private int spd;
	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>(size);
		this.size = size;
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (Alien al : aliens) {
			al.draw(window);
		}
	}

	public void moveEmAll() {
		if(aliens.size()>0) {
			for(Alien al : aliens) {
				al.move(al.getDirection());
				if(al.getX()<0) {
					al.setDirection("RIGHT");
				spd=al.getSpeed();
				al.setSpeed(al.getHeight()+al.getHeight()/2);
					al.move("DOWN");
					al.setSpeed(spd);
				
					
				}
				if(al.getX()+al.getWidth()>800) {
					al.setDirection("LEFT");
					spd=al.getSpeed();
					al.setSpeed(al.getHeight()+al.getHeight()/2);
						al.move("DOWN");
						al.setSpeed(spd);
					
				}
			}
	}
	}
	public void removeDeadOnes(Bullets shots) {
		if (aliens.size() > 0) {
			for (int i = 0; i < getSize(); i++) {
				if(!aliens.get(i).isAlive()) {
					aliens.remove(i);
				}
			}
		}
	}

	public int getSize() {
		return aliens.size();
	}


	public void generateHorde(int x, int y, int w, int h, int s) {
		int xPos = x;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(x, y, w, h, s));
			if (x >= 600) {
				x = xPos;
				y = y + 10 + h;
			} else {
				x = x + w + 10;
			}
		}
		
	}
public ArrayList<Alien> getList(){
	return aliens;
}
public void setSize(int s) {
	size = s;
}
	public String toString() {
		return "";
	}
}
