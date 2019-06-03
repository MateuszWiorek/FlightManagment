package com.wiorekmateusz.flightmanagment.repository;

import com.wiorekmateusz.flightmanagment.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("passengerRepository")
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
