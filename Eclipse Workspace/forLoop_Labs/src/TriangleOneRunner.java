
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne("hippo");
		test.print();	
		
		test = new TriangleOne("abcd");
		test.print();
		
		test = new TriangleOne("a");
		test.print();
		
		test = new TriangleOne("chicken");
		test.print();
		
		test = new TriangleOne("YoMamaSoFatHerPictureFellOfTheWallAndCrackedTheFloor");
		test.print();
	}
}