//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice ;

	public RockPaperScissors()
	{
		this("");
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		//System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]");
		playChoice = player; 
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		
		String winner="ERROR 404 PANIC";
		int rnd = (int)(Math.random()*3)+0;
		switch(rnd){
		case 0: compChoice = "R";break;
		case 1: compChoice = "P";break;
		case 2: compChoice = "S";break;
		case 3: compChoice = "S";break;
		}
		
		
		if(playChoice.equals(compChoice)){
			winner = "Draw, pump up da jam";
		}
		
		
		if(playChoice.equals("R") && compChoice.equals("S")){
			winner = "Player wins";
		}
		if(playChoice.equals("P") && compChoice.equals("R")){
			winner = "Player wins";
		}
		if(playChoice.equals("S") && compChoice.equals("P")){
			winner = "Player wins";
		}
		
		
		if(compChoice.equals("R") && playChoice.equals("S")){
			winner = "Computer wins";
		}
		if(compChoice.equals("P") && playChoice.equals("R")){
			winner = "Computer wins";
		}
		if(compChoice.equals("S") && playChoice.equals("P")){
			winner = "Computer wins";
		}
		
		
		return winner;
	}

	public String toString()
	{
		String output="";
		output = "player had [ " + playChoice+" ]\tcomputer had [ "+ compChoice+" ]\t"+determineWinner()+"\n\n\n";
		return output;
	}
}