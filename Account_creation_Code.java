package Final_Assignment;

import java.util.Scanner;

public class Account_creation_Code {
	
	
	static Scanner keep = new Scanner(System.in);
	static Scanner keep2 = new Scanner(System.in);
	static Scanner keep3 = new Scanner(System.in);
	static Scanner keep4 = new Scanner(System.in);
	static String press = "";
	static String login = "";
	static String new_username = "";
	static String new_password = "";
	static String my_username = "";
	static String my_password = "";
	

	public static void main(String[] args)
	{
		
		Account_creation_Code ubj = new Account_creation_Code();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the application!");
		while(!press.equals("exit") && !login.equals("exit"))
		{
			
				
			System.out.println("");
			System.out.print("type start to continue or exit: ");
			press = keep.nextLine();
			switch(press)
			{
				case "start":
					System.out.println("");
					System.out.println("You must be logged in to be accessed to the system.");
					login();
				break;
					
				case "exit":
				{
					System.out.println("");
				}
				break;
					
				default:
					System.out.println("invalid input!");
				break;
			}
				
		}
		
	}
	public static void login() {
		
		Scanner input = new Scanner(System.in);
		String loggings = "";
		System.out.println("");
		while(!login.equals("exit") && !loggings.equals("exit"))
		{
			
			System.out.println("Choose sign in or create new account:");
			System.out.println("");
			System.out.println("Or type exit:");
			login = keep.nextLine();
			
			switch(login)
			{
				case "sign in":
					sign_in();
				break;
				
				case "create new account":
					create_new_account();
				break;
				
				case "exit":
					System.out.print("");
				break;
				
				default:
					System.out.println("");
					System.out.println("invalid choice");
					System.out.println("");
				break;
					
			}
			
		}
		
	}

	public static void sign_in() {
		
		Scanner inputs = new Scanner(System.in);
		String username = "";
		String password = "";
		
		while(!username.equals("exit") && !password.equals("exit") && !login.equals("exit"))  
		{
			System.out.println("");
			System.out.println("enter your username and your password:");
			System.out.println("");
			my_username = new_username;
			my_password = new_password;
			System.out.print("Username: ");
			my_username = keep.nextLine();
			System.out.print("Password: ");
			my_password = keep.nextLine();
			if(my_username.equals(new_username) && my_password.equals(new_password) && !my_username.equals("exit") && !my_password.equals("exit"))
			{
				System.out.println("");
				System.out.println("logged in.");
				System.out.println("");
				my_account();
					
			}
			else if(my_username.equals("exit") && my_password.equals("exit"))
			{
					
				System.out.println("");
				System.out.println("back!");
				System.out.println("");
				login();
				break;
					
			}
			else
			{
				System.out.println("");
				System.out.println("incorrect!");
				System.out.println("");
					
			}
			
		}
			
	}
	public static void create_new_account() {
		
		Scanner input = new Scanner(System.in);
		String creating = "";
		String username = "";
		String password = "";
		
		while(!creating.equals("log out") || !username.equals("exit") && !password.equals("exit") && !login.equals("exit"))
		{
			System.out.println("");
			System.out.println("Create your username and create new password: ");
			System.out.print("Username: ");
			new_username = keep3.nextLine();
		
			System.out.print("Password: ");
			new_password = keep3.nextLine();
			
			if(!new_username.equals("exit") && !new_password.equals("exit"))
			{
				System.out.println("");
				System.out.println("Account created! ");
				System.out.println("");
				while(creating != "log out" && !login.equals("exit"))
				{
					System.out.println("");
					System.out.print("Would you like to continue or log out? ");
					creating = input.nextLine();
					if(creating.equals("continue"))
					{
						my_account();
					}
					else if(creating.equals("log out"))
					{
						System.out.println("");
						System.out.println("logged out");
						System.out.println("");
						break;
						
						
					}
					else
					{
						System.out.println("");
						System.out.println("invalid input");
						System.out.println("");
						
					}
				
				}
				break;
				
			}
			
			else if(new_username.equals("exit") || new_password.equals("exit"))
			{
				System.out.println("");
				System.out.println("back!");
				System.out.println("");
				
			}
			break;
		}	
			
	}
	public static void my_account() {
		
		Scanner option = new Scanner(System.in);
		String choice = "";
		System.out.println("");
		System.out.println("Welcome " + new_username + "!");
		System.out.println("");
		while(!choice.equals("log out"))
		{
			System.out.println("1. log out.");
			System.out.println("");
			System.out.print("Choose one of these option: ");
			choice = option.nextLine();
			if(choice.equals("log out"))
			{
				System.out.println("");
				System.out.println("logged out");
				System.out.println("");
				login();
				break;
			}
			else
			{
				System.out.println("");
				System.out.println("invalid input");
				System.out.println("");	
			}
			
		}
		
	}

}