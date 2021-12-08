package com.car.controller.implementation;

import com.car.domain.Site;
import com.car.dto.SiteDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.SiteMapper;
import com.car.service.AbstractService;
import com.car.service.SiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.controller.AbstractController;



@RequestMapping(value = "/site")
@RestController
@AllArgsConstructor
public class SiteController extends AbstractController<Site, SiteDto, Integer> {
    private final SiteService siteService;
    private final SiteMapper siteMapper;

    @Override
    protected AbstractService<Site, Integer> getService() {
        return siteService;
    }

    @Override
    protected AbstractMapper<Site, SiteDto> getMapper() {
        return siteMapper;
    }
}
