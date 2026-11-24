package com.modifier;

public class Private {
	private int id;
	private String name;
	private double salary;
	
	private Private()
	{
		id=101;
		name="Sauraksha";
		salary=900000;
	}
	
	private void m1()
	{
		System.out.println("==method m1==");
	}
	
	public static void main(String[] args) {
		Private p=new Private();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.salary);
		p.m1();
	}
	
}
