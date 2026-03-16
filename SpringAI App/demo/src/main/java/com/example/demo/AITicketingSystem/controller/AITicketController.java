package com.example.demo.AITicketingSystem.controller;

import com.example.demo.AITicketingSystem.entity.CancelTicketRequest;
import com.example.demo.AITicketingSystem.entity.Ticket;
import com.example.demo.AITicketingSystem.entity.TicketRequest;
import com.example.demo.AITicketingSystem.service.AITicketService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

interface TicketOperations {
    public void createTicket(TicketRequest ticketRequest);
    public void updateTicket(Ticket body);
    public void cancelTicketByUsername(CancelTicketRequest body);
    public List<Ticket> getTicketByUserName(@RequestBody CancelTicketRequest body);

}

@RestController
public class AITicketController implements  TicketOperations{
    AITicketService ticketService;

    AITicketController(AITicketService ticketService){
        this.ticketService = ticketService;
    }

    @Override
    @PostMapping("/ticket")
    public void createTicket(@RequestBody TicketRequest ticketRequest) {
        ticketService.createTicket(ticketRequest);
    }

    @Override
    @PutMapping("/ticket")
    public void updateTicket(@RequestBody Ticket body ) {
//        ticketService.updateTicket(body);
    }

    @Override
    @DeleteMapping("/ticket")
    public void cancelTicketByUsername(@RequestBody CancelTicketRequest body) {
    ticketService.cancelTicketByUsername(body.getUserName());
    }

    @Override
    @PostMapping("/getTickets")
    public List<Ticket> getTicketByUserName(@RequestBody CancelTicketRequest body) {
        return ticketService.getTicketByUserName(body.getUserName());
    }
}
