package org.example.delivery.Controller;

import org.example.delivery.Service.ItemServices;
import org.example.delivery.Service.VehicleService;
import org.example.delivery.entity.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    private final ItemServices ItemServices;

    private final VehicleService vehicleService;

    public VehicleController(org.example.delivery.Service.ItemServices itemServices, VehicleService vehicleService) {
        ItemServices = itemServices;
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create-vehicle")
    ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.createVehicle(vehicle);
        return ResponseEntity.ok(vehicle);
    }
}