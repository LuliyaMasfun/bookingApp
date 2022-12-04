package com.group8.bookingapp.configs;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Booking;
import com.group8.bookingapp.repository.BookingRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookingConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            BookingRepo bookingRepo){
        return args ->{

            Booking booking1 = new Booking(
                    "2023-02-01",
                    "2023-02-03",
                    new BookedItems()
            );

            //bookingRepo.save(booking1);
        };
    }
}
