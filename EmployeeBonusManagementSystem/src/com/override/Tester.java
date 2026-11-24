package com.override;

public class Tester extends Employee {
	
	@Override
	double calculateSalary() {
		return 5000+getSalary();
	}

}
