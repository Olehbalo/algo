package com.car.mapper;

import com.car.domain.CarDealership;
import com.car.dto.CarDealershipDto;
import org.springframework.stereotype.Component;



@Component
public class CarDealershipMapper extends AbstractMapper<CarDealership,CarDealershipDto> {

    @Override
    public CarDealershipDto mapObjectToDto(CarDealership carDealership) {
        if (carDealership == null)
            return null;

        CarDealershipDto.CarDealershipDtoBuilder carDealershipDto = CarDealershipDto.builder();
        carDealershipDto.id(carDealership.getId());
        carDealershipDto.site(carDealership.getSite());
        carDealershipDto.email(carDealership.getEmail());
        carDealershipDto.addres(carDealership.getAddres().getCity());


        return carDealershipDto.build();
    }
}


