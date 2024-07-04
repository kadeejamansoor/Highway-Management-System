package com.example.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicleservice.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
