package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    private final BookedItemsRepo bookedItemsRepo;
    private final BookingRepo bookingRepo;
    private final CameraRepo cameraRepo;
    private final LightRepo lightRepo;
    private final SoundRepo soundRepo;
    private final UserRepo userRepo;

    @Autowired
    public AdminController(BookedItemsRepo bookedItemsRepo, BookingRepo bookingRepo, CameraRepo cameraRepo, LightRepo lightRepo, SoundRepo soundRepo, UserRepo userRepo) {
        this.bookedItemsRepo = bookedItemsRepo;
        this.bookingRepo = bookingRepo;
        this.cameraRepo = cameraRepo;
        this.lightRepo = lightRepo;
        this.soundRepo = soundRepo;
        this.userRepo = userRepo;
    }

    // BOOKED ITEMS
    @GetMapping( value = "/bookings")
        public List<BookedItems> getAllBookedItems(){
        return bookedItemsRepo.findAll();
    }

    @PostMapping(value ="/saveBookedItems")
    public String saveBookedItems(@RequestBody BookedItems bookedItems){
        bookedItemsRepo.save(bookedItems);
        return "Booked Items has been saved...";
    }

    @PutMapping(value = "/updateBookedItems/{id}")
    public String updateBookedItems(@PathVariable ("id") long id, @RequestBody BookedItems bookedItems){
        BookedItems updatedBookedItems = bookedItemsRepo.findById(bookedItems.getId());
        updatedBookedItems.setUser(bookedItems.getUser());
        updatedBookedItems.setCamera(bookedItems.getCamera());
        updatedBookedItems.setLight(bookedItems.getLight());
        updatedBookedItems.setSound(bookedItems.getSound());

        return "Booked item has been updated by id" + id;
    }

    @DeleteMapping(value = "/deleteBookedItems/{id}")
    public String deleteBookedItem(@PathVariable ("id")long id,@RequestBody BookedItems bookedItems){
        BookedItems deletedBookedItem = bookedItemsRepo.deleteBookedItemsById(bookedItems.getId());

        return "Booked item has been deleted by id" + id;


    }
}
