//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString("abc","cba","bca");
		System.out.println(test);
		
		test = new BiggestString("one", "fourteen", "twenty");
		System.out.println(test);
		
		test = new BiggestString("124323", "20009", "3434");
		System.out.println(test);
		
		test = new BiggestString("abcde", "ABCDE", "1234234324");
		System.out.println(test);
	}
}