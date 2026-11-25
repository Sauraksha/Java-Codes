package employeebenefitsystem;

public class FullTimeEmployee implements Employee {

	@Override
	public double calculateSalary() {
		double salary=5000;
		int workingdays=30;
		return salary*workingdays;
	}

	@Override
	public String getBenefit() {
		// TODO Auto-generated method stub
		return "Annual Bonus,Health Insurance";
	}

}
