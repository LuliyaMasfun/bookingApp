
package com.group8.bookingapp.repository;

        import com.group8.bookingapp.models.Sound;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface SoundRepo extends JpaRepository <Sound, Long> {


}

