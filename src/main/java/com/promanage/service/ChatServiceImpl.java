package com.promanage.service;

import org.springframework.stereotype.Service;

import com.promanage.modal.Chat;
import com.promanage.repository.ChatRepository;

@Service
public class ChatServiceImpl implements ChatService{
	
	private ChatRepository chatRepository;
	
	@Override
	public Chat createdChat(Chat chat) {
		// TODO Auto-generated method stub
		return chatRepository.save(chat);
	}

}
