package diceroller;

import java.util.Scanner;
import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");
		Scanner scan = new Scanner(System.in);
		int count = 1;

		Random rand = new Random();


	String rollAgain;
	do {
		System.out.println("How many sides should each die have?");
		generateRandomDieRoll();

		//how many dice should it roll
		
			//put argument in parenthesis that makes answers randomized?
		

		System.out.println("Would you like to roll again? (y/n)");	
		rollAgain = scan.next();
		count++;
	 }while (rollAgain.equals("y")); }



	public static int generateRandomDieRoll() {
		Scanner sides = new Scanner(System.in);
		Random ran = new Random();
		
		int number=1;
		
		
		for (int i = 0; i < 20; i++) {
			number = sides.nextInt();
			System.out.println(ran.nextInt(number + i++));
			System.out.println(ran.nextInt(number + i++));
			break;
		}
		return number;

			
}
}

