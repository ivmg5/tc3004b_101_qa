package com.example.basiccalculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testAdd() {
        ResponseEntity<CalculationResult> response = restTemplate.getForEntity("/add?num1=5.0&num2=3.0", CalculationResult.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(8.0, response.getBody().result(), 0.001);
    }

    @Test
    public void testAddWithDefaultValues() {
        ResponseEntity<CalculationResult> response = restTemplate.getForEntity("/add", CalculationResult.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(0.0, response.getBody().result(), 0.001);
    }

    @Test
    public void testSub() {
        ResponseEntity<CalculationResult> response = restTemplate.getForEntity("/sub?num1=5.0&num2=3.0", CalculationResult.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2.0, response.getBody().result(), 0.001);
    }

    @Test
    public void testSubWithDefaultValues() {
        ResponseEntity<CalculationResult> response = restTemplate.getForEntity("/sub", CalculationResult.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(0.0, response.getBody().result(), 0.001);
    }
}