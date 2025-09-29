package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.ViolationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViolationTypeRepository extends JpaRepository<ViolationType, Integer> {
}
