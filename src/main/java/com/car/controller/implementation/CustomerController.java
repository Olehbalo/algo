package com.car.controller.implementation;

import com.car.controller.AbstractController;
import com.car.domain.Customer;
import com.car.dto.CustomerDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.CustomerMapper;
import com.car.service.AbstractService;
import com.car.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/customer")
@RestController
@AllArgsConstructor
public class CustomerController extends AbstractController<Customer, CustomerDto, Integer> {
    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @Override
    protected AbstractService<Customer, Integer> getService() {
        return customerService;
    }

    @Override
    protected AbstractMapper<Customer, CustomerDto> getMapper() {
        return customerMapper;
    }
}
