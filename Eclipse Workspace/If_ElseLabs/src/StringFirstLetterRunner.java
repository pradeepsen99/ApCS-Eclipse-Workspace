//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		Scanner hi = new Scanner(System.in);
		
		
		String s = hi.nextLine();
		String s2 = hi.nextLine();
		StringFirstLetterCheck test = new StringFirstLetterCheck(s,s2);
		out.println(test);
		
		s = hi.nextLine();
		s2 = hi.nextLine();
		test = new StringFirstLetterCheck(s,s2);
		out.println(test);
		
		s = hi.nextLine();
		s2 = hi.nextLine();
		test = new StringFirstLetterCheck(s,s2);
		out.println(test);
		
		s = hi.nextLine();
		s2 = hi.nextLine();
		test = new StringFirstLetterCheck(s,s2);
		out.println(test);
		
		s = hi.nextLine();
		s2 = hi.nextLine();
		test = new StringFirstLetterCheck(s,s2);
		out.println(test);
		
		s = hi.nextLine();
		s2 = hi.nextLine();
		test = new StringFirstLetterCheck(s,s2);
		out.println(test);
	}
}