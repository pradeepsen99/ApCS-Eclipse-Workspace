//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class Histogram
{
	int[] array;
	int[] countAr = new int[10];
	
	public Histogram(){
		
	}
	public Histogram(int[] hi){
		array = hi;
	}

	public void hi(){
		for(int i = 0;i<array.length;i++){
			countAr[array[i]] +=1;
			
		}
	}
	

	public String toString(){
		String output = "";
		int counter = 0;
		for(int i = 0; i<countAr.length;i++){
			System.out.println(i + " - " + countAr[i]);
			
		}
		
		
		
		
		
		return output;
	}
}