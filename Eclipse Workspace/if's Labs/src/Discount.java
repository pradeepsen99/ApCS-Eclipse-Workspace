//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	int num;
	public Discount(int Number){
		
		num = Number;
		
	}
	
	public static double getDiscountedBill(double bill)
	{
		if(bill < 2000){
			return bill;
		}
		if (bill > 2000){
			return bill + (bill * .15);
		}
		
		
		
		
		
		return 0;
	}
}