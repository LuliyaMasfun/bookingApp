package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository <User, Long> {

    @Query("SELECT a FROM User a WHERE a.firstName = ?1")
    String findUserByName(String lastname);

    @Query(value = "SELECT a.id, a.first_name, a.last_name, c.camera_brand, d.sound_brand, e.light_brand"
            + "FROM User AS a"
            +    "LEFT OUTER JOIN booked_items AS b ON a.id =b.user_id"
            +         "LEFT OUTER JOIN camera AS c ON b.camera_id=c.id"
            +            "LEFT OUTER JOIN sound AS d ON b.sound_id=d.id"
            +              "LEFT OUTER JOIN light AS e ON b.light_id=e.id" +
            "ORDER BY a.id ASC",
            nativeQuery = true)
            List<User> findAllUsers();
}
