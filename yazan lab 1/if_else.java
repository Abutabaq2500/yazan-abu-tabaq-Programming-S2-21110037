package In_lecture;

public class if_else {

	public static void main(String[] args) {


		int day = 0;
		if(day >= 1 && day <= 7)
		{
			System.out.println("Week 1");
		}
		else if(day >= 8 && day <= 14)
		{
			System.out.println("Week 2");
		}
		else if(day >= 15 && day <= 21)
		{
			System.out.println("Week 3");
		}
		else if(day >= 22 && day <= 28)
		{
			System.out.println("Week 4");
		}
		else if(day >= 29 && day <= 31)
		{
			System.out.println("Week 5");
		}
		else
		{
			System.out.println("error");
		}
		

	}

}
