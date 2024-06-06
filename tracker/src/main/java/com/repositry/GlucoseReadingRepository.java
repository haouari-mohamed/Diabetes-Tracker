package com.repositry;

import com.model.GlucoseReading;
import com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GlucoseReadingRepository extends JpaRepository<GlucoseReading, Long> {
    List<GlucoseReading> findByUserOrderByTimestampDesc(User user);

    @Query("SELECT g FROM GlucoseReading g WHERE g.user = ?1 ORDER BY g.timestamp ASC")
    List<GlucoseReading> findAllByUserOrderedByTimestamp(User user);
}