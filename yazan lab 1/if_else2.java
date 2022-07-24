package In_lecture;

public class if_else2 {

	public static void main(String[] args) {

		int mark = 90;
		if(mark <= 49)
		{
			System.out.println("U");
		}
		else if(mark >= 50 && mark <= 70)
		{
			System.out.println("P");
		}
		else if(mark > 70 && mark <= 85)
		{
			System.out.println("M");
		}
		else if(mark > 85 && mark <= 100)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("invalid input");
		}

	}

}
