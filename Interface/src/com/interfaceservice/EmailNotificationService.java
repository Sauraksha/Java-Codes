package com.interfaceservice;

public class EmailNotificationService implements NotificationService{

	@Override
	public void send(String msg) {
	System.out.println("email sent:" +msg);
		
	}

	@Override
	public String getNotification() {
		
		return "Email sent successfully.....";
	}

}
