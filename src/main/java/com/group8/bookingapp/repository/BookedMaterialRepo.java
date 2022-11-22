package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.BookedMaterial;
import com.group8.bookingapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BookedMaterialRepo extends JpaRepository<BookedMaterial, Integer> {
    public List<BookedMaterial> findByUser(User user);
}

