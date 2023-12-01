package com.asayke.testcontainersdemo.controller;

import com.asayke.testcontainersdemo.entity.Car;
import com.asayke.testcontainersdemo.service.interfaces.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CatController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> save() {
        return ResponseEntity.ok(carService.save());
    }
}