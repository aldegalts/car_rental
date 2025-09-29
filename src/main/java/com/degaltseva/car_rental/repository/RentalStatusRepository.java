package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.RentalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalStatusRepository extends JpaRepository<RentalStatus, Integer> {
}
