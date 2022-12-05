package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.Light;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightRepo extends JpaRepository <Light, Long> {

    Light findById(long id);

}
