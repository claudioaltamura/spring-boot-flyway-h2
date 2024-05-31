package de.claudioaltamura.spring.boot.flyway.h2.messages;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
} 