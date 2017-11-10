//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		setString("");
	}

	public StringChecker(String s)
	{
		word=s;
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		boolean letterFinder = false;
		if(word.contains(Character.toString(c))){
			letterFinder = true;
		}
		return letterFinder;
	}

	public boolean findSubString(String s)
	{
		boolean letterFinder = false;
		
		if (word.contains(s)){
		letterFinder = true;
			
		}
		return letterFinder;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}