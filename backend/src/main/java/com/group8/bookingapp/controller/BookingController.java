package com.group8.bookingapp.controller;
import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookingController {

    private final BookingRepo bookingRepo;

    @Autowired
    public BookingController( BookingRepo bookingRepo){
        this.bookingRepo= bookingRepo;
    }

    @Autowired
    private CameraRepo cameraRepo;
    @Autowired
    private SoundRepo soundRepo;
    @Autowired
    private LightRepo lightRepo;
    @Autowired
    private BookedItemsRepo bookedItemsRepo;




    @GetMapping(value = "/allCamera")
    public List<Camera> getAllCameras(){
        return cameraRepo.findAll();

    }

}
