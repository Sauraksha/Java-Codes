package employeebenefitsystem;

public class PartTimeEmployee implements Employee{

	@Override
	public double calculateSalary() {
		double salary=3000;
		int workingdays=20;
		return salary*workingdays;
	}

	@Override
	public String getBenefit() {
		// TODO Auto-generated method stub
		return "Employee discount,weakend holiday";
	}

}
