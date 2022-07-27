package In_lecture;

public class lab_2_ex2 {
	
	
	public static void main(String[] args) {

		double area;
		double pie = 3.14;
		double r = 5;
		area = pie * (r * r);
		circle(pie,r);
		finalarea(area);
		

	}
	public static void circle(double pie, double r) {
		
		
		System.out.println("Area = " + pie + "(" + r + "* " + r + ")");
		
		
	}
	public static void finalarea(double area) {
		
		
		System.out.println("= " + area);
		
	}

	

}
