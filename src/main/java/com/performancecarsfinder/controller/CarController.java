package com.performancecarsfinder.controller;

import com.performancecarsfinder.model.Car;
import com.performancecarsfinder.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")  // <-- Add a proper base path here
public class CarController {
    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    // 1. GET all cars
    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    // 2. GET /api/cars/search?make=BMW&model=M3
    @GetMapping("/search")  // <-- add "/search" here
    public List<Car> searchCars(@RequestParam(required = false) String make,
                                @RequestParam(required = false) String model){
        if(make != null) return carService.searchByMake(make);
        if(model != null) return carService.searchByModel(model);
        return carService.getAllCars();
    }

    // 3. GET /api/cars/{id}
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id){
        return carService.getCarById(id);
    }
}
