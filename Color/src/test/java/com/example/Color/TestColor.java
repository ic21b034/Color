package com.example.Color;

import com.example.Color.Processor.ColorProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestColor {
    @Test
    void findColorTrue(){
    assertEquals("Red", ColorProcessor.findColor("Green"));
    }

    @Test
    void findColorFalse(){
        assertNotEquals("Green",ColorProcessor.findColor("Blue"));
    }
}
