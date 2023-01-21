package com.example.Color.Processor;

import static com.example.Color.Model.Model.color;

public class ColorProcessor {
    public static String findColor(String colors){
        String getColor = color.get(colors);
        return getColor;
    }
}
