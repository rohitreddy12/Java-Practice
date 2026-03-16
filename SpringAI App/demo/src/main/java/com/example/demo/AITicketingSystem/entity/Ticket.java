package com.example.demo.AITicketingSystem.entity;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;


@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ticketId;

    private String destinationCode;

    private String arrivalCode;

    private String flightNo;

    private String seat;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    public int getTicketId() {
        return ticketId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public String getSeat() {
        return seat;
    }

    public User getUser() {
        return user;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", destinationCode=" + destinationCode +
                ", arrivalCode=" + arrivalCode +
                ", flightNo='" + flightNo + '\'' +
                ", seat='" + seat + '\'' +
                ", user=" + user +
                '}';
    }
}
