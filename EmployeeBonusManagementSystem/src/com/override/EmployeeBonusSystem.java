package com.override;

public class EmployeeBonusSystem {

	public static void main(String[] args) {
		
		Employee e;
		
		e=new Developer();
		e.setSalary(40000);
		System.out.println("Developers actual salary is:"+e.getSalary());
		
		System.out.println("Developers salary including with bonus is:"+e.calculateSalary());
		
		e=new Manager();
		e.setSalary(60000);
		System.out.println("Managers actual salary is:"+e.getSalary());
		System.out.println("Managers Salary including with bonus is:"+e.calculateSalary());
		
		e=new Tester();
		e.setSalary(35000);
		System.out.println("Testers actual salary is:"+e.getSalary());
		System.out.println("Testers Salary including with bonus is:"+e.calculateSalary());
		
		
	}
}
