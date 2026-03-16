package com.example.demo.AITicketingSystem;

import com.example.demo.AITicketingSystem.entity.Ticket;
import com.example.demo.AITicketingSystem.entity.TicketRequest;
import com.example.demo.AITicketingSystem.repository.DestinationRepository;
import com.example.demo.AITicketingSystem.service.AITicketService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AIToolCalls {

    AITicketService ticketService;
    DestinationRepository destRepo;

    AIToolCalls(AITicketService ticketService, DestinationRepository destRepo){
        this.ticketService = ticketService;
        this.destRepo = destRepo;
    }

    @Tool(description = "create a new ticket with the details provided")
    public void createTicket(TicketRequest ticket){
        ticketService.createTicket(ticket);
    }

    @Tool(description = "get Departure and Arrival Airport codes from the name provided")
    public void getAirportCode(String destName){
        destRepo.findNameByAirportCode(destName);
    }

    @Tool(description = "Cancel or delete a user's ticket by their name")
    public void cancelTicketByUserName(String userName){
        ticketService.cancelTicketByUsername(userName);
    }

    @Tool(description = "Fetch the tickets booked for a user by the name provided")
    public List<Ticket> getTickets(String userName){
        return ticketService.getTicketByUserName(userName);
    }
}
