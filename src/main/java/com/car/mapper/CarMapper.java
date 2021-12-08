package com.car.mapper;

import com.car.domain.Car;
import com.car.dto.CarDto;
import org.springframework.stereotype.Component;



@Component
public class CarMapper extends AbstractMapper<Car,CarDto> {

    @Override
    public CarDto mapObjectToDto(Car car) {
        if (car == null)
            return null;

        CarDto.CarDtoBuilder carDto = CarDto.builder();
        carDto.id(car.getId());
        carDto.brand(car.getBrand());
        carDto.graduathionYear(car.getGraduathionYear());
        carDto.serNum(car.getSerNum());
        carDto.isNew(car.getIsNew());
        carDto.isSold(car.getIsSold());
        carDto.seller(car.getSeller().getFirstName());
        carDto.comment(car.getComment().getNickname());

        return carDto.build();
    }
}


