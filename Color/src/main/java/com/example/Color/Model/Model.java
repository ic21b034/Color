package com.example.Color.Model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class Model {
    public static Map<String, String> color = new HashMap<>() {{
        put("Red", "Green");
        put("Orange", "Blue");
        put("Yellow", "Purple");
        put("Green", "Red");
        put("Blue", "Orange");
        put("Purple", "Yellow");

    }};
}
