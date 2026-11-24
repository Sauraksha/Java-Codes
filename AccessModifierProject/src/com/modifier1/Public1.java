package com.modifier1;

import com.modifier.Public;

public class Public1 {
	void m1()
	{
		Public p=new Public();
		p.display();
	}
	public static void main(String[] args) {
		Public1 p1 = new Public1();
		p1.m1();
	}

}
