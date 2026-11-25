package com.gettersetter;


	public class MainClass {
		public static void main(String[] args) {
			Student s=new Student();
			s.setRno(1);
			int i1=s.getRno();
			System.out.println("ronn_no:"+i1);
			s.setName("Rani");
			String s1=s.getName();
			System.out.println("name:"+s1);
			s.setMarks(80.9f);
			float f1=s.getMarks();
			System.out.println("marks:"+f1);
			s.setContact(8390199127l);
			long l1=s.getContact();
			System.out.println("contact_no:"+l1);
			s.setFlag(true);
			boolean flag1=s.getFlag();
			System.out.println("Student is present");
			s.setAge(19);
			int age1=s.getAge();
			System.out.println("age:"+age1);
			s.setDivision('A');
			char c1=s.getDivision();
			System.out.println("division:"+c1);
			s.setFees(100000);
			double d=s.getFees();
			System.out.println("fees:"+d);
		}

	}


