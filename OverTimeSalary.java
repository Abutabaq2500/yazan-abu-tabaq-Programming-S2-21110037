package salaryCalculator;

public class OverTimeSalary {

	static int calculateOverTimeSalary(int basicSalary, int overTimeHours)
	{
		int salary = 0;
		salary = basicSalary + (overTimeHours*8);
		return salary;
	}

}
