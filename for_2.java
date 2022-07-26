package In_lecture;

public class for_2 {

	public static void main(String[] args) {

		int []array = {13, 20, 8, 3, 5, 0, 25, 40, 37, 33};
		for(int i = 0;i<=array.length - 1;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("");
		for(int i: array)
		{
			System.out.println(i);
		}
	}

}
