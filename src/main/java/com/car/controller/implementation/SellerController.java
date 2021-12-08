package com.car.controller.implementation;

import com.car.domain.Seller;
import com.car.dto.SellerDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.SellerMapper;
import com.car.service.AbstractService;
import com.car.service.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.controller.AbstractController;


@RequestMapping(value = "/seller")
@RestController
@AllArgsConstructor
public class SellerController extends AbstractController<Seller, SellerDto, Integer> {
    private final SellerService sellerService;
    private final SellerMapper sellerMapper;

    @Override
    protected AbstractService<Seller, Integer> getService() {
        return sellerService;
    }

    @Override
    protected AbstractMapper<Seller, SellerDto> getMapper() {
        return sellerMapper;
    }
}
