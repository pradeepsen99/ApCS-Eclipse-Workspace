//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner read = new Scanner(in); 
		
		System.out.print("Enter side A ::  ");
		int a = read.nextInt();

		System.out.print("Enter side B ::  ");
		int b = read.nextInt();

		System.out.print("Enter side C ::  ");
		int c = read.nextInt();
		
		System.out.print("Enter side D ::  ");
		int d = read.nextInt();
		
		Distance test = new Distance(a, b, c, d);
		test.calcDistance();
		test.print();
		
		/////////////////////////////////////////////////////////////////
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		System.out.print("Enter side D ::  ");
		d = read.nextInt();
		test.setCoordinates(a,b,c,d);
		test.calcDistance();
		test.print();
		/////////////////////////////////////////////////////////////////
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		System.out.print("Enter side D ::  ");
		d = read.nextInt();
		test.setCoordinates(a,b,c,d);
		test.calcDistance();
		test.print();
		/////////////////////////////////////////////////////////////////
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		System.out.print("Enter side D ::  ");
		d = read.nextInt();
		test.setCoordinates(a,b,c,d);
		test.calcDistance();
		test.print();
		
		
		
		
		
			
	}
}