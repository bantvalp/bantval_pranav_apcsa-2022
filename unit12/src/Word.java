//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setWord(s);
	}

	public int compareTo( Word rhs )
	{		
		
		return getWord().length()-rhs.getWord().length();
	}

	public String toString()
	{
		return "";
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}