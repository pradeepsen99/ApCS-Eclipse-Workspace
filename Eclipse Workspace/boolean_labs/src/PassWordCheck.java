//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password = "YoMama";
	}

	public void check()
	{
		
		Scanner keyboard = new Scanner(System.in);
		String ans = "";
		do{
			System.out.print("Enter the password:");
			ans = keyboard.nextLine();
			if(ans.equals(password) == true){
				System.out.println("VALID");
			}
			else 
			{
				System.out.println("INVALID");
			}
		}while(ans!=password);
	}
}