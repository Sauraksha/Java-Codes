package com.finalexamples;

public class FinalTest2 {

	final int x;
	
	public FinalTest2()
	{
		x=100;
	}
	
	public void m1(final int i,final int j)
	{
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		FinalTest2 ft=new FinalTest2();
		ft.m1(100, 200);
		
		final FinalTest2 ft1=new FinalTest2();
	}
}
