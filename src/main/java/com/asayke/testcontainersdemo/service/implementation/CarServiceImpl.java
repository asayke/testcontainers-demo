package com.asayke.testcontainersdemo.service.implementation;

import com.asayke.testcontainersdemo.entity.Car;
import com.asayke.testcontainersdemo.repository.CarRepository;
import com.asayke.testcontainersdemo.service.interfaces.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public List<Car> save() {
        Car car1 = Car
                .builder()
                .name("Audi")
                .build();

        Car car2 = Car
                .builder()
                .name("Mercedes")
                .build();

        Car car3 = Car
                .builder()
                .name("Lada")
                .build();

        return carRepository.saveAll(List.of(car1, car2, car3));
    }
}