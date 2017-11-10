//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		word = "";
	}

	public StringRipper(String s)
	{
		word = s;
	}
	
   public void setString(String s)
   {
	   word = s;
   }	

	public String ripString(int x, int y)
	{
		String hi;
		hi = word.substring(x, y);
		return hi;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}