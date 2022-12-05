package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.BookedItems;
import com.group8.bookingapp.models.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.List;

@Repository
public interface BookedItemsRepo extends JpaRepository<BookedItems, Long> {

    @Query(value = "SELECT a.id, a.date_end, a.date_start,a.how_many_days_to_rent,a.user_id, b.camer_brand,a.camera_id,c.light_brand,a.light_id,d.sound_brand,a.sound_id"
           + "FROM bookedItems AS a"
           +     "LEFT OUTER JOIN camera AS b ON a.camera_id=b.id"
           +         "LEFT OUTER JOIN light AS c ON a.light_id=c.id"
           +             "LEFT OUTER JOIN sound AS d ON a.sound_id=d.id"
           + "ORDER BY a.id ASC",
            nativeQuery = true)
        List<BookedItems>findAllBookedItems();


}
