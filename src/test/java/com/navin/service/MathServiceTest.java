package com.navin.service;

import com.navin.service.base.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathServiceTest {

    @Mock
    Calculator calculator;


    @Test
    public void add() {
        when(calculator.add(2, 3)).thenReturn(5);

        MathService mathService = new MathService(calculator);

        Assert.assertEquals(5, mathService.add(2, 3));
    }
}