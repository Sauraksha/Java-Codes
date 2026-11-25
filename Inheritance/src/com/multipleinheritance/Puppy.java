package com.multipleinheritance;

public class Puppy extends Dog{
	
	String puppyname="Bruno";
	double weight=5.0;
	
	public void play() {
	
	System.out.println("Puppy play with ball");	
	}
	
	public static void main(String[] args) {
		Puppy p=new Puppy();
		System.out.println("Food="+p.food);
		System.out.println("Age="+p.age);
		System.out.println("Color="+p.color);
		System.out.println("Name="+p.puppyname);
		System.out.println("Weight="+p.weight);
		p.eat();
		p.bark();
		p.play();
		
	}
}
