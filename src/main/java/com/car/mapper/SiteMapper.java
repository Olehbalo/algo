package com.car.mapper;

import com.car.domain.Site;
import com.car.dto.SiteDto;
import org.springframework.stereotype.Component;



@Component
public class SiteMapper extends AbstractMapper<Site, SiteDto> {

    @Override
    public SiteDto mapObjectToDto(Site site) {
        if (site == null)
            return null;

        SiteDto.SiteDtoBuilder siteDto = SiteDto.builder();
        siteDto.id(site.getId());
        siteDto.car(site.getCar().getBrand());
        siteDto.carDealership(site.getCarDealership().getSite());
        return siteDto.build();
    }
}




