package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.Camera;
import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CameraRepo extends JpaRepository <Camera, Long> {

    Camera findById(long id);

}
