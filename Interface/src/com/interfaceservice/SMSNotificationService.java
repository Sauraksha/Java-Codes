package com.interfaceservice;

public class SMSNotificationService implements NotificationService {

	@Override
	public void send(String msg) {
		System.out.println("sms received:"+msg);
		
	}

	@Override
	public String getNotification() {
		
		return "sms sent successfully....";
	}

}
