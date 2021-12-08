package com.car.repository;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.car.domain.CarDealership;

@Repository
public interface CarDealershipRepository extends JpaRepository<CarDealership, Integer> {
}