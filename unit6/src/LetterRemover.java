//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("",' ');
	}

	//add in second constructor
	public LetterRemover(String s, char c)
	{
		//call set
		setRemover(s,c);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for(int j = 0; j<cleaned.length(); j++) {
		for(int i =0; i<cleaned.length(); i++) {
			if(cleaned.charAt(i)==lookFor&&i!=cleaned.length()-2) {
				cleaned=cleaned.substring(0,i) + cleaned.substring(i+1);
			}
			else if(cleaned.charAt(i)==lookFor) {
				cleaned = cleaned.substring(0,i);
			}

		}
		}
		if(cleaned.charAt(0)==lookFor) {
			cleaned=cleaned.substring(1);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+":\n"+removeLetters();
	}
}