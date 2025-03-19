package com.performancecarsfinder.controller;

import com.performancecarsfinder.model.Car;
import com.performancecarsfinder.service.CarService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping

public class CarController {
    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
    @GetMapping
    public List<Car>searchCars(@RequestParam(required = false) String make,
                               @RequestParam(required = false) String model){
        if(make != null) return carService.searchByMake(make);
        if(model != null) return carService.searchByModel(model);
        return carService.getAllCars();
    }
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id){
        return carService.getCarById(id);
    }
}
