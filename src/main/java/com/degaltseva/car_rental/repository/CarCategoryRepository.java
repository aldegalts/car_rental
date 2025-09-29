package com.degaltseva.car_rental.repository;

import com.degaltseva.car_rental.entity.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCategoryRepository extends JpaRepository<CarCategory, Integer> {
}
