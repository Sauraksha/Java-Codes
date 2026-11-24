package com.bookgettersetter;

public class Book {

	private int bookId;
	private String bookName;
	private boolean available;
	private double price;
	
	public int getBookId()
	{
		return bookId;
	}
	public void setBookId(int i)
	{
		bookId=i;
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setBookName(String s)
	{
		bookName=s;
	}
	
	public boolean getAvailable()
	{
		return available;
	}
	public void setAvailable(boolean b)
	{
		available=b;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double d)
	{
		price=d;
	}
	
	
	public double discount()
	{
		double disc=price/100*5;
		System.out.println("the discount is="+disc);
		double soldPrice=price-disc;
		return soldPrice;
	}
}
