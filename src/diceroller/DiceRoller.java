package diceroller;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");
		Scanner scan = new Scanner(System.in);
		int count = 1;
		
		Random rand = new Random();
	

	String rollAgain;
	do {
		System.out.println("How many sides should each die have?");
		int answer = scan.nextInt();
		
		//how many dice should it roll
		for (int i = 0; i < 2; i++) {
			 
			System.out.println(generateRandomDieRoll(rand));
			//put argument in parenthesis that makes answers randomized?
		}
		        
		System.out.println("Would you like to roll again? (y/n)");	
		rollAgain = scan.next();
		count++;
	 }while (rollAgain.equals("y")); }

	
	
	public static int generateRandomDieRoll(int num) {
		return num;
}
}
