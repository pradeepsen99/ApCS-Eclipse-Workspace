//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		//out.print("type in your prompt [R,P,S] :: ");
		RockPaperScissors game = new RockPaperScissors();
		Scanner keyboard = new Scanner(System.in);
		//char response = keyboard.nextLine().charAt(0);
		
		while(10%2==0){//response != 'X'){
			
			
		
			out.print("type in your prompt [R,P,S] :: ");
			String player = String.valueOf(keyboard.nextLine().charAt(0));
			game = new RockPaperScissors(player);
			System.out.println(game);
		
		}			
	}
}



