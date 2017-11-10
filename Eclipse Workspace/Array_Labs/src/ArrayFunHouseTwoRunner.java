//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseTwoRunner
{
	public static void main( String args[] )
	{
		ArrayFunHouseTwo test = new ArrayFunHouseTwo();
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,0,-2};
		int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
		
		System.out.println(Arrays.toString(one));
		System.out.println("Is going UP?  " + test.goingUp(one));
		
		System.out.println(Arrays.toString(two));
		System.out.println("Is going UP?  " + test.goingUp(two));
		
		System.out.println(Arrays.toString(three));
		System.out.println("Is going UP?  " + test.goingUp(three));
		
		System.out.println(Arrays.toString(four));
		System.out.println("Is going UP?  " + test.goingUp(four)+"\n\n\n");
		
		
		System.out.println(Arrays.toString(one));
		System.out.println("Is going UP?  " + test.goingDown(one));
		
		System.out.println(Arrays.toString(two));
		System.out.println("Is going UP?  " + test.goingDown(two));
		
		System.out.println(Arrays.toString(three));
		System.out.println("Is going UP?  " + test.goingDown(three));
		
		System.out.println(Arrays.toString(four));
		System.out.println("Is going UP?  " + test.goingDown(four)+"\n\n\n");
			
		
		System.out.println(Arrays.toString(four));
		System.out.println("First 7 values greater than 9 " + Arrays.toString(test.getCountValuesBiggerThanX(four, 7, 9)));
		System.out.println("First 5 values greater than 15 " + Arrays.toString(test.getCountValuesBiggerThanX(four, 5, 15)));
	}
}