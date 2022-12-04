package com.group8.bookingapp.service;

import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepo bookingRepo;

    @Autowired
    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public void deleteBooking(Long bookingId){
        boolean exists = bookingRepo.existsById(bookingId);

        if (!exists){
            throw new IllegalStateException("There's no booking with id " + bookingId);
        }{
            bookingRepo.deleteById(bookingId);
        }

    }

    public void addNewBooking( Booking booking){
        bookingRepo.save(booking);
    }

}
