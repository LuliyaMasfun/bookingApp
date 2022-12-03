package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AdminController {

    @Autowired
    private CameraRepo cameraRepo;


    @GetMapping(value = "/allCamera")
    public List<Camera> getAllCameras(){
        return cameraRepo.findAll();
    }

    @PostMapping(value = "/add/Camera")
    public String addCamera(@RequestBody Camera camera){
        cameraRepo.save(camera);
        return "Camera is saved";
    }

}
