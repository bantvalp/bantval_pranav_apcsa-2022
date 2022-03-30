import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
	    int[] arr = new int[size];
	    for(int i = 0; i<size; i++){
	        arr[i]=(int) Math.floor(Math.random()*10)+1;
	    }
		return arr;
	}
	public static void shiftEm(int[] array)
	{
	    System.out.println("Before \n"+Arrays.toString(array));
	    int pos = 0;
	    int hold = 0;
	    if(array.length>1){
	        for(int i = 0; i<array.length; i++){
	            if(array[i]==7&&i!=pos){
	            	hold=array[pos];
	                array[pos]=7;
	                array[i]=hold;
	                pos++;
	            }
	            if(array[i]==7 && i==pos) {
	            	pos++;
	            }
	        }
	    }
	    System.out.println("After \n"+Arrays.toString(array));
	}
}