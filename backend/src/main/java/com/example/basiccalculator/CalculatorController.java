package com.example.basiccalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public CalculationResult add(@RequestParam(value = "num1") double num1,
                                 @RequestParam(value = "num2") double num2) {
        return new CalculationResult(num1 + num2);
    }

    @GetMapping("/sub")
    public CalculationResult subtract(@RequestParam(value = "num1") double num1,
                                      @RequestParam(value = "num2") double num2) {
        return new CalculationResult(num1 - num2);
    }
}
