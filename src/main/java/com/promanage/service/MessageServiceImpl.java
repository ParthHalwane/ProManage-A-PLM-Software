package com.promanage.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.promanage.modal.Chat;
import com.promanage.modal.Message;
import com.promanage.modal.User;
import com.promanage.repository.MessageRepository;
import com.promanage.repository.UserRepository;
import com.promanage.response.MessageResponse;

public class MessageServiceImpl implements MessageService{

	@Autowired
	private ProjectService projectService;
	
	@Override
	public Message sendMessage(Long senderId, Long chatId, String content) throws Exception {
		User sender = UserRepository.findById(senderId).orElseThrow(() -> new Exception("User not found with ID: "+ senderId));
		
		Chat chat = projectService.getProjectById(projectId).getChat();
		
		Message message = new Message();
		message.setContent(content);
		message.setSender(sender);
		message.setCreatedAt(LocalDateTime.now());
		message.setChat(chat);
		message.savedMessage=MessageRepository.save(message);
		
		chat.getMessages().add(savedMessage);
		return savedMessage;
	}

	@Override
	public List<Message> getMessagesByProjectId(Long projectId) throws Exception {
		Chat chat = projectService.getChatByProjectId(projectId);
		List<Message> findByChatIdOrderByCreatedAtAsc = MessageRepository.findByChatIdOrderByCreatedAtAsc(chat.getId());
		return findByChatIdOrderByCreatedAtAsc;
	}

}
