package com.example.demo.AITicketingSystem.entity;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
public class Destination    {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long  code;

    @NotNull
    private String name;

    @NotNull
    private String airportCode;
}
