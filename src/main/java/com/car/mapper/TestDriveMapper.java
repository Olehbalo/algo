package com.car.mapper;

import com.car.domain.TestDrive;
import com.car.dto.TestDriveDto;
import org.springframework.stereotype.Component;



@Component
public class TestDriveMapper extends AbstractMapper<TestDrive, TestDriveDto> {

    @Override
    public TestDriveDto mapObjectToDto(TestDrive testDrive) {
        if (testDrive == null)
            return null;

        TestDriveDto.TestDriveDtoBuilder siteDto = TestDriveDto.builder();
        siteDto.id(testDrive.getId());
        siteDto.brand(testDrive.getBrand());
        siteDto.car(testDrive.getCar().getIsSold());

        return siteDto.build();
    }
}





