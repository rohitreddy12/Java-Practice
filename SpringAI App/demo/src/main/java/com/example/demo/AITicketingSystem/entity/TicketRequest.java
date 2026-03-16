package com.example.demo.AITicketingSystem.entity;

import org.springframework.stereotype.Component;

@Component
public class TicketRequest {
    private String destinationCode;
    private String arrivalCode;
    private String flightNo;
    private String seat;
    private String userName;

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TicketRequest{" +
                "destinationCode='" + destinationCode + '\'' +
                ", arrivalCode='" + arrivalCode + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", seat='" + seat + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
