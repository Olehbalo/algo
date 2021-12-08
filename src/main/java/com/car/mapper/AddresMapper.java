package com.car.mapper;

import com.car.domain.Addres;
import com.car.dto.AddresDto;
import org.springframework.stereotype.Component;

@Component
public class AddresMapper extends AbstractMapper<Addres, AddresDto> {

    @Override
    public AddresDto mapObjectToDto(Addres addres) {
        if (addres == null)
            return null;

        AddresDto.AddresDtoBuilder addresDtoBuilder = AddresDto.builder();
        addresDtoBuilder.id(addres.getId());
        addresDtoBuilder.city(addres.getCity());
        addresDtoBuilder.street(addres.getStreet());

        return addresDtoBuilder.build();
    }
}


