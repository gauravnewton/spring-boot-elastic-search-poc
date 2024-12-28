package com.tech.reloded.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Value {
    @JsonProperty("timestamp")
    private String timeStamp;
    @JsonProperty("value")
    private String value;
}
