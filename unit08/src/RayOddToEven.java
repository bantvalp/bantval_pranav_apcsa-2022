//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int count = 0;
		boolean b = false;
		for(int i = 0; i<ray.length; i++) {
			if(ray[i]%2==1&&!b) {
				b=true;
			}
			if(ray[i]%2==0&&b) {
				return count;
			}
			if(b) {
				count++;
			}
		}
		return -1;
	}
}