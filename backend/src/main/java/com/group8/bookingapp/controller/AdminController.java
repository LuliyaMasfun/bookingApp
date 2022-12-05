package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class AdminController {

    @Autowired
    private CameraRepo cameraRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;


    @GetMapping(value = "/allCamera")
    public List<Camera> getAllCameras() {
        return cameraRepo.findAll();
    }

    @PostMapping(value = "/add/Camera")
    public String addCamera(@RequestBody Camera camera) {
        cameraRepo.save(camera);
        return "Camera is saved";
    }

    @GetMapping(value = "/findAllBookedItems")
    public ResponseEntity<List<BookedItems>> findAllBookedItems() {
        List<BookedItems> allItems = bookedItemsRepo.findAllBookedItems();
        return new ResponseEntity<>(allItems, HttpStatus.OK);
    }

    @GetMapping(value = "/findSpecificBookedItem")
    public List<Object> findSpecificBookedItem(@RequestBody Long id) {
        BookedItems bookedItems = bookedItemsRepo.findById(id).orElseThrow(null);

        String firstName = bookedItems.getUser().getFirstName();
        String lastName = bookedItems.getUser().getFirstName();
        String cameraBrand = bookedItems.getCamera().getCamera_brand();
        String soundBrand = bookedItems.getSound().getSound_brand();
        String lightBrand = bookedItems.getLight().getLight_brand();
        int dateStart = bookedItems.getDateStart().getDayOfYear();
        int dateEnd = bookedItems.getDateEnd().getDayOfYear();
        int bookedDays = bookedItems.getHowManyDaysToRent();

        List<Object> specificBooking = new ArrayList<>();
        specificBooking.add(firstName);
        specificBooking.add(lastName);
        specificBooking.add(cameraBrand);
        specificBooking.add(soundBrand);
        specificBooking.add(lightBrand);
        specificBooking.add(dateStart);
        specificBooking.add(dateEnd);
        specificBooking.add(bookedDays);

        return specificBooking;
    }

}
