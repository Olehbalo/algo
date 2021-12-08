package com.car.mapper;

import com.car.domain.Characteristic;
import com.car.dto.CharacteristicDto;
import org.springframework.stereotype.Component;



@Component
public class CharacteristicMapper extends AbstractMapper<Characteristic,CharacteristicDto> {

    @Override
    public CharacteristicDto mapObjectToDto(Characteristic characteristic) {
        if (characteristic == null)
            return null;

        CharacteristicDto.CharacteristicDtoBuilder characteristicDto = CharacteristicDto.builder();
        characteristicDto.id(characteristic.getId());
        characteristicDto.drive(characteristic.getDrive());
        characteristicDto.color(characteristic.getColor());
        characteristicDto.carBody(characteristic.getCarBody());
        characteristicDto.transmission(characteristic.getTransmission());
        characteristicDto.car(characteristic.getCar().getBrand());


        return characteristicDto.build();
    }
}


