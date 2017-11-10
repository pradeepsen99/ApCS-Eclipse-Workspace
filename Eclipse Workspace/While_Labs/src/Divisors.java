//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		String divisors="The number of divisors of " + number +" is = ";
		int i =1;
		while(i<number/2+1){
			if(number % i == 0){
				divisors += i + " ";
			}
				
			i++;
		}
		return divisors; 
	}
}