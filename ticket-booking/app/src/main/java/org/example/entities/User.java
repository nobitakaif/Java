package org.example.entities;

import java.util.List;

public class User{
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> tickedBooked;
    private String userId;
    
    public User(String newName, String newPassword, String newHashedPasswrod, List<Ticket> newTicketBooked, String newUserId){ // userInfo constructor 
        this.name = newName;
        this.password = newPassword;
        this.hashedPassword = newHashedPasswrod;
        this.tickedBooked = newTicketBooked;
        this.userId = newUserId;
    }

    public User(){} // default constructor
    
    public String getName(){
        return this.name;
    }

    public String getPassword (){
        return this.password;
    }
    public String getHashedPassword (){
        return this.hashedPassword;
    }

    public List<Ticket> getTicket (){
        return this.tickedBooked;
    }

    public void printTicket(){
        for(int i =0;i<this.tickedBooked.size();i++){
            System.out.println(tickedBooked.get(i).getTicketInfo());
        }
    }

    public void setName (String newName){
        this.name = newName;
    }

    public void serHashedPassword (String newHashedPassword){
        this.hashedPassword = newHashedPassword;
    }
    
    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.tickedBooked = ticketsBooked;
    }

    public void setUserI(String newUserId){
        this.userId = newUserId;
    }
}