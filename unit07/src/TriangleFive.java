//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;
	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setAmount(amt);
		setLetter(c);
	}

	public void setLetter(char c)
	{
		letter =c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	public String triangle() {
		String trig = "";
		int tempc = (int) letter;
		char temp = letter;
		int amt = amount;
		String[] arr = new String[amount];
		for(int i = amt; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if((tempc-i+amt)> (int) 'Z') {
					tempc = (int) 'A' +(int) letter - (int) 'Z' -1;
				}
				
				temp =  (char)( tempc-i+amt);
				
				trig += temp;
			}
			trig+= " ";
			arr[i-1] = trig;	
}
		trig = "";
		for (int i = 0; i < arr.length; i++) {
			trig=trig+arr[i]+"\n";
		}
		return trig;
	}
	public String toString()
	{
		String output=triangle();
		return output;
	}
}
