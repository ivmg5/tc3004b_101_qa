package com.example.basiccalculator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8000", "http://127.0.0.1:8000"})
@RestController
public class CalculatorController {

    @GetMapping("/add")
    public CalculationResult add(@RequestParam(value = "num1", defaultValue = "0.0") double num1,
                                 @RequestParam(value = "num2", defaultValue = "0.0") double num2) {
        return new CalculationResult(num1 + num2);
    }

    @GetMapping("/sub")
    public CalculationResult subtract(@RequestParam(value = "num1", defaultValue = "0.0") double num1,
                                      @RequestParam(value = "num2", defaultValue = "0.0") double num2) {
        return new CalculationResult(num1 - num2);
    }
}
