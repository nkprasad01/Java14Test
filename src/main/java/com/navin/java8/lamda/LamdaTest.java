package com.navin.java8.lamda;

import java.io.FileNotFoundException;

public class LamdaTest {

    public static void main(String[] args) {
        MyLamda myLamda = ()->{
            throw new RuntimeException();
        };

        System.out.println(myLamda.get());
    }
}
