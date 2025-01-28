package org.example.delivery.Service;

import org.example.delivery.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle createVehicle(Vehicle vehicle);

    Vehicle updateVehicle(Long id, Vehicle vehicle);

    Vehicle updatVehicle(Long id, Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleByPlateNumber(String number);
    void deleteVehicle(Long id);
}