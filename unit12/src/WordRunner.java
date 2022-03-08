//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\bantvalp2201\\Downloads\\words.dat"));

		int size = file.nextInt();
		List<String> words = new ArrayList<String>();
		String temp;
		for(int i = 0; i<size; i++) {
		temp = file.nextLine();
		Word w = new Word(temp);
		if(words.size()==0) {
			words.add(w.getWord());
		}
		else {
		for(int j = 0; j<words.size(); j++) {

		 if(w.getWord().length()-words.get(j).length()==0) {
				words.add(j, w.getWord());
				break;
			}
		 if(w.getWord().length()-words.get(j).length()>0) {
				words.add(j, w.getWord());
				break;
			}
		}
		}
	
	}
		words.remove(words.size()-1);
		List<String> ws = new ArrayList<String>();
		for(int k = words.size()-1; k>=0; k--){
			ws.add(words.get(k));
		}	
		System.out.println("" + ws.toString());












	}
}