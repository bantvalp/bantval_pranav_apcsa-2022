//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice=player;
	}

	public String determineWinner()
	{
	
		int comp = (int) Math.floor(Math.random()*3);
		switch(comp) {
		case 0:
			compChoice = "R";
			break;
		case 1:
			compChoice = "P";
			break;
		case 2:
			compChoice = "S";
			break;
		}
		String winner="";
		if(compChoice.equals(playChoice)) {
			winner = "!Draw Game!";
		}
		else if(compChoice.equals("R")&&playChoice.equals("S")) winner = "!Computer wins <<rock breaks scissors>>!";
		else if(compChoice.equals("P")&&playChoice.equals("R")) { 
			winner = "!Computer wins <<paper covers rock>>!";
		}
		else if(compChoice.equals("S")&&playChoice.equals("P")) winner = "!Computer wins <<scissors covers paper>>!";
		else if(playChoice.equals("R")&&compChoice.equals("S")) winner = "!Player wins <<rock breaks scissors>>!";
		else if(playChoice.equals("P")&&compChoice.equals("R")) winner = "!Player wins <<paper covers rock>>!";
		else if(playChoice.equals("S")&&compChoice.equals("P")) winner = "!Player wins <<scissors covers paper>>!";
			
		return winner;
	}

	public String toString()
	{
		String output=determineWinner() + "\n";
		return output;
	}
}