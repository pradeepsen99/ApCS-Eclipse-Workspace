//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Discount disc = new Discount(1);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("/n Bill after Discount :: " + disc.getDiscountedBill(amt) );
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextInt();
		out.println("/n Bill after Discount :: " + disc.getDiscountedBill(amt) );
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextInt();
		out.println("/n Bill after Discount :: " + disc.getDiscountedBill(amt) );
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextInt();
		out.println("/n Bill after Discount :: " + disc.getDiscountedBill(amt) );
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextInt();
		out.println("/n Bill after Discount :: " + disc.getDiscountedBill(amt) );

	}
}