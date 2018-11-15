package com.example; 
 
import static org.junit.Assert.assertEquals; 
import org.junit.Ignore;
import org.junit.Test; 
import javafx.util.Pair; 
 
public class MySimpleTest {

 	@Test
    public void happyTest(){
    	System.out.println("I am a happy test");
    } 

    @Test
    @Ignore("not ready yet")
    public void skippedTest() throws RuntimeException{
        throw new RuntimeException("Just skip me please");
    } 
} 
