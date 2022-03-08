//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name :");
		String name1 = keyboard.next();
		System.out.print("Enter 1st monster's size :");
		int size1 = keyboard.nextInt();
		//instantiate monster one
		Skeleton m1 = new Skeleton(name1, size1);
		//ask for name and size
		System.out.print("Enter 2nd monster's name :");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size :");
		int size2 = keyboard.nextInt();
		//instantiate monster two
		Skeleton m2 = new Skeleton(name2, size2);
		System.out.println(m1.toString(m2));
	}
}