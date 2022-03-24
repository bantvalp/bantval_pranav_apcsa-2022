import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				grid[i][j]= vals[(int) Math.floor(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		for(int j = 0; j<counts.length; j++) {
			counts[j]= countVals(vals[j]);
		}
		int max  = 0;
		int pos = 0;
		for(int i = 0; i<counts.length; i++) {
			if(counts[i]>max) {
				max = counts[i];
				pos = i;
			}
		}
		
		return vals[pos] + " occurs most ("+max+")";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i<grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				if(grid[i][j].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i  = 0; i<grid.length; i++) {
			output = output + Arrays.toString(grid[i]);
			output = output + "\n";
		}
		
		return output;
	}
}