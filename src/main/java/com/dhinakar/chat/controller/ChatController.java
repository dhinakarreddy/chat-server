package com.dhinakar.chat.controller;

import com.dhinakar.chat.domain.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ChatController {

    ObjectMapper mapper = new ObjectMapper();

    @MessageMapping("/message")
    @SendTo("/chat/messages")
    @CrossOrigin
    public Message getMessages(@RequestBody String chatMsg) throws IOException {
        Message userMsg = mapper.readValue(chatMsg, Message.class);
        return userMsg;
    }

}
