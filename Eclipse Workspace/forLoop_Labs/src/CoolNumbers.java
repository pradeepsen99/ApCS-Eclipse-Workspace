//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		if ((num % 2 == 1) && (num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1))
				return true;
		
		
		
		
		 return false;
	}
	
		
	public static int countCoolNumbers( int stop )
	{
		int counter = 0;
		for(int i = 6; i < stop + 1; i ++ ){
			if (isCoolNumber(i) == true){
				counter ++;
			}
								
		}
			
			
			
			
		return counter;
	}
}