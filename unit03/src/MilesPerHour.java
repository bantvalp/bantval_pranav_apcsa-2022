//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;


	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph=0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double temp = (double) hours + (double) minutes/60;
		mph = (double) distance/(temp);
		mph = Math.round(mph);
	}

	public void print()
	{
		System.out.println(distance+" miles in " + hours+" hours and "+minutes+" minutes = "+ (int) mph + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}