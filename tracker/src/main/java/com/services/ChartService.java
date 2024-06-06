package com.services;

import com.model.GlucoseReading;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ChartService {
    @Autowired
    private GlucoseReadingService glucoseReadingService;

    public Map<String, Object> getChartData(User user) {
        List<GlucoseReading> readings = glucoseReadingService.getAllReadingsForUser(user);

        List<String> labels = readings.stream()
                .map(r -> r.getTimestamp().toString())
                .collect(Collectors.toList());

        List<Double> data = readings.stream()
                .map(GlucoseReading::getGlucoseLevel)
                .collect(Collectors.toList());

        Map<String, Object> chartData = new HashMap<>();
        chartData.put("labels", labels);
        chartData.put("data", data);

        return chartData;
    }
}