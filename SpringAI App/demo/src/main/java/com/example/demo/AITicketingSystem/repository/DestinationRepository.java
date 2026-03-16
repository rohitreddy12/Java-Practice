package com.example.demo.AITicketingSystem.repository;

import com.example.demo.AITicketingSystem.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
    Optional<String> findNameByAirportCode(String airportCode);
}
