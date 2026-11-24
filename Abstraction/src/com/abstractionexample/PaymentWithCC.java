package com.abstractionexample;

public class PaymentWithCC extends Payment
{

	@Override
	public void makePayment() {
		System.out.println("payment complete with CC");
		
	}

}
