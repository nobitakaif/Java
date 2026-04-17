package org.example.services;

import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.Utils.UserServiceUtils;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;



public class UserBookingSevices {

    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper = new ObjectMapper();
    
    
    private static final String USER_PATH = "../localdb/db.json";
    
    
    public UserBookingSevices(User newUser) throws IOException{
        this.user = newUser;
        loadUser();
    }   

    public UserBookingSevices()throws IOException{
        loadUser();
    }

    public List<User> loadUser ()throws IOException{
        File filePath = new File(USER_PATH);
        return userList = objectMapper.readValue(filePath, new TypeReference<List<User>>() { });
    }
    
    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(u -> {
            return u.getName().equals(user.getName()) && UserServiceUtils.checkPassword(user.getPassword(), u.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User u){
        try{
            userList.add(u);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch(Exception e){
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile()throws IOException{
        File userFile = new File(USER_PATH);
        objectMapper.writeValue(userFile, userList);
    }

    public void fetchBooking(){
        user.printTicket();
    }


    
    
}
