//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime test = new Prime(24);
		System.out.println(test);
		
		test = new Prime(7);
		System.out.println(test);
		
		test = new Prime(100);
		System.out.println(test);
		
		test = new Prime(113);
		System.out.println(test);
		
		test = new Prime(65535);
		System.out.println(test);
		
		test = new Prime(2);
		System.out.println(test);
		
		test = new Prime(7334);
		System.out.println(test);
		
		test = new Prime(7919);
		System.out.println(test);
		
		test = new Prime(1115125003);
		System.out.println(test); 	
		
	}	
}