package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Plane> c= planeRepository.findById(id);
        if(checkPlane(c, id)) {
            plane=c.get();
            plane.setPassengers(null);
            return plane;
        }
        return null;
    }

    @Override
    public void addNew(Plane plane) {
        planeRepository.saveAndFlush(plane);

    }

    @Override
    public void deletePlane(Integer id) {
    Plane plane;
    Optional<Plane> c = planeRepository.findById(id);
    if(checkPlane(c, id)){
        planeRepository.deleteById(id);
    }

    }
    private boolean checkPlane(Optional<Plane> c, Integer id) {
        return id != null && c.isPresent();
    }
}
