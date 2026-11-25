package com.interfaceinheritanceexample;

public class TestClass implements I3{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 implemented method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 implemented method");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 implemented method");
		
	}
	public void m4()
	{
		System.out.println("testclass m4 method");
	}
	
	public static void main(String[] args) {
		System.out.println("==I1==");
		I1 i1=new TestClass();
		i1.m1();
		System.out.println("X="+I1.x);
		
		System.out.println("------------------------");
		
		System.out.println("==I2==");
		I2 i2=new TestClass();
		i2.m1();
		i2.m2();
		System.out.println("Y="+I2.y);
		
		System.out.println("-------------------------");
		
		System.out.println("==I3==");
		I3 i3=new TestClass();
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println("Z="+I3.z);
		
		System.out.println("-------------------------");
		
		System.out.println("==TestClass==");
		TestClass tc=new TestClass();
		tc.m1();
		tc.m2();
		tc.m3();
		tc.m4();
	
		
		
	}

}
