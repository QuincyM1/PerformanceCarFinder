package com.performancecarsfinder.service;

import com.performancecarsfinder.model.Car;
import com.performancecarsfinder.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public List<Car> searchByMake(String make){
        return carRepository.findByMakeIgnoreCase(make);


    }

    public List<Car> searchByModel(String model) {
        return carRepository.findByModelIgnoreCase(model);
    }


    public Car getCarById(Long id){
        return carRepository.findById(id).orElse(null);
    }
}
