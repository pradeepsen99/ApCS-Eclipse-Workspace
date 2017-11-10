//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		System.out.println(test);
		
		test = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.println(test);
		
		test = new WordSort("b x 4 r s y $");
		System.out.println(test);
		
		test = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(test);
		
	}
}