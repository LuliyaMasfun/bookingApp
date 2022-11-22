package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MaterialRepo extends JpaRepository<Material, Integer> {
    public List<Material> findByName(String materialName);

}
