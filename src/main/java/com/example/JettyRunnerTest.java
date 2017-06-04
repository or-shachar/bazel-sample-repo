package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JettyRunnerTest {

    @Test
    public void testJettyIsUp() {
        try{
            JettyRunner.run(8080,30000,"hello world");
        } catch (Exception e){
            throw new RuntimeException("could not start server");
        }
    }
}