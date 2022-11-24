package com.group8.bookingapp.repository;

import com.group8.bookingapp.models.BookedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedItemsRepo extends JpaRepository<BookedItems, Long> {
}
