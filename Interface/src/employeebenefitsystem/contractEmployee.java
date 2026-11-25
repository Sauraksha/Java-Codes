package employeebenefitsystem;

public class contractEmployee implements Employee{

	@Override
	public double calculateSalary() {
		double salary=2000;
		int workingdays=15;
		return salary*workingdays;
	}

	@Override
	public String getBenefit() {
		// TODO Auto-generated method stub
		return "Benefits depend on Project";
	}

}
