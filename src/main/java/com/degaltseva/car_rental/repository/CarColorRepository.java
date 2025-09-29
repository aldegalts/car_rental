package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.CarColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarColorRepository extends JpaRepository<CarColor, Integer> {
}
