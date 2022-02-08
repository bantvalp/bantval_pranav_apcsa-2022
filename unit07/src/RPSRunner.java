//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		boolean cont = true;
while(cont) {
			String player = "";
			RockPaperScissors game = new RockPaperScissors();
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.nextLine();
			game.setPlayers(player);
			//read in the player value
			out.print(game);
		System.out.println("Do you want to play again :: ");
	if(keyboard.nextLine().equals("n")) {
		cont=false;
	}
}
	}
}



