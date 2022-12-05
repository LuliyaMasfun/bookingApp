package com.group8.bookingapp.service;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.models.User;
import com.group8.bookingapp.repository.BookedItemsRepo;
import com.group8.bookingapp.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  /*  public void findUserBooking(Long userId, BookedItems bookedItems){

            bookedItemsRepo.findById(userId);

    }*/

    public List<BookedItems> getBookings(){
        return bookedItemsRepo.findAll();
    };


}
