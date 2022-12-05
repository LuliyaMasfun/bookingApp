package com.group8.bookingapp.service;

import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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

    public void findUserBooking(Long userId){
        bookingRepo.findById(userId);
    }

    public List<Booking> getBookings(){
        return bookingRepo.findAll();
    };

    public void addNewBooking( Booking booking){
        bookingRepo.save(booking);
    }

}
