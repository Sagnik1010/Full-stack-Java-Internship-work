package com.taskmanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    public void registerStompEndpoints(StompEndpointRegistry reg){
        reg.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
    }

    public void configureMessageBroker(MessageBrokerRegistry reg){
        reg.enableSimpleBroker("/topic");
        reg.setApplicationDestinationPrefixes("/app");
    }
}
