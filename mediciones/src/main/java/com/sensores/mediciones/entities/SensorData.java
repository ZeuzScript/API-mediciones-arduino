package com.sensores.mediciones.entities;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "sensor_data")
public class SensorData {

    @Getter
    @Setter
    @Id
    private String id;

    @NotNull
    private int sensorId;

    @NotNull
    private double temperature;

    @NotNull
    private double humidity;

    @NotNull
    private LocalDateTime timestamp;



    @NotNull
    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(@NotNull int sensorId) {
        this.sensorId = sensorId;
    }

    @NotNull
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(@NotNull double temperature) {
        this.temperature = temperature;
    }

    @NotNull
    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(@NotNull double humidity) {
        this.humidity = humidity;
    }

    public @NotNull LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(@NotNull LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

