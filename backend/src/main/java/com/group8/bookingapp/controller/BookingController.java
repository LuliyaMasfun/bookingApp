package com.group8.bookingapp.controller;
import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.models.Light;
import com.group8.bookingapp.models.Sound;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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

    // Funktioner för bookingController
    //1. Reserva objekt med hjälp av id eller namn
    //2. Ta bort reservation
    //3. Ändra reservation


}
