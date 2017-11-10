//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n");
		
		FirstAndLast demo1 = new FirstAndLast("World");
		System.out.println( "first letter :: " + demo1.getFirst() );
		System.out.println( "last letter :: " + demo1.getLast() + "\n");
		
		FirstAndLast demo2 = new FirstAndLast("JukeBox");
		System.out.println( "first letter :: " + demo2.getFirst() );
		System.out.println( "last letter :: " + demo2.getLast() + "\n");
		
		FirstAndLast demo3 = new FirstAndLast("TCEA");
		System.out.println( "first letter :: " + demo3.getFirst() );
		System.out.println( "last letter :: " + demo3.getLast()+ "\n" );
		
		FirstAndLast demo4 = new FirstAndLast("UIL");
		System.out.println( "first letter :: " + demo4.getFirst() );
		System.out.println( "last letter :: " + demo4.getLast() + "\n");
		
	}
}