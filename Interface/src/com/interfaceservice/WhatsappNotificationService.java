package com.interfaceservice;

public class WhatsappNotificationService implements NotificationService{

	@Override
	public void send(String msg) {
		System.out.println("whatsapp msg received:"+msg);
	}

	@Override
	public String getNotification() {
		// TODO Auto-generated method stub
		return "Whatsapp message sent successfully....";
	}

}
