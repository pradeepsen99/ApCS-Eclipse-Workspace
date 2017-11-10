//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality("hello", "goodbye");
		out.println(test);
		
		test = new StringEquality("one", "two");
		out.println(test);
		
		test = new StringEquality("three", "four");
		out.println(test);

		test = new StringEquality("TCEA","UIL");
		out.println(test);
		
		test = new StringEquality("State","Champions");
		out.println(test);
		
		test = new StringEquality("ABC", "ABC");
		out.println(test);
		
		test = new StringEquality("ABC", "CBA");
		out.println(test);
		
		test = new StringEquality("Same", "Same");
		out.println(test);
	}
}