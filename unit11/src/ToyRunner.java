//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t = new Toy("sorry");
		t.setCount(1);
		System.out.println(t);
		t.setName("ji goe");
		t.setCount(5);
		System.out.println(t);
	}
}