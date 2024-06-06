package com.services;

import com.model.GlucoseReading;
import com.model.User;
import com.repositry.GlucoseReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GlucoseReadingService {
    @Autowired
    private GlucoseReadingRepository glucoseReadingRepository;

    public GlucoseReading saveReading(GlucoseReading reading, User user) {
        reading.setUser(user);
        return glucoseReadingRepository.save(reading);
    }

    public void deleteReading(Long id, User user) {
        GlucoseReading reading = glucoseReadingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reading not found"));
        if (!reading.getUser().equals(user)) {
            throw new RuntimeException("Not authorized");
        }
        glucoseReadingRepository.delete(reading);
    }

    public List<GlucoseReading> getAllReadingsForUser(User user) {
        return glucoseReadingRepository.findAllByUserOrderedByTimestamp(user);
    }
}