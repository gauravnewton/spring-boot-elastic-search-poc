package com.tech.reloded.service;

import com.tech.reloded.entity.TimeSeriesData;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface TimeSeriesService {

    public Iterable<TimeSeriesData> getAllTimeSeriesData();

    public TimeSeriesData saveTimeSeriesData(TimeSeriesData timeSeriesData);

    public Optional<TimeSeriesData> getTimeSeriesDataById(long id);
}
