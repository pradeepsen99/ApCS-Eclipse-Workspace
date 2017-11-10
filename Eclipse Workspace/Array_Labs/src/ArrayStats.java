//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	int[] array;
	

	
	public ArrayStats(int[]hi){
		array = hi;
	}
	
	//set method
	
	
	public int getNumGroupsOfSize(int size)
	{
		int cnt=0;
		int count = 0;
		for(int i = 0; i<array.length;i++){
			for(int ii = 0; i<size;i++){
				if(array[i] == array[i+ii]){
					count+=0;
				}
				
			}
			if(count == size){
				cnt++;
				count = 0;
			}
			count = 0;
		}
		
		
		
		return cnt;
	}
	
	public String toString()
	{
		
		return ""+Arrays.toString(array);
	}
}