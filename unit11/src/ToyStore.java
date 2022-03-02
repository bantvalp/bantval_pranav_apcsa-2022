//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
Scanner s = new Scanner(System.in);
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] x = toys.split(" ");
		String temp;
		for(int i = 0; i<x.length; i++) {
			temp = x[i];
		if(getThatToy(temp)==null) {
			toyList.add(new Toy(temp));
			toyList.get(toyList.size()-1).setCount(1);
		}
		else {
			int pos = findPos(temp);
			toyList.get(pos).setCount(toyList.get(pos).getCount()+1);
		}
	}
	}
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i<toyList.size(); i++) {
  			if(toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  public int findPos(String nm) {
	  for(int i = 0; i<toyList.size(); i++) {
		  if(toyList.get(i).getName().equals(nm)) {
			  return i;
		  }
	  }
	  return -1;
  }
  	public String getMostFrequentToy()
  	{
  		int most = 0;
  		int pos =0;
  		for(int i = 0; i < toyList.size(); i++) {
  			if(toyList.get(i).getCount()>most) {
  				most = toyList.get(i).getCount();
  				pos = i;
  			}
  		}
  		return toyList.get(pos).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy t;
  		for(int i = 0; i<toyList.size(); i++) {
  			for(int j = 0;j<toyList.size()-1; j++) {
  				if(toyList.get(j).getCount()<toyList.get(j+1).getCount()) {
  					t = toyList.get(j);
  					toyList.set(j, toyList.get(j+1));
  					toyList.set(j+1, t);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
		sortToysByCount();
	   return toyList.toString() + "\n max == "+ getMostFrequentToy();
	}
}