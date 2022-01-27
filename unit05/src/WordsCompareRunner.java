//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
		WordsCompare test = new WordsCompare();
		test.setWords("abe", "ape");
		System.out.println(test);
		test.setWords("giraffe", "gorilla");
		System.out.println(test);
		test.setWords("one", "two");
		System.out.println(test);
		test.setWords("fun", "funny");
		System.out.println(test);
		test.setWords("123", "19");
		System.out.println(test);
		test.setWords("193", "1910");
		System.out.println(test);
		test.setWords("goofy", "godfather");
		System.out.println(test);
		test.setWords("funnel", "fun");
		System.out.println(test);
	}
}