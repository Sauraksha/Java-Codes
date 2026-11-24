package com.abstractionexample;

public class PaymentWthNetbanking extends Payment{

	@Override
	public void makePayment() {
		System.out.println("payment complete with Net Banking");
		
	}
	
	public static void main(String[] args) {
		
		Payment p;
		
		System.out.println("==UPI Payment==");
		p=new PaymentWithUPI();
		p.startPayment();
		p.makePayment();
		p.paymentComplete();
		System.out.println("--------------------");
		
		System.out.println("==NetBanking Payment==");
		p=new PaymentWthNetbanking();
		p.startPayment();
		p.makePayment();
		p.paymentComplete();
		System.out.println("--------------------");
		
		System.out.println("==CC Payment==");
		p=new PaymentWithCC();
		p.startPayment();
		p.makePayment();
		p.paymentComplete();
		System.out.println("--------------------");
		
	}

	
}
