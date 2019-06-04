package com.wiorekmateusz.flightmanagment.repository;

import com.wiorekmateusz.flightmanagment.domain.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
