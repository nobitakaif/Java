package org.example.entities;

import java.util.*;

public class Ticket{

    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private String dateofTravel;
    private Train train;

    public Ticket(){} // empty Ticket 

    public Ticket(String newTicketId, String newUserId, String newSource, String newDestination, String newDateOfTravel, Train newTrain){
        this.ticketId = newTicketId;
        this.userId = newUserId;
        this.source = newSource;
        this.destination = newDestination;
        this.dateofTravel = newDateOfTravel;
        this.train = newTrain;
    }

    public String getTicketInfo(){
        return String.format("Ticket Id %s belongs to User %s from %s to %s on %s", this.ticketId, this.userId, this.source, this.destination, this.dateofTravel);
    }

    public String getTicketId (){
        return this.ticketId;
    }

    public void setTicketId(String newTicketId){
        this.ticketId = newTicketId;
    }
    
    public String getSource(){
        return this.source;
    }

    public void setSource(String newSource){
        this.source = newSource;
    }

    public String getUser(){
        return this.userId;
    }

    public void setUserId(String newUserId){
        this.userId = newUserId;
    }

    public void setDestination (String newDestination){
        this.destination = newDestination;
    }

    public String getDestination (){
        return this.destination;
    }

    public void setDateOfTravel(String newDateOfTravel){
        this.dateofTravel = newDateOfTravel;
    }
    
    public String getDateOfTravel(){
        return this.dateofTravel;
    }

    public void setTrain(Train newTrain){
        this.train = newTrain;
    }

    public Train getTrain(){
        return this.train;
    }

}