package com.car.mapper;

import com.car.domain.CarType;
import com.car.dto.CarTypeDto;
import org.springframework.stereotype.Component;



@Component
public class CarTypeMapper extends AbstractMapper<CarType,CarTypeDto> {

    @Override
    public CarTypeDto mapObjectToDto(CarType carType) {
        if (carType == null)
            return null;

        CarTypeDto.CarTypeDtoBuilder carTypeDto= CarTypeDto.builder();
        carTypeDto.id(carType.getId());
        carTypeDto.type(carType.getType());
        carTypeDto.car(carType.getCar().getBrand());

        return carTypeDto.build();
    }
}


