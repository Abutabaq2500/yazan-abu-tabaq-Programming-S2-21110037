package Yazan;

import employee.FullTime;
import employee.PartTime;
import salaryCalculator.BasicSalary;

public class Main {

	public static void main(String[] args) {
		
		int salary1;
		FullTime obj1 = new FullTime();
		obj1.sethour(8);
		BasicSalary obj2 = new BasicSalary();
		salary1 = obj2.calculatesalary(obj1.gethour(), obj1.getrate());
		System.out.println(salary1);
		salary1 = obj2.calculatesalary(obj1.gethour(), obj1.getrate(), true,5);
		System.out.println(salary1);
		
		int salary2;
		FullTime obj3 = new FullTime();
		obj3.sethour(8);
		BasicSalary obj4 = new BasicSalary();
		salary2 = obj4.calculatesalary(obj3.gethour(), obj3.getrate());
		System.out.println(salary2);
		salary2 = obj4.calculatesalary(obj3.gethour(), obj3.getrate(), true,5);
		System.out.println(salary2);
		
	}

}
