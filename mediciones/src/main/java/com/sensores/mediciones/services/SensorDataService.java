package com.sensores.mediciones.services;

import com.sensores.mediciones.entities.SensorData;
import com.sensores.mediciones.repositories.SensorDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class SensorDataService {

    private SensorDataRepository sensorDataRepository;

    public SensorData saveSensorData(int sensorId, double temperature, double humidity) {
        SensorData sensorData = new SensorData();
        sensorData.setSensorId(sensorId);
        sensorData.setTemperature(temperature);
        sensorData.setHumidity(humidity);
        sensorData.setTimestamp(LocalDateTime.now());
        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }
    public List<SensorData> getSensorDataBySensorId(int sensorId) {
        return sensorDataRepository.findBySensorId(sensorId);
    }

}
