//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
   public static int countDigits( int number )
	{
	   int num = number;
		int sum=0;
		while(num>0){
			num = num/10;
			sum++;
		}
		return sum; 
	}
}