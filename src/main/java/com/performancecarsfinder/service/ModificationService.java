package com.performancecarsfinder.service;

import com.performancecarsfinder.model.Modification;
import com.performancecarsfinder.repository.ModificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModificationService {
    private final ModificationRepository modificationRepository;

    public ModificationService (ModificationRepository modificationRepository){
        this.modificationRepository = modificationRepository;
    }

    public List<Modification> getModesForCar(Long carId){
        return modificationRepository.findByCarId(carId);
    }

}
