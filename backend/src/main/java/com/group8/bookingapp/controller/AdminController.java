package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        public ResponseEntity<List<Booking>> getAllBookedItems(){

        try {
            if(!bookingRepo.findAll().isEmpty()){
                return new ResponseEntity<>(bookingRepo.findAll(), HttpStatus.OK);
            }
            List<Booking> bookingList = new ArrayList<>();
            bookingList.addAll(bookingRepo.findAll());

           /* if (bookedItems == null) {
                bookingList.addAll(bookingRepo.findAll());
            } else {
                bookingList.addAll(bookingRepo.findAll());
            }*/

            if (bookingList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bookingList, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @GetMapping(value = "bookings/{id}")
    public ResponseEntity<Booking> getById(@PathVariable long id){

         Optional <Booking> booking = bookingRepo.findById(id);
         if(booking.isPresent()) {
             return new ResponseEntity<>(booking.get(), HttpStatus.OK);
         } else {
             return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }

    @PostMapping(value ="/saveBookedItems")
    public ResponseEntity<BookedItems> saveBookedItems(@RequestBody BookedItems newItem) {
        try {
            BookedItems bookedItems = bookedItemsRepo.save(new BookedItems(newItem.getUser(), newItem.getCamera(), newItem.getSound(), newItem.getLight()));

            return new ResponseEntity<>(bookedItems, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping(value = "/updateBookedItems/{id}")
    public String updateBookedItems(@PathVariable long id, @RequestBody BookedItems bookedItems){
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
