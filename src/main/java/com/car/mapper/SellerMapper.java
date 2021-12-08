package com.car.mapper;

import com.car.domain.Seller;
import com.car.dto.SellerDto;
import org.springframework.stereotype.Component;



@Component
public class SellerMapper extends AbstractMapper<Seller, SellerDto> {

    @Override
    public SellerDto mapObjectToDto(Seller seller) {
        if (seller == null)
            return null;

        SellerDto.SellerDtoBuilder sellerDto = SellerDto.builder();
        sellerDto.id(seller.getId());
        sellerDto.firstName(seller.getFirstName());
        sellerDto.email(seller.getEmail());
        sellerDto.lastName(seller.getLastName());
        sellerDto.phoneNumber(seller.getPhoneNumber());

        return sellerDto.build();
    }
}


