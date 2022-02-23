//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = ray.size();
		int even = 0;
for(int i = 0; i<ray.size(); i++) {
	if(ray.get(i)%2==0) {
		 even=i;
	}
	if(ray.get(i)%2==1&&i<odd) {
		odd=i;
	}
}
if(even-odd>0) {
	return even-odd;
}
		return -1;
	}
}