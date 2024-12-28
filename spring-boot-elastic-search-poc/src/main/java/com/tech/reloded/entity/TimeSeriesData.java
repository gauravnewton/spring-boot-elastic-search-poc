package com.tech.reloded.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "time-series-data")
@ToString
public class TimeSeriesData {
    @Id
    private long id;
    @JsonProperty("query")
    private String query;
    @JsonProperty("vrouterIp")
    private String vRouterIp;
    @JsonProperty("vrouterId")
    private long VRouterId;
    @JsonProperty("peerIp")
    private String peerIp;
    @JsonProperty("peerId")
    private long peerId;
    @JsonProperty("timeFrom")
    private String timeFrom;
    @JsonProperty("timeTo")
    private String timeTo;
    @JsonProperty("values")
    private List<Value> values;
}
