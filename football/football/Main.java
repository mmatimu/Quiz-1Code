package football;

import java.util.Scanner;
public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		//Prompt user for number of Passing Attempts
		System.out.print("Enter number of Passing Attempts: ");
		double ATT = input.nextDouble();
		
		//Prompt user for number of Completions
		System.out.print("Enter number of Completions: ");
		double COMP = input.nextDouble();
		
		//Prompt user for Passing Yards
		System.out.print("Enter number of Passing Yards: ");
		double YDS = input.nextDouble();
		
		//Prompt user for Touchdown Passes
		System.out.print("Enter number of Touchdown: ");
		int TD = input.nextInt();
		
		//Prompt user for Interceptions
		System.out.print("Enter number of Interceptions: ");
		int INT = input.nextInt();
		
		//NFL passer rating four variables
		
		float a;
		a = (float) (((COMP / ATT) - .3) * 5);

		float b;
		b = (float) (((YDS / ATT) - 3) * .25);

		float c;
		c = (float) ((TD / ATT) * 20);

		float d;
		d = (float) (2.375 - ((INT / ATT)* 25));
		
		double PasserRating;
		
		PasserRating = ((a + b + c + d) / 6) * 100;
		
		System.out.printf("The Passer (QB) Rating is: " + "%3.2f", PasserRating);
		
		System.out.println();

	}

}
