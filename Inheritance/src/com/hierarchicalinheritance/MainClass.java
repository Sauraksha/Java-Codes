package com.hierarchicalinheritance;

public class MainClass extends Vehicle {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		Bike bk=new Bike();
		Bus b=new Bus();
		
		c.displayCar();
		System.out.println("Brand="+c.brand);
		System.out.println("Speed="+c.speed);
		System.out.println("Doors="+c.doors);
		
		
		bk.displayBike();
		System.out.println("Brand="+bk.brand);
		System.out.println("Speed="+bk.speed);
		System.out.println("hasGear="+bk.hasGear);
		
		b.displayBus();
		System.out.println("Brand="+b.brand);
		System.out.println("Speed="+b.speed);
		System.out.println("Seats="+b.seats);
	}

}
