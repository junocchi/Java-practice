//to improve: if the user types something that is not valid, give them the chance to correct

import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Between 1 and 10, how many rounds do you want to play?");
		int roundsToPlay = scanner.nextInt();
		
		
		while(true) {
			if (roundsToPlay<1 ||  roundsToPlay>10) {
				System.out.println("The number you entered is not valid.");
			}
			//call function here
			else {
				playGame(roundsToPlay);
			}
		}
	}
	
	//play game function
	public static void playGame(int roundsToPlay) {
		int counter = 0;
		int userWins = 0;
		int computerWins = 0;
		int ties = 0;
		int totalRoundsToPlay = roundsToPlay;
		
		//logic here
		while(totalRoundsToPlay!=0) {
			//define the range
			int max = 3;
			int min = 1;
			int range = max - min + 1;
			int computersChoice = 0;
			//generate a random number within 1 to 3
			for (int i = 0; i < 3; i++) {
				computersChoice = (int) (Math.random() * range) + min;
			}
			
			//get the users choice
			Scanner scanner=new Scanner(System.in);
			System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors: ");
			int usersChoice = scanner.nextInt();
			
			if(usersChoice > computersChoice) {
				userWins++;
			}
			else if(computersChoice > usersChoice) {
				computerWins++;
			}
			else {
				ties++;
			}
			
			totalRoundsToPlay--;
			counter++;
		}
		
		
		printResults(userWins, computerWins, ties);
		declareWinner(userWins, computerWins, ties);
		keepPlaying();
	}
	
	//print results 
	public static void printResults(int userWins, int computerWins, int ties) {
		System.out.println("Your wins: " + userWins);
		System.out.println("The computer wins: " + computerWins);
		System.out.println("Number of ties: " + ties);
	}
	
	//declare the winner
	public static void declareWinner(int userWins, int computerWins, int ties) {
		if(userWins >= computerWins && userWins >= ties) {
			System.out.println("Congratulations! Victory is yours!");
		}
		else if(computerWins >= userWins && computerWins >= ties) {
			System.out.println("Sorry, the computer takes the victory!");
		}
		else {
			System.out.println("It's a tie! No winners this time.");
		}
	}
	
	//Ask if the user wants to keep playing
	public static void keepPlaying() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you want to keep playing? Enter 1 for Yes and 2 for No.");
		int keepPlaying = scanner.nextInt();
		
		switch(keepPlaying) {
		case 1: {
			main(null);
		}
		case 2: {
			System.out.println("Thanks for playing!");
			break;
		}
		default: 
			System.out.println("Invalid number.");
		}
	}
}
