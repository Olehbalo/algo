package com.car.controller.implementation;

import com.car.domain.Car;
import com.car.dto.CarDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.CarMapper;
import com.car.service.AbstractService;
import com.car.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.controller.AbstractController;


@RequestMapping(value = "/car")
@RestController
@AllArgsConstructor
public class CarController extends AbstractController<Car, CarDto, Integer> {
    private final CarService carService;
    private final CarMapper carMapper;

    @Override
    protected AbstractService<Car, Integer> getService() {
        return carService;
    }

    @Override
    protected AbstractMapper<Car, CarDto> getMapper() {
        return carMapper;
    }
}
