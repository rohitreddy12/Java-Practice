package com.example.demo.AITicketingSystem.service;

import com.example.demo.AITicketingSystem.entity.Ticket;
import com.example.demo.AITicketingSystem.entity.TicketRequest;
import com.example.demo.AITicketingSystem.entity.User;
import com.example.demo.AITicketingSystem.repository.TicketRepository;
import com.example.demo.AITicketingSystem.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AITicketService{

    TicketRepository ticketRepo;
    UserRepository userRepo;

    public AITicketService(TicketRepository ticketRepo, UserRepository userRepo) {
        this.ticketRepo = ticketRepo;
        this.userRepo = userRepo;
    }

    public void createTicket(TicketRequest ticketRequest) {
        ticketRequest.toString();
        String userName = ticketRequest.getUserName();
        try{
            //finding if user exists or creating one
            User user =  userRepo.findByName(userName).orElseGet(() -> {
                User newUser = new User();
                newUser.setName(userName);
                return userRepo.save(newUser);
            });
            //creating a new ticket from the request
            Ticket newTicket = new Ticket();
            newTicket.setDestinationCode(ticketRequest.getDestinationCode());
            newTicket.setArrivalCode(ticketRequest.getArrivalCode());
            newTicket.setSeat(ticketRequest.getSeat());
            newTicket.setFlightNo(ticketRequest.getFlightNo());
            newTicket.setUser(user);
            Ticket savedTicket = ticketRepo.save(newTicket);
            System.out.println("Ticket saved " + savedTicket.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public String updateTicket(String updateKey,String updateValue) {
//        int id = body.getTicketId();
//        Optional<Ticket> ticketFound = ticketRepo.findById(id);
//        if(ticketFound.isEmpty()){
//            return "There's no ticket with the provided Id";
//        }
//        ticketRepo.save(body);
//        return "Ticket has been updated for id:" + id;
//    }

    @Transactional
    public String cancelTicketByUsername(String userName) {
        try{
            System.out.println("Entered service try with userName: " + userName);
            Optional<User> user =  userRepo.findByName(userName);// method not working
            System.out.println("found user " + user);
            if(user.isPresent()){
                System.out.println("Entered if");
                ticketRepo.deleteByUserUserId(user.get().getUserId());
                System.out.println("Deleted Successfully");
                return "Ticket deleted successfully";
            }
            else{
                return "No tickets exist for the user to delete";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Ticket> getTicketByUserName(String userName) {
        Optional<User> user = userRepo.findByName(userName);
        if(user.isPresent()){
            List<Ticket> tickets = ticketRepo.findTicketsByUser(user.get());
            return tickets;
        }
        return null;
    }
}
