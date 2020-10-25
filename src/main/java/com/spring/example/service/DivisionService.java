package com.spring.example.service;


import org.springframework.stereotype.Component;

@Component
public class DivisionService implements ServiceMathInterface {
    public int operate(int a, int b) {
        return a / b;
    }
}

