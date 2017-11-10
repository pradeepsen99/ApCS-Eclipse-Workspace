//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
		sort();
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		String output="";
		int hi = 0;
		for(String s : wordRay){
			System.out.println("word " + hi + " :: " + s);
			hi++;
		}
		return output+"\n\n";
	}
}