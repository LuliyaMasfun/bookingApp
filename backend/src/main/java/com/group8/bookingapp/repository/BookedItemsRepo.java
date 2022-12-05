package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookedItemsRepo extends JpaRepository<BookedItems, Long> {


     //public List<BookedItems>findById(long id);

     BookedItems findById(long id);
     BookedItems deleteBookedItemsById(long id);

}
