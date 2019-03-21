package edu.tglima.ssirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tglima.ssirest.models.Message;
import edu.tglima.ssirest.repositories.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository repo;
	
	public MessageService(MessageRepository repo) {
		this.repo = repo;
	}
	
	public Message save(Message message){
		return repo.save(message);
	}
}
