package com.thinkinjava.eight.foreach;

import java.util.HashMap;
import java.util.Map;

public class IterateMapInJDKEight {
    public static void main(String arg[]) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.put("D", 70);
        items.put("G", 80);
        items.put("H", 90);

        items.forEach((k, v) -> {
            System.out.println("Key:" + k + "Value:" + v);
        });

        items.forEach((k, v) -> {
            System.out.println("Key:" + k + "Value:" + v);
            if ("E".equals(k)) {
                System.out.println("Hello" + k);
            }
        });
    }
}
