package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {

    @Query("SELECT a FROM User a WHERE a.lastName = ?1")
    Boolean findUserByName(String lastname);
}
