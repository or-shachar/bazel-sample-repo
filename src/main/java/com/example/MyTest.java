package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.util.Pair;

public class MyTest {

    @Test
    public void test() throws InterruptedException{
    	Pair<String,String> p = new Pair<>("hello","world");
    	System.out.println(p);
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.version"));
        Thread.sleep(5000);
        throw new RuntimeException("please fail");
    }
}
