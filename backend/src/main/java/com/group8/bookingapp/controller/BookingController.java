package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.*;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Booking;

import com.group8.bookingapp.repository.*;
import com.group8.bookingapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;


@RestController
public class BookingController {

    
    @Autowired
    private CameraRepo cameraRepo;
    @Autowired
    private SoundRepo soundRepo;
    @Autowired
    private LightRepo lightRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;
    @Autowired
    private BookingRepo bookingRepo;

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }



    
 
    @GetMapping(value = "/allBookings")
    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
    }

    //booked items
    // Funktioner för bookingController
    //1. Reservera objekt med hjälp av id eller namn
    @PostMapping(value = "/add/booking")
    public String addBooking(@RequestBody Booking booking){
        bookingService.addNewBooking( booking);
        return "Booking is saved";
    }

    //2. Ta bort reservation
   @DeleteMapping("/delete/booking/{bookingId}")
    public String deleteBooking(
            @PathVariable("bookingId") Long bookingId) {
        bookingService.deleteBooking(bookingId);
        return "Booking deleted";
    }

    //3. Ändra reservation
    
    @Autowired
    private CameraRepo cameraRepo;
    @Autowired
    private SoundRepo soundRepo;
    @Autowired
    private LightRepo lightRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;
    @Autowired
    private BookingRepo bookingRepo;




    @PostMapping
    public String addBooking(@RequestBody BookedItems bookedItems){
        Camera camera = cameraRepo.findById(bookedItems.getCamera().getId()).orElseThrow(null);
        Light light = lightRepo.findById(bookedItems.getLight().getId()).orElseThrow(null);
        Sound sound = soundRepo.findById(bookedItems.getSound().getId()).orElseThrow(null);

        bookedItems.setCamera(camera);
        bookedItems.setLight(light);
        bookedItems.setSound(sound);


        bookedItems.setDateStart(LocalDate.now());
        bookedItems.setDateEnd(LocalDate.now().plusDays(bookedItems.getHowManyDaysToRent()));

        bookedItemsRepo.save(bookedItems);
        return "Item saved";
    }


}
