package com.managementsystem;

public class StudentAdmin {
	public static void main(String[] args) {
		Student student=new Student();
		student.sid=1;
		student.sname="Sauraksha";
		student.batch.bid=77;
		student.batch.bname="Batch77";
		student.batch.faculty.fid=5;
		student.batch.faculty.fname="Nilesh Sir";
		student.batch.faculty.course.cid=26;
		student.batch.faculty.course.cname="Advanced JAVA";
		System.out.println(student.sid);
		System.out.println(student.sname);
		System.out.println(student.batch.bid);
		System.out.println(student.batch.bname);
		System.out.println(student.batch.faculty.fid);
		System.out.println(student.batch.faculty.fname);
		System.out.println(student.batch.faculty.course.cid);
		System.out.println(student.batch.faculty.course.cname);
				
	}
}+
