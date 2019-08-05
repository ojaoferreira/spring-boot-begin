package com.schoolofnet.SpringGradle.repository;

import com.schoolofnet.SpringGradle.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
//    Car findByName(String name);
}