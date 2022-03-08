//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;
	//add a constructor
public Skeleton(String s, int i) {
	name = s;
	size = i;
}
	//add code to implement the Monster interface

	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		if(size>other.getHowBig()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		if(size>other.getHowBig()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		if(name.equals(other.getName())) {
			return true;
		}
		return false;
	}

		//add a toString
	public String toString(Monster other) {
		String s = "";
		if(isBigger(other)) {
			s = s + "Monster one is bigger than Monster two. \n";
		}
		else if(isSmaller(other)) {
			s = s + "Monster one is smaller than Monster two. \n";
		}
		if(namesTheSame(other)) {
			s = s + "Monster one has the same name as Monster two.";
		}
		else {
			s= s + "Monster one does not have the same name as Monster two.";
		}
		return s;
	}
}