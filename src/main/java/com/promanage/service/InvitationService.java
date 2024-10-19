package com.promanage.service;

import com.promanage.modal.Invitation;

public interface InvitationService {
	public void sendInvitation (String email, Long projectId);
	
	public Invitation acceptInvitation(String token, Long userId);
	
	public String getTokenByUserMail(String userEmail);
	
	void deleteToken(String token);
}
