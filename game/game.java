package game;
import java.util.Scanner;
import java.util.Random;

public class game {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		String playerName = "Player";
		int amountPlayers = 3;
		
		
		boolean running = true;
		while(running) {
			clearScreen();
			
			System.out.println("Welcome to Monopoly");
			System.out.println("_____________________________________________");
			System.out.println("\nPlease select one of the following options:\n1) Start Game\n2) Edit number of players\n3) Change player name\n\n0) Exit");
			
			int menuChoice = input.nextInt();
			if(menuChoice == 1) {
				clearScreen();
				//GAMELOOP
				while(true) {
					break;
				}
			}
			else if(menuChoice == 2) {
				clearScreen();
				System.out.println("Please input your player's name: ");
				playerName = input.nextLine();
			}
			else if(menuChoice == 3) {
				clearScreen();
				System.out.println("Please input the amount of players(1-3): ");
				amountPlayers = input.nextInt();
			}
			else if(menuChoice == 0) {
				clearScreen();
				System.exit(0);
			}
			else {
				System.out.println("Please input a valid option.");
			}
			
		}
	}
	
	
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  

}
