package com.example.sampleapp;

import org.example.sampleapp.calculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculationTest {
     @Test
     void testcalculation(){
          calculation cal=new calculation();
          int actualRes=cal.divide(10,5);
          int expectedRes=2;
          assertEquals(expectedRes,actualRes);
     }
}
