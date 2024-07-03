package com.sensores.mediciones.controllers;

import com.sensores.mediciones.entities.SensorData;
import com.sensores.mediciones.services.SensorDataService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor")
@AllArgsConstructor
public class SensorDataController {

    private SensorDataService sensorDataService;

    @PostMapping
    public ResponseEntity<SensorData> createSensorData(
            @RequestParam int sensorId,
            @RequestParam double temperature,
            @RequestParam double humidity) {
        SensorData sensorData = sensorDataService.saveSensorData(sensorId, temperature, humidity);
        return new ResponseEntity<>(sensorData, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SensorData>> getAllSensorData() {
        List<SensorData> sensorDataList = sensorDataService.getAllSensorData();
        return new ResponseEntity<>(sensorDataList, HttpStatus.OK);
    }

    @GetMapping("/{sensorId}")
    public ResponseEntity<List<SensorData>> getSensorDataBySensorId(@PathVariable int sensorId) {
        List<SensorData> sensorDataList = sensorDataService.getSensorDataBySensorId(sensorId);
        return new ResponseEntity<>(sensorDataList, HttpStatus.OK);
    }
}
