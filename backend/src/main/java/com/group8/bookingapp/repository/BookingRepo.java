package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo  extends JpaRepository <Booking, Long> {

}
