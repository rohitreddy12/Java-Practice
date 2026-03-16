package com.example.demo.AIQuery.service;

import com.example.demo.AITicketingSystem.AIToolCalls;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService {
    ChatClient chatClient;
    AIToolCalls toolCalls;
    OpenAIService(ChatClient.Builder chatClientBuilder,AIToolCalls toolCalls){
        this.chatClient = chatClientBuilder.defaultSystem("You are a helpful assistant for a flight ticket booking application,helping users resolve their issues with tickets.If any details that are required are missing in the query,ask the user to provide them.").build();
        this.toolCalls = toolCalls;
    }

    public String chatResponse(String query){
        String response = chatClient.prompt().tools(toolCalls).user(query).call().content();
        return response;
    }
}
