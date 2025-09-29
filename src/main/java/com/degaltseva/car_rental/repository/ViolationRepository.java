package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.Violation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViolationRepository extends JpaRepository<Violation, Integer> {
}
