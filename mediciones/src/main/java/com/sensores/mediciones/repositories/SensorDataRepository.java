package com.sensores.mediciones.repositories;

import com.sensores.mediciones.entities.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorDataRepository extends MongoRepository<SensorData, String > {
    List<SensorData> findBySensorId(int sensorId);
}
