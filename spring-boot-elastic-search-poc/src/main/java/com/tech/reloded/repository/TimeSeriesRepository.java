package com.tech.reloded.repository;

import com.tech.reloded.entity.TimeSeriesData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TimeSeriesRepository extends ElasticsearchRepository<TimeSeriesData, Long> {
}
