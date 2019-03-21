package edu.tglima.ssirest.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.tglima.ssirest.models.Message;
import edu.tglima.ssirest.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageResource {

	@Autowired
	private MessageService service;
	
	public MessageResource(MessageService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@Valid @RequestBody Message message){
		Message obj = service.save(message);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
}
