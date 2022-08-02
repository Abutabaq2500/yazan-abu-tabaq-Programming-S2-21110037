package In_lecture;

public class method_overload_2 {
	
	static void integer(int x)
	{
		System.out.println("I have integer " + x);
	}
	static void floating(float t)
	{
		System.out.println("I have float " + t);
	}
	static void doubled(double z)
	{
		System.out.println("I have an integer " + z);
		
	}
	static void names(String name)
	{
		
		System.out.println("I have an integer " + name);
	}

	public static void main(String[] args) {

		int x= 5;
		float t = 8.7f;
		double z = 15.2;
		String name = "Yazan";
		integer(x);
		floating(t);
		doubled(z);
		names(name);
		
		
	
	}

}
