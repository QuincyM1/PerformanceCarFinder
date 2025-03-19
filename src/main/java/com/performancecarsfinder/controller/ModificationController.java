package com.performancecarsfinder.controller;

import com.performancecarsfinder.model.Modification;
import com.performancecarsfinder.service.ModificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/modifications")
public class ModificationController {
    private final ModificationService modificationService;

    public ModificationController(ModificationService modificationService){
        this.modificationService = modificationService;
    }
    @GetMapping("/car/{carId}")
    public List<Modification> getModsForCar(@PathVariable Long carId){
        return modificationService.getModesForCar(carId);
    }
}
