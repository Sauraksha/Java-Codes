package test;

public class AllBlock {
	static {
		System.out.println("==static method==");
	}
	AllBlock()
	{
		System.out.println("==default constructor==");
	}
	{
		System.out.println("==non static method==");
	}
	public void m1()
	{
		System.out.println("==m1 method==");
	}
	public static void main(String[] args) {
		System.out.println("==main method==");
		AllBlock all=new AllBlock();
		all.m1();
	}

}
