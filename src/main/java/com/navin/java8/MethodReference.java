package com.navin.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<Integer> elements = Arrays.asList(1, 2, 3);

        elements.forEach(System.out::println);
    }
}
