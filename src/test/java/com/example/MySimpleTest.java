package com.example; 
 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.Assert;
import org.junit.Test;

public class MySimpleTest {

    @Test
    public void readRegularFile() throws RuntimeException, IOException {
      String expectedData = "Hello World from fileTest.txt!!!";

      InputStream in = getClass().getResourceAsStream("/readme.txt");
      BufferedReader reader = new BufferedReader(new InputStreamReader(in));

      Assert.assertEquals(expectedData, reader.readLine());
    }

  @Test
  public void readSoftLink() throws RuntimeException, IOException {
    String expectedData = "I am a wonderful link!";

    InputStream in = getClass().getResourceAsStream("/readme_link.txt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    Assert.assertEquals(expectedData, reader.readLine());
  }
} 
