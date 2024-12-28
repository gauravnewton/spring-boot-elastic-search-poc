package com.tech.reloded.service.impl;

import com.tech.reloded.entity.TimeSeriesData;
import com.tech.reloded.repository.TimeSeriesRepository;
import com.tech.reloded.service.TimeSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TimeSeriesServiceImpl implements TimeSeriesService {

    @Autowired
    private TimeSeriesRepository timeSeriesRepository;

    @Override
    public Iterable<TimeSeriesData> getAllTimeSeriesData() {
        return timeSeriesRepository.findAll();
    }

    @Override
    public TimeSeriesData saveTimeSeriesData(TimeSeriesData timeSeriesData) {
        return timeSeriesRepository.save(timeSeriesData);
    }

    @Override
    public Optional<TimeSeriesData> getTimeSeriesDataById(long id) {
        return timeSeriesRepository.findById(id);
    }
}
