//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner scnr = new Scanner(in);
		StringOddOrEven str = new StringOddOrEven();
		
		
		System.out.println("Enter a word");
		String s = scnr.nextLine();
		str.setString(s);
		System.out.println(str + " is " + str.isEven());
		
		System.out.println("Enter a word");
		s = scnr.nextLine();
		str.setString(s);
		System.out.println(str + " is " + str.isEven());
		
		System.out.println("Enter a word");
		s = scnr.nextLine();
		str.setString(s);
		System.out.println(str + " is " + str.isEven());
		
		System.out.println("Enter a word");
		s = scnr.nextLine();
		str.setString(s);
		System.out.println(str + " is " + str.isEven());
		
		System.out.println("Enter a word");
		s = scnr.nextLine();
		str.setString(s);
		System.out.println(str + " is " + str.isEven());
		
	}
}