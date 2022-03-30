//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0) {
			number=number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int [getNumDigits(number)];
		int hold = 0;
		for(int i=0; i<sorted.length; i++) {
			sorted[i]=number%10;
			number = number/10;
		}
		for (int x = 0; x < sorted.length; x++) {
		for(int j = 0; j<sorted.length-1; j++) {
			if(sorted[j]>sorted[j+1]) {
				hold=sorted[j];
				sorted[j]=sorted[j+1];
				sorted[j+1]=hold;
			}
		}
		}
		return sorted;
	}
}