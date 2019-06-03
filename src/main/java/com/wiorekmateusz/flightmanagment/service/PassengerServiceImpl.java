package com.wiorekmateusz.flightmanagment.service;

import com.wiorekmateusz.flightmanagment.domain.Passenger;
import com.wiorekmateusz.flightmanagment.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service("passengerService")
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {
    private final PassengerRepository passengerRepository;
    @Override
    public List<Passenger> getPassengersList() {
        List<Passenger> passengerList= passengerRepository.findAll();
        passengerList.forEach(
                (c)->c.setPlane((null))
        );
    return passengerList;
    }

    @Override
    public Passenger getById(Integer id) {
        Passenger passenger;
        passenger= passengerRepository.findById(id).get();
        passenger.setPlane(null);
        return passenger;


    }

    @Override
    public void deletePassenger(Integer id) {

    }

    @Override
    public long countPassengers() {
        return passengerRepository.count();
    }

    @Override
    public String getCurrentPassenger() {
        return "admin";
    }


    private boolean checkPassenger(Optional<Passenger> c, Integer id) {
        return id != null && c.isPresent();
    }
}
