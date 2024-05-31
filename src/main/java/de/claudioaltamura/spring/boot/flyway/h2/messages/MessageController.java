package de.claudioaltamura.spring.boot.flyway.h2.messages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final MessageService messageService;
    
    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getMessage() {
        log.info("messages requested");
        return ResponseEntity.ok(messageService.getMessages());
    }
}
