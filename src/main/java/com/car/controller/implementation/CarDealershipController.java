package com.car.controller.implementation;

import com.car.controller.AbstractController;
import com.car.dto.CarDealershipDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.CarDealershipMapper;
import com.car.service.CarDealershipService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.domain.CarDealership;
import com.car.service.AbstractService;


@RequestMapping(value = "/car_dealeship")
@RestController
@AllArgsConstructor
public class CarDealershipController extends AbstractController<CarDealership, CarDealershipDto, Integer> {
    private final CarDealershipService carDealershipService ;
    private final CarDealershipMapper carDealershipMapper;

    @Override
    protected AbstractService<CarDealership, Integer> getService() {
        return carDealershipService;
    }

    @Override
    protected AbstractMapper<CarDealership, CarDealershipDto> getMapper() {return carDealershipMapper;
    }
}
