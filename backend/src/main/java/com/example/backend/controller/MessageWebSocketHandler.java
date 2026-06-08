package com.example.backend.controller;

import com.example.backend.service.MessageBroadcastService;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class MessageWebSocketHandler extends TextWebSocketHandler {

    private final MessageBroadcastService messageBroadcastService;

    public MessageWebSocketHandler(MessageBroadcastService messageBroadcastService) {
        this.messageBroadcastService = messageBroadcastService;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        messageBroadcastService.register(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        messageBroadcastService.broadcast("Backend received: " + message.getPayload());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        messageBroadcastService.unregister(session);
    }
}
