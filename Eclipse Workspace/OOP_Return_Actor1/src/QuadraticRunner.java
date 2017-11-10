//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
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
		
		Quadratic test = new Quadratic(a, b, c);
		test.calcRoots( );
		test.print();
		
		
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		test.calcRoots( );
		test.print();
		
		
		
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		test.calcRoots( );
		test.print();
		
		
		
		
		System.out.print("Enter side A ::  ");
		a = read.nextInt();

		System.out.print("Enter side B ::  ");
		b = read.nextInt();

		System.out.print("Enter side C ::  ");
		c = read.nextInt();
		
		test.calcRoots( );
		test.print();
	
	}
}