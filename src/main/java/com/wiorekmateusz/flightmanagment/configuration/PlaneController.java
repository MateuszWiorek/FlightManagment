package com.wiorekmateusz.flightmanagment.configuration;

import com.wiorekmateusz.flightmanagment.domain.Plane;
import com.wiorekmateusz.flightmanagment.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plane/")
public class PlaneController {
    PlaneService planeService;


    @GetMapping("/listPlanes")
    public List<Plane> getPlanes(){
        return planeService.getAll();
    }

    @GetMapping("/getPlane/{id}")
    public Plane getPlane(@PathVariable int id){
        return planeService.getById(id);
    }

    @PostMapping("/addPlane/")
    public void addPlane(@RequestBody Plane plane){
        planeService.addNew(plane);
    }

    @PostMapping("/deletePlane/{id}")
    public void deletePlane(@PathVariable int id){
        planeService.deletePlane(id);
    }
}
