//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFun
{
	private String word;

	public WordFun()
	{
		setWord("");
	}

	public WordFun(String w)
	{
		word = w;
	}

	public void setWord(String w)
	{
		word = w;
	}

	public void makeUpper()
	{
		word = word.toUpperCase();
	}

	public void addHyphen()
	{
		//int loc;
		
		word = word.replace(" " , "-");
		
		
	}

	public String toString()
	{
		
		
		
		return word+"\n\n";
	}
}