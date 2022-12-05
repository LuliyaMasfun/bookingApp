package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.models.User;
import com.group8.bookingapp.repository.BookingRepo;
import com.group8.bookingapp.repository.UserRepo;
import com.group8.bookingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BookingRepo bookingRepo;

    private final UserService userService;


   @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/allUser")
    public List<User> printAllUser(){
       return userRepo.findAll();
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

   @PutMapping (value = "/updateUser/{userId}")
    public void updateUser(
            @PathVariable ("userId") Long userId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
       userService.updateUser(userId, firstName, lastName);
   }


}
