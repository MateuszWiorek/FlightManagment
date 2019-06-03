package com.wiorekmateusz.flightmanagment.repository;

import com.wiorekmateusz.flightmanagment.domain.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("planeRepository")
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
}
