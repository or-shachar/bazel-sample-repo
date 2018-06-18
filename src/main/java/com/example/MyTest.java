package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyTest {

    @Test
    public void test() {
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.version"));
        throw new RuntimeException("please fail");
    }
}