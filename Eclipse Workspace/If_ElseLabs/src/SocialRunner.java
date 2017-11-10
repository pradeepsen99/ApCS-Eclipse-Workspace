//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Scanner hi = new Scanner(System.in);
		
		String s = hi.nextLine();
		Social test = new Social(s);
		out.println(test);
		
		s = hi.nextLine();
		test = new Social(s);
		out.println(test);
		
		s = hi.nextLine();
		test = new Social(s);
		out.println(test);
		
		s = hi.nextLine();
		test = new Social(s);
		out.println(test);
	}
}