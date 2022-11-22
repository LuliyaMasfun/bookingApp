package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository <User, Integer> {
    public List<User> findByName (String userName);
}
