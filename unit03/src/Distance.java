//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
	}

	public Distance(int x1, int y1, int x2, int y2) {
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow(xOne - xTwo, 2) + Math.pow(yOne - yTwo, 2));
		distance = distance * 1000;
		distance = Math.floor(distance);
		distance = distance / 1000;
	}

	public double getDistance() {
		calcDistance();
		return distance;
	}

	public void print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X1 :: ");
		xOne= scan.nextInt();
		System.out.println("Enter Y1 :: ");
		yOne = scan.nextInt();
		System.out.println("Enter X2 :: ");
		xTwo=scan.nextInt();
		System.out.println("Enter Y2 :: ");
		yTwo=scan.nextInt();
		System.out.println("distance == " + getDistance());

	}

	// complete print or the toString

	public String toString() {
		return "";

	}
}