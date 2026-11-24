package com.abstractionexample;

public class PaymentWithUPI extends Payment{

	@Override
	public void makePayment() {
		System.out.println("payment completed with UPI");
		
	}

}
