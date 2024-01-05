package com.ewangclarks.carbookdriver.controller;


import com.ewangclarks.carbookdriver.service.PublishMessage;
import com.sharedlibrary.sharedkafkadto.dto.CustomMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PublishMessageController {

    private final PublishMessage publishMessage;

    @PostMapping("/api/message/publish")
    public ResponseEntity<String> publishMessage(@RequestBody CustomMessage message) {
        publishMessage.sendMessage(message);
        return ResponseEntity.ok("Message published to kafka successfully");
    }
}
