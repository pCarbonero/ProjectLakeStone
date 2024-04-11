package programmclasses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Create an object of the class Stone
		Stone stone;
		
		// We call to Scanner's function and we create a object of it
		Scanner scan = new Scanner(System.in);
		
		// Variable which save the name of the user
		String name = "";
		
		// Variable which save the intensity of the stone
		int intensity = 0;
		
		//Variable which save the position in X
		int posX = 0;

		//Variable which save the position in Y
		int posY = 0;
		
		// Print a message of welcome to game
		System.out.println("Welcome to 'The Lake And The Stone'");
		
		// We ask the name to the user
		System.out.println("What's your name?");
		// Scan and save the user's name
		name = scan.nextLine();
		
		//We ask the position two position to the user
		System.out.println("Position in X: ");
		posX = scan.nextInt();
		System.out.println("Position in Y: ");
		posY = scan.nextInt();
		
		// We ask to the user the intensity
		System.out.println("Intensity: ");
		intensity = scan.nextInt();
		
		stone = new Stone(posX, posY, intensity);
		
		stone.lakeWaves();
		
		// Scanner's close
		scan.close();

	}

}
