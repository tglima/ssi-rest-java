package edu.tglima.ssirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.tglima.ssirest.models.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {}
