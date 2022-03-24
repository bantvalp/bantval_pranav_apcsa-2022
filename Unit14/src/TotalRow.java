//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> sum = new ArrayList<Integer>();
    	//add code here
    	int s = 0;
    	for(int i = 0; i<m.length; i++) {
    		for(int j = 0; j<m[i].length; j++) {
    			s=s+m[i][j];
    		}
    		sum.add(s);
    		s=0;
    	}
		return sum;
    }
}
