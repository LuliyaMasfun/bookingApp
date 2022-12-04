package com.group8.bookingapp.controller;
import com.group8.bookingapp.models.*;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
