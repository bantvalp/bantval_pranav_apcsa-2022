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
for(int k=amt; k>0; k--) {
	if(letter=='Z') {
		tempc = (int) letter;
	}
		for(int i = k; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if((tempc-i+k)> (int) 'Z') {
					tempc = (int) 'A' -1;
				}
				
				temp =  (char)( tempc-i+k);
				
				trig += temp;
			}
			trig+= " ";
		}
		trig += "\n";
}
		return trig;
	}
	public String toString()
	{
		String output=triangle();
		return output;
	}
}