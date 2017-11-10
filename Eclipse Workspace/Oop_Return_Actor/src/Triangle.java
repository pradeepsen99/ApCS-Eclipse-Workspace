//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	Scanner scnr = new Scanner(System.in);
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		System.out.print("Enter Side A:");
		a = scnr.nextInt();
		
		System.out.print("Enter Side B:");
		b = scnr.nextInt();
		
		System.out.print("Enter Side C:");
		c = scnr.nextInt();
	}


	public void setSides(int a, int b, int c)
	{
		
		
		
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		
		perimeter = sideA+sideB+sideC;
	}

	public void calcArea( )
	{
		double s1;
		
		s1 = perimeter / 2;
		theArea= Math.sqrt(s1 * (s1 - sideA)*(s1 - sideB)*(s1 - sideC));
	}

	public void print( )
	{
		
		
		System.out.println("\n\n");
	}
}