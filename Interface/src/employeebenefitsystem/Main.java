package employeebenefitsystem;

public class Main {
	public static void main(String[] args) {
		
		Employee e;
		
		System.out.println("----Full Time Employee----");
		e=new FullTimeEmployee();
		System.out.println("Salary is:"+e.calculateSalary());
		System.out.println("Benefites:"+e.getBenefit());
		System.out.println("--------------------------------");
		
		System.out.println("----Part Time Employee----");
		e=new PartTimeEmployee();
		System.out.println("Salary is:"+e.calculateSalary());
		System.out.println("Benefites:"+e.getBenefit());
		System.out.println("--------------------------------");
		
		System.out.println("----Contract Employee----");
		e=new contractEmployee();
		System.out.println("Salary is:"+e.calculateSalary());
		System.out.println("Benefites:"+e.getBenefit());
		
		
	}

}
