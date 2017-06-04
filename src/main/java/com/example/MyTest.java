package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyTest {

    @Test
    public void test() {
            throw new RuntimeException("please fail");
    }
}