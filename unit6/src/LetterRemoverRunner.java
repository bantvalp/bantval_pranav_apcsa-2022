//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover lr = new LetterRemover("I am Sam I am",'a');	
		System.out.println(lr);
		lr.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(lr);
		lr.setRemover("qwertyqwertyqwerty" , 'a');
		System.out.println(lr);
		lr.setRemover("abababababa ", 'b');
		System.out.println(lr);
		lr.setRemover("abaababababa ", 'x');
		System.out.println(lr);
	}
}