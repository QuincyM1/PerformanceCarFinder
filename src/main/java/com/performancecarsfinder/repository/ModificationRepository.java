package com.performancecarsfinder.repository;

import com.performancecarsfinder.model.Modification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //
public interface ModificationRepository extends JpaRepository<Modification, Long> {
    List<Modification> findByCarId(Long carId);
}
