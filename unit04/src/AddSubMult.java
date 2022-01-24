//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double ans = 0.0;
		if(a==b) {
			ans= a*b;
		}
		else if(a>b) {
			ans= a-b;
		}
		else {
		ans= b-a;
	}
		ans=Math.floor(ans*10);
		ans=ans/10;
		return ans;
	}
}