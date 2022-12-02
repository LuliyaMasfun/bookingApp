package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CameraRepo extends JpaRepository <Camera, Long> {


    List<Camera> addCamera(Camera camera);
}
