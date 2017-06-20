package com.example;

import org.junit.Test;


public class JettyRunnerTest2 {

    @Test
    public void testJettyIsUp() {
        try{
            JettyRunner.run(8080,30002,"hello world");
        } catch (Exception e){
            throw new RuntimeException("could not boot server");
        }
    }
}