package org.example.delivery.Service;

import org.example.delivery.Repository.VehicleRepository;
import org.example.delivery.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImplement implements VehicleService {


    private VehicleRepository vehicleRepository;
    public VehicleServiceImplement(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle updatVehicle(Long id, Vehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatVehicle'");
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllVehicles'");
    }

    @Override
    public Vehicle getVehicleByPlateNumber(String number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehicleByPlateNumber'");
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
