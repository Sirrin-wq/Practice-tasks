package tasks;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		int counter = 0;
		int number = 0;

		Scanner in = new Scanner(System.in);
		int guess = 0;
		String answer = "";
		System.out.println("Try to guess a number between -100 and 100");

		do {
			number = (int)(Math.random() * 200 - 100);
			guess = 0;
			counter = 0;

			while(guess != number){
				counter++;
				System.out.println("Number of attempts: " + counter);
				guess = in.nextInt();

				if(guess < number) {
					System.out.println(guess + " is too small. Try again");
				}
				else if (guess > number) {
					System.out.println(guess + " is too big. Try again");
				}
				else
					System.out.println(guess + " is correct");
			}
			System.out.println("Congratz, it only took you " + counter + " attempts to guess the number. Good work");
			System.out.println();

			System.out.println("Would you like to play again? y/n");
			answer = in.next();
		}
		while(answer.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing. Goodbye.");
		in.close();
	}

}

