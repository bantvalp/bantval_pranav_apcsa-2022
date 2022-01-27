//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven test = new StringOddOrEven();
		Scanner kb = new Scanner(System.in);
		for(int i =0; i<8; i++) {
			System.out.print("Enter a word :: ");
			String sample0 = kb.next();
			test.setString(sample0);
			System.out.println(sample0 + test);
		}
	//tests: cat, boot, odd, even, a, eleven, thirteen, it
	}
}