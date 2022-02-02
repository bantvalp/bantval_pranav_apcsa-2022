//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Iterator;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(1+i)) {
				count++;
			}
		}
		return count;
	}
}