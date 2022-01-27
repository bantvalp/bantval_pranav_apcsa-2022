//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	 
	  String first = a.substring(0,1);
	  String last = a.substring(a.length()-1);
	  if(first.equalsIgnoreCase("A")||first.equalsIgnoreCase("E")||first.equalsIgnoreCase("I")||first.equalsIgnoreCase("O")||first.equalsIgnoreCase("U")) {
		  return "yes";
	  }
	  else if(last.equalsIgnoreCase("A")||last.equalsIgnoreCase("E")||last.equalsIgnoreCase("I")||last.equalsIgnoreCase("O")||last.equalsIgnoreCase("U")) {
	  return "yes";
	  }
	  else {
		return "no";
	}
	}
}