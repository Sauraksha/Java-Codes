package com.interfaceservice;

public class AdminService {
	public static void main(String[] args) {
		
		NotificationService notificationService;
		
		System.out.println("===Email===");
		notificationService=new EmailNotificationService();
		notificationService.send("your order is placed");
		System.out.println(notificationService.getNotification());
		
		System.out.println("===SMS===");
		notificationService=new SMSNotificationService();
		notificationService.send("please use otp 123");
		System.out.println(notificationService.getNotification());
		
		System.out.println("===Whatsapp===");
		notificationService=new WhatsappNotificationService();
		notificationService.send("Your order is shipped please check the status otherwise track your order using below link");
		System.out.println(notificationService.getNotification());
		
		
		
	}

}
