//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		return 0;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i]%2==0){
				count++;
			}
		}
		int[] newArray = new int[count];
		
		int hi = 0;
		
		
		for(int i = 0; i < array.length; i++){
			if(array[i]%2==0){
				newArray[hi] = array[i];
				hi++;
			}
		}
		return newArray;
	}

	public static int[] getAllOdds(int[] array)
	{
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i]%2==1){
				count++;
			}
		}
		int[] newArray = new int[count];
		
		int hi = 0;
		
		
		for(int i = 0; i < array.length; i++){
			if(array[i]%2==1){
				newArray[hi] = array[i];
				hi++;
			}
		}
		return newArray;
			
	}
}