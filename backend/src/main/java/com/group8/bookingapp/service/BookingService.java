package com.group8.bookingapp.service;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.repository.BookedItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookedItemsRepo bookedItemsRepo;

    @Autowired
    public BookingService(BookedItemsRepo bookedItemsRepo) {
        this.bookedItemsRepo = bookedItemsRepo;
    }

    public void deleteBooking(Long bookingId){
        boolean exists = bookedItemsRepo.existsById(bookingId);

        if (!exists){
            throw new IllegalStateException("There's no booking with id " + bookingId);
        }{
            bookedItemsRepo.deleteById(bookingId);
        }

    }


    public List<BookedItems> getBookings(){
        return bookedItemsRepo.findAll();
    };


}
