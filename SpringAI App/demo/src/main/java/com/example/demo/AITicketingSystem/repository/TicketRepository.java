package com.example.demo.AITicketingSystem.repository;

import com.example.demo.AITicketingSystem.entity.Ticket;
import com.example.demo.AITicketingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    void deleteByUserUserId(long userId);

    List<Ticket> findTicketsByUser(User user);
}

