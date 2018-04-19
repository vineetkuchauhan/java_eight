package com.thinkinjava.eight.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithMethodReference {
    public static void main(String arg[]) {
        List<String> items = new ArrayList<>();
        items.add("Rob");
        items.add("Alen");
        items.add("Jony");
        items.add("Rony");

        // items.forEach(System.out::println);

        items.stream().filter(i -> i.contains("Rob")).forEach(System.out::println);
    }
}
