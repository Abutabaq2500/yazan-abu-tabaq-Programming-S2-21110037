package In_lecture;

public class lab_3_ex1 {

	public static void main(String[] args) {

		int[] arr = {3,6,7,9};
		int key = 7;
		int result = -1;
		int count = 0;
		while(count < arr.length)
		{
			
			if(arr[count] == key)
			{
				
				result = count;
				
			}
			count++;
		}
		
		System.out.println("The item in " + result);

	}

}
