import java.util.Arrays;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		OddsAndEvens test = new OddsAndEvens();
		
		int[] one = {2, 4, 6, 8, 10 ,12, 14,};
		int[] two = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] three = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		
		
		
		System.out.println("Odds = " + Arrays.toString(test.getAllOdds(one)));
		System.out.println("Evens = " + Arrays.toString(test.getAllEvens(one)));
		
		System.out.println("Odds = " + Arrays.toString(test.getAllOdds(two)));
		System.out.println("Evens = " + Arrays.toString(test.getAllEvens(two)));
		
		System.out.println("Odds = " + Arrays.toString(test.getAllOdds(three)));
		System.out.println("Evens = " + Arrays.toString(test.getAllEvens(three)));
	
	}
}