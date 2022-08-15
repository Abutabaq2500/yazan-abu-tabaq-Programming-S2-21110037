package salaryCalculator;

public class BasicSalary {

	public int calculatesalary(int hour, int rate) {
		
		int salary = hour * rate;
		return salary;

	}
	public int calculatesalary (int hour, int rate, boolean overTime,int overTimeCount) { 

		int salary = calculatesalary(hour, rate);
		if (overTime == true) {
			
			salary = OverTimeSalary.calculateOverTimeSalary(salary, overTimeCount);
			
		}
		
		return salary;
		
	}
}
