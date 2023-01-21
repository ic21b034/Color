package com.example.Color.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.example.Color.Processor.ColorProcessor.findColor;
@RestController
public class Controller {
@GetMapping("/")
    String hello() {
        return"Hello";
    }

    @GetMapping("/{color}")
    String color(@PathVariable String color) {
        return findColor(color);
    }

}
