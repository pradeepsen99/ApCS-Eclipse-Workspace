//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitMathRunner
{
	public static void main( String args[] )
	{
		DigitMath test = new DigitMath();
		System.out.println(test.averageDigits(234));
		System.out.println(test.averageDigits(10000));
		System.out.println(test.averageDigits(111));
		System.out.println(test.averageDigits(9005));
		System.out.println(test.averageDigits(84645));
		System.out.println(test.averageDigits(8547));
		System.out.println(test.averageDigits(123456789));
	}
}