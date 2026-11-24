package com.bookgettersetter;

public class BookAdmin {
public static void main(String[] args) {
	AllBook all=new AllBook();
	 all.math.setBookId(1);
	 int id1=all.math.getBookId();
	 System.out.println("Book id:"+id1);
	 all.math.setBookName("mathematics");
	 String name=all.math.getBookName();
	 System.out.println("Book name:"+name);
	 all.math.setAvailable(true);
	 boolean avl=all.math.getAvailable();
	 System.out.println("book is available");
	 all.math.setPrice(250);
	 double pr=all.math.getPrice();
	 System.out.println("Price:"+pr);
	 
	 System.out.println("--------------------------------");
	 
	 all.english.setBookId(2);
	 int id11=all.math.getBookId();
	 System.out.println("Book id:"+id11);
	 all.english.setBookName("english");
	 String name1=all.math.getBookName();
	 System.out.println("Book name:"+name1);
	 all.english.setAvailable(false);
	 boolean avl1=all.math.getAvailable();
	 System.out.println("book is not available");
	 all.english.setPrice(200);
	 double pr1=all.math.getPrice();
	 System.out.println("Price:"+pr1);
	 
	 
	 System.out.println("--------------------------------");
	 
	 all.science.setBookId(2);
	 int id12=all.math.getBookId();
	 System.out.println("Book id:"+id12);
	 all.science.setBookName("science");
	 String name12=all.math.getBookName();
	 System.out.println("Book name:"+name12);
	 all.english.setAvailable(true);
	 boolean avl12=all.math.getAvailable();
	 System.out.println("book is available");
	 all.science.setPrice(400);
	 double pr12=all.math.getPrice();
	 System.out.println("Price:"+pr12);
	 
	 System.out.println("-----------------------------------");
	 
	 double dis=all.math.discount();
	 System.out.println("the actual price of maths book is:"+dis);
	 
	 double dis1=all.english.discount();
	 System.out.println("the actual price of english book is:"+dis1);
	 
	 double dis2=all.science.discount();
	 System.out.println("the actual price of science book is:"+dis2);
}
}
