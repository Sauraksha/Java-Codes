package com.override;

public class Manager extends Employee{
	
	@Override
	double calculateSalary() {
		return 20000+getSalary();
	}

}
