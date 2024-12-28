package com.tech.reloded.controller;

import com.tech.reloded.entity.TimeSeriesData;
import com.tech.reloded.service.impl.TimeSeriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/time-series")
public class TimeSeriesController {

    @Autowired
    private TimeSeriesServiceImpl timeSeriesService;
    
    @GetMapping("/")
    public Iterable<TimeSeriesData> getAllTimeSeriesData() {
        return timeSeriesService.getAllTimeSeriesData();
    }

    @GetMapping("/{id}")
    public Optional<TimeSeriesData> getTimeSeriesDataById(@PathVariable("id") int id) {
        return timeSeriesService.getTimeSeriesDataById(id);
    }

    @PostMapping("/add")
    public TimeSeriesData saveTimeSeriesData(@RequestBody TimeSeriesData timeSeriesData) {
        return timeSeriesService.saveTimeSeriesData(timeSeriesData);
    }
}
