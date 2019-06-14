package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarsRepository extends CrudRepository<Cars,Long>{
    List<Cars> findByModel(String model);
    List<Cars> findByMake(String make);
    List<Cars> findByYear(int year);
    List<Cars> findByMileage(String mileage);
}
