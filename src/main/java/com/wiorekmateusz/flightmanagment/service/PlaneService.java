package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Plane;

import java.util.List;

public interface PlaneService {
        List<Plane> getAll();
        Plane getById(Integer id);
        void addNew(Plane plane);
        void deletePlane(Integer id);
}
