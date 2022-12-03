package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.*;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Camera> printAllCameras(){
        return cameraRepo.findAll();
    }
    @GetMapping(value = "/allMaterial")
    public List<Light> printAllLights(){
        return lightRepo.findAll();
    }
    @GetMapping(value = "/allMaterial")
    public List<Sound> printAllSound(){
        return soundRepo.findAll();
    }

    @GetMapping(value = "/allBookedItems")
    public List<BookedItems> printAllBookedItems(){
        return bookedItemsRepo.findAll();
    }

}
