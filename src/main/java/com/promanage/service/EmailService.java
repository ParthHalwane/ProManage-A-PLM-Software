package com.promanage.service;

public interface EmailService {
	void sendEmailWithToken(String userEmail, String link);
}
