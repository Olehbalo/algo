package  com.car.controller.implementation;

import com.car.domain.Characteristic;
import com.car.dto.CharacteristicDto;
import com.car.mapper.CharacteristicMapper;
import com.car.service.CharacteristicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.controller.AbstractController;

import com.car.mapper.AbstractMapper;

import com.car.service.AbstractService;


@RequestMapping(value = "/characteristic")
@RestController
@AllArgsConstructor
public class CharacteristicController extends AbstractController<Characteristic, CharacteristicDto, Integer> {
    private final CharacteristicService characteristicService;
    private final CharacteristicMapper characteristicMapper;

    @Override
    protected AbstractService<Characteristic, Integer> getService() {
        return characteristicService;
    }

    @Override
    protected AbstractMapper<Characteristic, CharacteristicDto> getMapper() {
        return characteristicMapper;
    }
}
