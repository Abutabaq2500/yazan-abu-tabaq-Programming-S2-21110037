package In_lecture;

public class lab_3_ex2 {

	public static void main(String[] args) {
		
		bubblesorts obj = new bubblesorts();
		int arr[] = {9,1,8,2,7,3,6,4,5};
		bubblesorts.bubblesort(arr);
		
		for(int count : arr)
		{
			System.out.print(count);
		}

	}
}
	
class bubblesorts {
	
	public static void bubblesort(int arr[]) {
		
		
		for(int i = 0;i < arr.length - 1;i++)
		{
			for(int j = 0;j < arr.length - i - 1;j++)
			{
				
				if(arr[j] > arr[j+1])
				{
					int in_order = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = in_order;	
				}
				
			}

		}
		
	}
	
}

