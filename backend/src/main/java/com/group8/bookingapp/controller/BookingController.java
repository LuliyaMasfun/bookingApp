package com.group8.bookingapp.controller;
import com.group8.bookingapp.models.*;
import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.repository.*;
import com.group8.bookingapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
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
    @Autowired
    private UserRepo userRepo;

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping(value = "/allBookings")
    public List<BookedItems> getAllBookings(){
        return bookingService.getBookings();
    }




   @DeleteMapping("/delete/booking/{bookingId}")
    public String deleteBooking(@PathVariable("bookingId") Long bookingId) {
        bookingService.deleteBooking(bookingId);
        return "Booking deleted";
    }



    @PostMapping
    public String addBooking(@RequestBody BookedItems bookedItems){
        Camera camera = cameraRepo.findById(bookedItems.getCamera().getId()).orElseThrow(null);
        Light light = lightRepo.findById(bookedItems.getLight().getId()).orElseThrow(null);
        Sound sound = soundRepo.findById(bookedItems.getSound().getId()).orElseThrow(null);

        bookedItems.setCamera(camera);
        bookedItems.setLight(light);
        bookedItems.setSound(sound);

        bookedItems.setDateStart(LocalDate.now());
        int bookedDays = bookedItems.getHowManyDaysToRent();
        if (bookedDays > 3) {
        bookedItems.setHowManyDaysToRent(3);
        }
            bookedItems.setDateEnd(LocalDate.now().plusDays(bookedItems.getHowManyDaysToRent()));

        bookedItemsRepo.save(bookedItems);
        return "Item saved";
    }



}
