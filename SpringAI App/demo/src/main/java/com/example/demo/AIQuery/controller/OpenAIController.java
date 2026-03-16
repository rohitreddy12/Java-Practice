package com.example.demo.AIQuery.controller;

import com.example.demo.AIQuery.ExceptionHandling.QueryNotFoundException;
import com.example.demo.AIQuery.service.OpenAIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;

@RestController
public class OpenAIController {

    OpenAIService openAIService;

    OpenAIController(OpenAIService openAIService){
        this.openAIService = openAIService;
    }

    @GetMapping("/chat")
    public ResponseEntity<?> response(@RequestParam(required = false) String query){
        System.out.println( "Query:" +query);
        if(query == null || query.isEmpty()){
            System.out.println("Empty");
            throw new QueryNotFoundException();
        }
        String response = openAIService.chatResponse(query);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}

