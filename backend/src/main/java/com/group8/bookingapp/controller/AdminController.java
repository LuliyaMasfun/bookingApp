package com.group8.bookingapp.controller;

import com.group8.bookingapp.models.*;
import com.group8.bookingapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {


    private final BookingRepo bookingRepo;
    private final CameraRepo cameraRepo;
    private final LightRepo lightRepo;
    private final SoundRepo soundRepo;

    @Autowired
    public AdminController(BookingRepo bookingRepo, CameraRepo cameraRepo, LightRepo lightRepo, SoundRepo soundRepo) {
        this.bookingRepo = bookingRepo;
        this.cameraRepo = cameraRepo;
        this.lightRepo = lightRepo;
        this.soundRepo = soundRepo;

    }

    ;

        }

    }

 /*   @GetMapping(value = "bookings/{id}")
    public ResponseEntity<Booking> getById(@PathVariable long id){

         Booking newBooking = bookingRepo.findById(id);
        return booking.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR));
    }
*/

    @PostMapping(value ="/camera")
    public ResponseEntity<Camera> saveBookedItems(@RequestBody Camera camera) {
        try {
            Camera savedCamera = cameraRepo.save(new Camera(camera.getModel(), camera.getMaker()));

            return new ResponseEntity<>(savedCamera, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value ="/sound")
    public ResponseEntity<Sound> saveSound(@RequestBody Sound sound) {
        try {
            Sound savedSound = soundRepo.save(new Sound(sound.getModel(), sound.getMaker()));

            return new ResponseEntity<>(savedSound, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value ="/light")
    public ResponseEntity<Light> saveSound(@RequestBody Light light) {
        try {
            Light savedLight = lightRepo.save(new Light(light.getModel(), light.getMaker()));

            return new ResponseEntity<>(savedLight, HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @PutMapping(value = "camera/{id}")
    public ResponseEntity<Camera> updateCamera(@PathVariable long id, @RequestBody Camera cameraDetails){
        Camera updatedCamera = cameraRepo.findById(id);
        updatedCamera.setModel(cameraDetails.getModel());
        updatedCamera.setMaker(cameraDetails.getMaker());

        cameraRepo.save(updatedCamera);

        return new ResponseEntity<>(updatedCamera,HttpStatus.OK);
    }

    @PutMapping(value = "sound/{id}")
    public ResponseEntity<Sound> updateSound(@PathVariable long id, @RequestBody Sound soundDetails){
        Sound updatedSound = soundRepo.findById(id);
        updatedSound.setModel(soundDetails.getModel());
        updatedSound.setMaker(soundDetails.getMaker());

       soundRepo.save(updatedSound);

        return new ResponseEntity<>(updatedSound,HttpStatus.OK);
    }

    @PutMapping(value = "light/{id}")
    public ResponseEntity<Light> updateLight(@PathVariable long id, @RequestBody Light lightDetails){
        Light updatedLight = lightRepo.findById(id);
        updatedLight.setModel(lightDetails.getModel());
        updatedLight.setMaker(lightDetails.getMaker());

        lightRepo.save(updatedLight);

        return new ResponseEntity<>(updatedLight,HttpStatus.OK);
    }

    @DeleteMapping(value = "sound/{id}")
    public ResponseEntity<Long> deleteSound(@PathVariable long id){
        soundRepo.deleteById(id);

        if (soundRepo.findById(id) == null){
            return new ResponseEntity<>(id,HttpStatus.OK);
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
