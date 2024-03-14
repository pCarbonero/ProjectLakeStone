package programmclasses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// We call to Scanner's function and we create a object of it
		Scanner scan = new Scanner(System.in);
		
		// Variable which save the name of the user
		String name = "";
		
		// Print a message of welcome to game
		System.out.println("Welcome to 'The Lake And The Stone'");
		
		// We ask the name to the user
		System.out.println("What's your name?");
		// Scan and save the user's name
		name = scan.nextLine();
		
		
		// Scanner's close
		scan.close();

	}

}
