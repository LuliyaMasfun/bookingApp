package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Camera;
import com.group8.bookingapp.models.*;
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
    private final BookedItemsRepo bookedItemsRepo;
    @Autowired
    private final CameraRepo cameraRepo;
    @Autowired
    private final LightRepo lightRepo;
    @Autowired
    private final SoundRepo soundRepo;


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
        String cameraBrand = bookedItems.getCamera().getBrand();
        String soundBrand = bookedItems.getSound().getBrand();
        String lightBrand = bookedItems.getLight().getBrand();
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
    public AdminController(BookedItemsRepo bookedItemsRepo, CameraRepo cameraRepo, LightRepo lightRepo, SoundRepo soundRepo) {
        this.bookedItemsRepo = bookedItemsRepo;
        this.cameraRepo = cameraRepo;
        this.lightRepo = lightRepo;
        this.soundRepo = soundRepo;

    }

    // BOOKED ITEMS
    @GetMapping( value = "/bookedItems")
        public ResponseEntity<List<BookedItems>> getAllBookedItems(){

        try {
            List<BookedItems> bookedItemsList = new ArrayList<>(bookedItemsRepo.findAll());
            if(!bookedItemsRepo.findAll().isEmpty()){

                return new ResponseEntity<>(bookedItemsList,HttpStatus.OK);
            }

            if (bookedItemsList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bookedItemsList, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PostMapping(value ="/camera")
    public ResponseEntity<Camera> addBookedItems(@RequestBody Camera camera) {
        try {
            Camera savedCamera = cameraRepo.save(new Camera(camera.getModel(), camera.getBrand()));

            return new ResponseEntity<>(savedCamera, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value ="/sound")
    public ResponseEntity<Sound> addSound(@RequestBody Sound sound) {
        try {
            Sound savedSound = soundRepo.save(new Sound(sound.getModel(), sound.getBrand()));

            return new ResponseEntity<>(savedSound, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value ="/light")
    public ResponseEntity<Light> addLight(@RequestBody Light light) {
        try {
            Light savedLight = lightRepo.save(new Light(light.getModel(), light.getBrand()));

            return new ResponseEntity<>(savedLight, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @PutMapping(value = "camera/{id}")
    public ResponseEntity<Camera> updateCamera(@PathVariable long id, @RequestBody Camera cameraDetails){
        Camera updatedCamera = cameraRepo.findById(id).orElseThrow(null);
        updatedCamera.setModel(cameraDetails.getModel());
        updatedCamera.setBrand(cameraDetails.getBrand());

        cameraRepo.save(updatedCamera);

        return new ResponseEntity<>(updatedCamera,HttpStatus.OK);
    }

    @PutMapping(value = "sound/{id}")
    public ResponseEntity<Sound> updateSound(@PathVariable long id, @RequestBody Sound soundDetails){
        Sound updatedSound = soundRepo.findById(id).orElseThrow(null);
        updatedSound.setModel(soundDetails.getModel());
        updatedSound.setBrand(soundDetails.getBrand());

       soundRepo.save(updatedSound);

        return new ResponseEntity<>(updatedSound,HttpStatus.OK);
    }

    @PutMapping(value = "light/{id}")
    public ResponseEntity<Light> updateLight(@PathVariable long id, @RequestBody Light lightDetails){
        Light updatedLight = lightRepo.findById(id).orElseThrow(null);
        updatedLight.setModel(lightDetails.getModel());
        updatedLight.setBrand(lightDetails.getBrand());

        lightRepo.save(updatedLight);

        return new ResponseEntity<>(updatedLight,HttpStatus.OK);
    }

    @DeleteMapping(value = "sound/{id}")
    public ResponseEntity<Long> deleteSound(@PathVariable long id){
        soundRepo.deleteById(id);

        if (soundRepo.findById(id).orElseThrow(null) ==null){
            return new ResponseEntity<>(id,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(id,HttpStatus.OK);
    }

    @DeleteMapping(value = "camera/{id}")
    public ResponseEntity<Long> deleteCamera(@PathVariable long id){
         cameraRepo.deleteById(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }



    @DeleteMapping(value = "light/{id}")
    public ResponseEntity<Long> deleteLight(@PathVariable long id){
        lightRepo.deleteById(id);
        return new ResponseEntity<>(id,HttpStatus.OK);

    }

}
