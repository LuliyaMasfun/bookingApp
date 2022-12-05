package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.models.User;
import com.group8.bookingapp.repository.BookingRepo;
import com.group8.bookingapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BookingRepo bookingRepo;

    @GetMapping(value = "/allUser")
    public List<User> printAllUser(){
       return userRepo.findAllUsers();
    }

    @PostMapping(value = "/save/user")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "User is created";

    }

    @PostMapping(value = "/saveMaterial")
    public String saveBooking(@RequestBody Booking booking) {
        // Save material

        bookingRepo.save(booking);
        return "Booking is saved";

    }



}
