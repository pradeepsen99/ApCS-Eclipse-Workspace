//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect(){
		number = 0;
	}
	public Perfect(int num){
		number = num;
	}

	public void setNums(int num){
		number =  num;
	}

	public boolean isPerfect()
	{
		int count = 0;
		int i = 1;
		while(i<number/2+1){
			if(number % i == 0){
				count += i;
			}
				
			i++;
		}
		if(count == number){
			return true;
		}
		return false;
	}

	public String toString(){
		if(isPerfect() == true){
			return number + " is perfect";
				
		}
		return number +" is not perfect";
	}
	
}