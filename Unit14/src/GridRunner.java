//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "7", "x", "b", "c", "9", "z"};
		Grid g = new Grid(20,20,vals);
		System.out.println(g.toString());
		System.out.println(g.findMax(vals));
	}
}