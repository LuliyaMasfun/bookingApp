package com.group8.bookingapp.service;

import com.group8.bookingapp.models.User;
import com.group8.bookingapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class UserService {
    private final UserRepo userRepo;



    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public void updateUser (Long userId, String firstName, String lastName){
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new IllegalStateException(
                        "User does not exists" + userId
                ));
        if (firstName != null &&
        firstName.length() > 0 &&
        !Objects.equals(user.getFirstName(), firstName)) {
            user.setFirstName(firstName);
        }

        if (lastName != null &&
                lastName.length() > 0 &&
                !Objects.equals(user.getLastName(), lastName)) {
            user.setLastName(lastName);
        }

    }

}
