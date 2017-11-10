//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		setName("");
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		String first;
		int split;
		
		split = name.indexOf(" ");
		first = name.substring(0,split);
		
		return first;
	}

	public String getLast()
	{
		String second;
		int split;
		
		split = name.indexOf(" ");
		second = name.substring(split + 1,name.length());
		
		return second;
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}