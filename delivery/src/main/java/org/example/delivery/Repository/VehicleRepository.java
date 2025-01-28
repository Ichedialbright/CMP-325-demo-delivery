package org.example.delivery.Repository;

import org.example.delivery.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT status FROM Vehicle WHERE status.status = 'IDLE'")
    List<Vehicle> getVehiclesStatus(@Param("status") String status);

    List<Vehicle> getVechiclesByCarryingWeightGreaterThan(float weight);
}