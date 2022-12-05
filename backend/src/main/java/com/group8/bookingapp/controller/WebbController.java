package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.*;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class WebbController {
    @Autowired
    private CameraRepo cameraRepo;
    @Autowired
    private LightRepo lightRepo;
    @Autowired
    private SoundRepo soundRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;

    @GetMapping(value = "/allMaterial")
    public ResponseEntity<Camera> printAllCameras() {
        try {
            return new ResponseEntity(cameraRepo.findAll(), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/allMaterial")
    public ResponseEntity<Light> printAllLights() {
        try {
            return new ResponseEntity(lightRepo.findAll(), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/allMaterial")
    public ResponseEntity<Sound> printAllSound() {
        try {
            return new ResponseEntity(soundRepo.findAll(), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/allBookedItems")
    public ResponseEntity<BookedItems> printAllBookedItems() {
        try {
            return new ResponseEntity(bookedItemsRepo.findAll(), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

