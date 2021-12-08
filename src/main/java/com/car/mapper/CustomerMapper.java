package com.car.mapper;

import com.car.domain.Customer;
import com.car.dto.CustomerDto;
import org.springframework.stereotype.Component;



@Component
public class CustomerMapper extends AbstractMapper<Customer,CustomerDto> {

    @Override
    public CustomerDto mapObjectToDto(Customer customer) {
        if (customer == null)
            return null;

        CustomerDto.CustomerDtoBuilder customerDto = CustomerDto.builder();
        customerDto.id(customer.getId());
        customerDto.firstName(customer.getFirstName());
        customerDto.lastName(customer.getLastName());
        customerDto.email(customer.getEmail());

        return customerDto.build();
    }
}


