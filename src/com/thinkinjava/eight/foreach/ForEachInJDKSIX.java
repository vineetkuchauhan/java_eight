package com.thinkinjava.eight.foreach;

import java.util.HashMap;
import java.util.Map;

public class ForEachInJDKSIX {
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

    }
}
