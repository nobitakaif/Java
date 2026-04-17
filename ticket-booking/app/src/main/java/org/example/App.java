package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import org.example.Utils.UserServiceUtils;
import org.example.entities.User;
import org.example.services.UserBookingSevices;

public class App {
    public static void main(String[] args) {
        System.out.println("Running Train Booking System ");
        Scanner input = new Scanner(System.in);

        int option = 0;

        UserBookingSevices userBookingSevices;
        try{
            userBookingSevices = new UserBookingSevices();
        }catch(IOException ex){
            System.out.println("something went wrong, user does not loaded!");
            return;
        }

        while (option != 7) {
            System.out.println("Choose option");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Booking");
            System.out.println("4. Search Train");
            System.out.println("5. Book a seat");
            System.out.println("6. Cancel my Booking");
            System.out.println("7. Exit the App");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the username to signup : ");
                    String username = input.next();
                    System.out.println("Enter your password");
                    String password = input.next();
                    User newUser = new User(username, password, UserServiceUtils.hashPassword(password), new ArrayList<>(), UUID.randomUUID().toString());
                    userBookingSevices.signUp(newUser);
                    break;
                case 2:
                    System.out.println("Enter username for login :");
                    String loginUsername = input.next();
                    System.out.println("Enter your password : ");
                    String loginPassword = input.next();
                    User loginUser = new User(loginUsername, loginPassword, UserServiceUtils.hashPassword(loginPassword),new ArrayList<>(), UUID.randomUUID().toString());
                    try{
                        userBookingSevices = new UserBookingSevices(loginUser);
                    }catch(IOException ex){
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Fetching your booking");    
                    userBookingSevices.fetchBooking();
                    break;
                default:
                    break;
            }
        }
    }
}
