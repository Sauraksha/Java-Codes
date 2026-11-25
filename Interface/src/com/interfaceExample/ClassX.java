package com.interfaceExample;

public class ClassX implements InterfaceI {

	@Override
	public void m1() {
		System.out.println("----implemented m1 method----");
		
	}

	@Override
	public void m2() {
		System.out.println("----implemented m2 method----");		
	}
	
	public void m3()
	{
		System.out.println("----own method of ClassX----");
	}
	
	public static void main(String[] args) {
		
		InterfaceI i=new ClassX();
		System.out.println(i.x);
		System.out.println(i.y);
		i.m1();
		i.m2();
		
		ClassX c=new ClassX();
		c.m3();
	}

}
