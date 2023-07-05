package com.ju.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Vehicle;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Integer> {

}
