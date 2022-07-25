package In_lecture;

public class lab_1_ex2 {

	public static void main(String[] args) {

		int month = 10;
		
		switch(month)
		{
			case 1,2,3:
				System.out.println("Quarter 1 of the year");
			break;
			case 4,5,6:
				System.out.println("Quarter 2 of the year");
			break;
			case 7,8,9:
				System.out.println("Quarter 3 of the year");
			break;
			case 10,11,12:
				System.out.println("Quarter 4 of the year");
			break;
			default:
				System.out.println("invalid input");
			break;
		}

	}

}
