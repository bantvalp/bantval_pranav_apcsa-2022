//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		MatrixCount1 m = new MatrixCount1();
		for(int i =0; i<10; i++) {
			System.out.println("The " + i + " count is :: " + m.count(i));
		}
		System.out.println("The " + 21 + " count is :: " + m.count(21));
	}
}



