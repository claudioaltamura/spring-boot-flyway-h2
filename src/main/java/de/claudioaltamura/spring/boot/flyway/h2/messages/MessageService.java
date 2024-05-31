package de.claudioaltamura.spring.boot.flyway.h2.messages;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {    

    private final MessageRepository messageRepository;

    @Transactional
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }
}
