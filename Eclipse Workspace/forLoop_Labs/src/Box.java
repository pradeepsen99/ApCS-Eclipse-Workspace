//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
	private String word;

	public Box()
	{
		setWord("");
	}

	public Box(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		int length = word.length();
		
		for( int i = 0; i < length; i++){
			System.out.println(word);
			
		}
		System.out.println("\n");
	}
}