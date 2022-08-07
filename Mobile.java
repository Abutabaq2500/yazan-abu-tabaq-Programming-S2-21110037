package In_lecture;

public class Mobile {
	
	String brand;
	String color;
	String camera;
	int yearOfProduction;
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.brand = "iPhone 13 pro max";
		mobile.color = "blue";
		mobile.camera = "3 cameras";
		mobile.yearOfProduction = 2020;
		System.out.println("Brand: " + mobile.brand);
		System.out.println("Color: " + mobile.color);
		System.out.println("Number of camera: " + mobile.camera);
		System.out.println("Released: " + mobile.yearOfProduction);
	}

}
