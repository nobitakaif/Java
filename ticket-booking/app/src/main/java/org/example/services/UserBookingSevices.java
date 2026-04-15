package org.example.services;

import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.Utils.UserServiceUtils;
import org.example.entities.Train;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.*;

public class UserBookingSevices {

    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper = new ObjectMapper();
    
    
    private static final String USER_PATH = "../localdb/db.json";
    
    
    public UserBookingSevices(User newUser) throws IOException{
        this.user = newUser;
        File filePath = new File(USER_PATH);
        userList = objectMapper.readValue(filePath, new TypeReference<List<User>>() {});
    }   

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(u -> {
            return u.getName().equals(user.getName()) && UserServiceUtils.checkPassword(user.getPassword(), u.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }
    
}
