//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot<pups.length) {
		pups[spot]= new Dog(age,name);
	}}

	public String getNameOfOldest()
	{
		int big = pups[0].getAge();
		int bigspot = 0;
		for(int i = 0; i<pups.length; i++) {
			if(pups[i].getAge()>big) {
				big=pups[i].getAge();
				bigspot = i;
			}
		}
		return pups[bigspot].getName();
	}

	public String getNameOfYoungest()
	{
		int small = pups[0].getAge();
		int smallspot = 0;
		for(int i = 0; i<pups.length; i++) {
			if(pups[i].getAge()<small) {
				small=pups[i].getAge();
				smallspot = i;
			}
		}
		return pups[smallspot].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}