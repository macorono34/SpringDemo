package com.example.denemoto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
    List<Motorcycle> findByMotopriceLessThan(double price);

    List<Motorcycle> findByModelLike(String model);
    List<Motorcycle> findByColorLike(String color);


}
