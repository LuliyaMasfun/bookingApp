package com.group8.bookingapp.controller;
import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.repository.*;
import com.group8.bookingapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookingController {

    @Autowired
    private BookingRepo bookingRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // testar databasen hämtar alla bookings
    @GetMapping(value = "/allBookings")
    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
    }

    //booked items
    @PostMapping(value = "/add/bookeditems")
    public String addBooking(@RequestBody BookedItems bookedItems){
        bookedItemsRepo.save(bookedItems);
        return "Item saved";
    }

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


}
