package com.navin.service;

import com.navin.service.base.Calculator;

public class MathService {

    final Calculator calculator;

    public MathService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }
}
