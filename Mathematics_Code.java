package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathematics_Code {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option = 0;
		System.out.println("Welcome to the mathematics!");
		System.out.println("");
		System.out.println("This game is about the mathematic equation.");
		System.out.println("");
		try 
		{
			while(option != 5)
			{
				System.out.println("Please choose any number for one of these options: ");
				System.out.println("1. Summation.");
				System.out.println("2. Subtraction.");
				System.out.println("3. Multiplication.");
				System.out.println("4. Division.");
				System.out.println("5. Exit");
			
				option = input.nextInt();
			
				switch(option)
				{
					case 1:
						Summation();
					break;
					case 2:
						Subtraction();
					break;
					case 3:
						Multiplication();
					break;
					case 4:
						Division();
					break;
					case 5:
						System.out.println("thank you!");
					break;
					default:
						System.out.println("invalid option");
					break;
				}
			}
		}
		catch (InputMismatchException e )
		{
			System.err.println("the option must be a number!");
		}
	
	}
	
	public static void Summation() {
		
		Scanner question = new Scanner(System.in);
		int answer = 0;
		int correct = 0;
		int main_menu = 0;
		System.out.println("the game is started");
		System.out.println("");
		System.out.println("Q1: 5 + 5 = ?");
		System.out.println("1) 13.");
		System.out.println("2) 10.");
		System.out.println("3) 18.");
		answer = question.nextInt();
		if(answer == 2)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q2: 20 + 7 = ?");
		System.out.println("1) 27.");
		System.out.println("2) 23.");
		System.out.println("3) 29.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q3: 16 + 26 = ?");
		System.out.println("1) 36.");
		System.out.println("2) 42.");
		System.out.println("3) 46.");
		answer = question.nextInt();
		if(answer == 2)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q4: 30 + 20 = ?");
		System.out.println("1) 70.");
		System.out.println("2) 60.");
		System.out.println("3) 50.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 1 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q5: 65 + 35 = ?");
		System.out.println("1) 100.");
		System.out.println("2) 80.");
		System.out.println("3) 90.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("you got " + correct + " out of 5");
		System.out.println("Good luck for everything!");
		while(main_menu != 1)
		{
			System.out.println("Type 1 to exit");
			main_menu = question.nextInt();
			switch(main_menu)
			{
				case 1:
					System.out.println("Back to the main menu.");
					System.out.println("");
				break;
				default:
					System.out.println("invalid input.");
				break;
			}
		}
		
		
		
	}
	public static void Subtraction() {
		
		Scanner question = new Scanner(System.in);
		int answer = 0;
		int correct = 0;
		int main_menu = 0;
		System.out.println("the game is started");
		System.out.println("");
		System.out.println("Q1: 8 - 4 = ?");
		System.out.println("1) 6.");
		System.out.println("2) 2.");
		System.out.println("3) 4.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q2: 15 - 8 = ?");
		System.out.println("1) 7.");
		System.out.println("2) 8.");
		System.out.println("3) 3.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q3: 40 - 15 = ?");
		System.out.println("1) 15.");
		System.out.println("2) 20.");
		System.out.println("3) 25.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 2 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q4: 72 - 15 = ?");
		System.out.println("1) 60.");
		System.out.println("2) 47.");
		System.out.println("3) 57.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 1 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q5: 90 - 28 = ?");
		System.out.println("1) 62.");
		System.out.println("2) 72.");
		System.out.println("3) 68.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("you got " + correct + " out of 5");
		System.out.println("Good luck for everything!");
		while(main_menu != 1)
		{
			System.out.println("Type 1 to exit");
			main_menu = question.nextInt();
			switch(main_menu)
			{
				case 1:
					System.out.println("Back to the main menu.");
					System.out.println("");
				break;
				default:
					System.out.println("invalid input.");
				break;
			}
		}
		
		
		
	}
	public static void Multiplication() {
		
		Scanner question = new Scanner(System.in);
		int answer = 0;
		int correct = 0;
		int main_menu = 0;
		System.out.println("the game is started");
		System.out.println("");
		System.out.println("Q1: 3 x 2 = ?");
		System.out.println("1) 6.");
		System.out.println("2) 9.");
		System.out.println("3) 5.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q2: 5 x 4 = ?");
		System.out.println("1) 15.");
		System.out.println("2) 10.");
		System.out.println("3) 20.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 1 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q3: 7 x 10 = ?");
		System.out.println("1) 70.");
		System.out.println("2) 60.");
		System.out.println("3) 90.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q4: 15 x 5 = ?");
		System.out.println("1) 45.");
		System.out.println("2) 65.");
		System.out.println("3) 75.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 1 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q5: 60 x 2 = ?");
		System.out.println("1) 140.");
		System.out.println("2) 120.");
		System.out.println("3) 180.");
		answer = question.nextInt();
		if(answer == 2)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("you got " + correct + " out of 5");
		System.out.println("Good luck for everything!");
		while(main_menu != 1)
		{
			System.out.println("Type 1 to exit");
			main_menu = question.nextInt();
			switch(main_menu)
			{
				case 1:
					System.out.println("Back to the main menu.");
					System.out.println("");
				break;
				default:
					System.out.println("invalid input.");
				break;
			}
		}
		
		
		
	}
	public static void Division() {
		
		Scanner question = new Scanner(System.in);
		int answer = 0;
		int correct = 0;
		int main_menu = 0;
		System.out.println("the game is started");
		System.out.println("");
		System.out.println("Q1: 4 / 2 = ?");
		System.out.println("1) 4.");
		System.out.println("2) 0.");
		System.out.println("3) 2.");
		answer = question.nextInt();
		if(answer == 3)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 2 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q2: 12 / 4 = ?");
		System.out.println("1) 3.");
		System.out.println("2) 6.");
		System.out.println("3) 8.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q3: 36 / 6 = ?");
		System.out.println("1) 6.");
		System.out.println("2) 8.");
		System.out.println("3) 12.");
		answer = question.nextInt();
		if(answer == 1)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 2 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q4: 52 / 13 = ?");
		System.out.println("1) 39.");
		System.out.println("2) 4.");
		System.out.println("3) 8.");
		answer = question.nextInt();
		if(answer == 2)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 3 && answer == 1 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("Q5: 100 / 20 = ?");
		System.out.println("1) 20.");
		System.out.println("2) 5.");
		System.out.println("3) 10.");
		answer = question.nextInt();
		if(answer == 2)
		{
			correct++;
			System.out.println("");
			System.out.println("correct answer!");
			System.out.println("");
		}
		else if(answer == 1 && answer == 3 && answer > 3 && answer < 1)
		{
			System.out.println("");
			System.out.println("wrong answer!");
			System.out.println("");
		}
		else
		{
			
			System.out.println("Invalid input!");
		}
		System.out.println("you got " + correct + " out of 5");
		System.out.println("Good luck for everything!");
		while(main_menu != 1)
		{
			System.out.println("Type 1 to exit");
			main_menu = question.nextInt();
			switch(main_menu)
			{
				case 1:
					System.out.println("Back to the main menu.");
					System.out.println("");
				break;
				default:
					System.out.println("invalid input.");
				break;
			}
		}
		
		
		
	}

}