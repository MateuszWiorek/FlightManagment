package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("planeService")
@RequiredArgsConstructor
public class PlaneServiceImpl implements PlaneService {
    private final PlaneRepository planeRepository;


    @Override
    public List<Plane> getAll() {
        List<Plane> planes = planeRepository.findAll();
        planes.forEach((c) -> {
            c.setPassengers(null);
        });
        return  planes;
    }

    @Override
    public Plane getById(Integer id) {
        Plane plane;
        plane = planeRepository.findById(id).get();
        plane.setPassengers(null);
        return plane;
    }

    @Override
    public void addNew(Plane plane) {
        planeRepository.save(plane);

    }

    @Override
    public void deletePlane(Integer id) {

    }
}
