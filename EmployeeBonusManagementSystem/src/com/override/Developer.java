package com.override;

public class Developer extends Employee{
	
	@Override
	double calculateSalary() {
	
		return 10000+getSalary();
	}
	
	

}

