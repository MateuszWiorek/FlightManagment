package com.wiorekmateusz.flightmanagment.repository;

import com.wiorekmateusz.flightmanagment.domain.OrderFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderFlight, Integer> {
}
