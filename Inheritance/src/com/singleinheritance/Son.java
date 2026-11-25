package com.singleinheritance;

public class Son extends Father{
String cname="sauraksha";

public void displayDetails()
{
	System.out.println("Student full name="+cname+" "+fname+" "+surname);
}

public static void main(String[] args) {
	Son s=new Son();
	s.display();
	s.displayDetails();
	
	
}
}
