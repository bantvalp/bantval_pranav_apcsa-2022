//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
       	int y= 0;
    	m=new String[size][size];
    	for(int i =0; i<m.length;i++) {
    		for(int j =0; j<m[i].length; j++) {
    			m[i][j]= str.substring(y,y+1);
    			y++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for(int i =0; i<m.length; i++) {
    		for (int j = 0; j < m[i].length-1; j++) {
				if(checkRight(word,i,j)||checkLeft(word,i,j)||checkUp(word,i,j)||checkDown(word,i,j)||
				checkDiagUpRight(word,i,j)||checkDiagUpLeft(word,i,j)||checkDiagDownRight(word,i,j)||
				checkDiagDownLeft(word,i,j)) {
					return true;
				}
					}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int pos = 0;
	
			while(c<m[r].length-1&&pos<w.length()-1) {
				if(!m[r][c].equals(w.substring(pos,pos+1))) {
					return false;
				}
				pos++;
				c++;
				if(c>m[r].length-1) {
					pos--;
				}
			}
			if(pos==w.length()-1&&w.substring(w.length()-1, w.length()).equals(m[r][c])) {
			return true;
			}
			else {
				return false;
			}
		
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int pos = 0;
		
		while(c>=0&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			c--;
			if(c<0) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkUp(String w, int r, int c)
	{
		int pos = 0;
		
		while(r>=0&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r--;
			if(r<0) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkDown(String w, int r, int c)
   {
		int pos = 0;
		
		while(r<m.length-1&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r++;
			if(r>m[r].length-1) {
			pos--;
		}
		}
		
		if(pos==w.length()-1&&w.substring(w.length()-1, w.length()).equals(m[r][c])) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int pos = 0;
		
		while(r>=0&&c<m[r].length-1&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r--;
			c++;
			if(r<0||c>m[r].length-1) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int pos = 0;
		
		while(r>=0&&c>=0&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r--;
			c--;
			if(r<0||c<0) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int pos = 0;
		
		while(r<m.length-10&&c>=0&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r++;
			c--;
			if(r>m[r].length-1||c<0) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int pos = 0;
		
		while(r<m.length-1&&c<m[r].length-1&&pos<w.length()-1) {
			if(!m[r][c].equals(w.substring(pos,pos+1))) {
				return false;
			}
			pos++;
			r++;
			c++;
			if(r>m[r].length-1||c>m[r].length-1) {
				pos--;
			}
		}
		if(pos==w.length()-1) {
			return true;
			}
			else {
				return false;
			}
	}

    public String toString()
    {
 		return Arrays.deepToString(m).replace("], ", "]\n");
    }
}
