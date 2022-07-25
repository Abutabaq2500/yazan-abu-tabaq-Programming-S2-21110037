package In_lecture;

import java.util.Scanner;

public class lab_1_ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "";
		while(!choice.equals("exit"))
		{
			System.out.println("Choose for or while");
			System.out.println("or exit");
			choice = input.nextLine();
			switch(choice)
			{
				case "for":
					int f = 1;
					int num = 1;
					for(int count = 5;count >= num;count--)
					{
						
						f = f * count;
						
					}
					System.out.println(f);
				break;
				case "while":
					int f2 = 1;
					int num2 = 1;
					int count2 = 5;
					while(count2 >= num2)
					{
						f2 = f2 * count2;
						count2--;
					}
					System.out.println(f2);
				break;
				default:
					System.out.println("invalid choice");
					System.out.println("");
				break;
			}
		}
		

	}

}
