package com.abstraction;

public class AbstractChild extends Abstraction{

	@Override
	public void m2() {
		System.out.println("implemented m2 method");
		
	}
	public void m3()
	{
		System.out.println("child class method");
		
	}
	public static void main(String[] args) {
		
		Abstraction a=new AbstractChild();
		a.m1();
		a.m2();
		
		System.out.println("==child class==");
		AbstractChild ac=new AbstractChild();
		ac.m1();
		ac.m2();
		ac.m3();
		
	}

	
	
}
