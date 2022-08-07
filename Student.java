package In_lecture;

public class Student {

	int studentId;
	String studentName;
	String studentMajor;
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentId = 21110037;
		stu.studentName = "Yazan";
		stu.studentMajor = "Cyber Security";
		System.out.println("ID number: " + stu.studentId);
		System.out.println("Name: " + stu.studentName);
		System.out.println("Major: " + stu.studentMajor);
		

	}

}
