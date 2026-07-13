package com.bptn.course.day_06;

public class MethodOverloadingLoginDemo {
	
	public void login(String email, String password) {
		System.out.println("Logging in with username: " + email + " and password: " + password);
	}
	
	public void login(String phone, int otp) {
		System.out.println("Logging in with phone: " + phone + " and password: " + otp);
	}
	
	public void login(String gmailID) {
		System.out.println("Logging in with Google account: " + gmailID);
	}

}
