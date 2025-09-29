package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarStatusRepository extends JpaRepository<CarStatus, Integer> {
}
