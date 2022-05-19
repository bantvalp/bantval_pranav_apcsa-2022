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

public class Bullets
{
	private ArrayList<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(Ammo a : ammo) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Ammo a : ammo) {
			a.move("up");
		}
	}

	public void cleanEmUp()
	{
		if (ammo.size() > 0) {
			for (int i = 0; i < ammo.size(); i++) {
				if (!ammo.get(i).isAlive()) {
					ammo.remove(i);
					i = 0;
				}
			}
		}
	}

	public ArrayList<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
	public Ammo getAmmo(int index) {
		return ammo.get(index);
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return ammo.size();
	}
}
