package com.modifier;

public class Public {
  public int id;
  public String name;
  public double salary;
  
  
  public Public()
  {
	  id=100;
	  name="disha";
	  salary=909888;
	  
  }
  public void display()
  {
	  System.out.println("ID="+id);
	  System.out.println("NAME="+name);
	  System.out.println("SALARY="+salary);
  }
}
