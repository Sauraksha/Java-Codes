package test;

public class Calculator
{
	public void add()
	{
		System.out.println("the addition is 20");
	}
	public void sub()
	{
		System.out.println("the substraction is 50");
	}
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();
	}

}
