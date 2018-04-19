package com.thinkinjava.eight.foreach;

import java.util.ArrayList;
import java.util.List;

public class IterateListInJDKEight {
    public static void main(String arg[]) {
        List<String> items = new ArrayList<>();
        items.add("Rob");
        items.add("Alen");
        items.add("Jony");
        items.add("Rony");

        items.forEach(i -> System.out.println("Item:" + i));

        items.forEach(i -> {
            System.out.println("Item:" + i);
            if ("Rob".equals(i)) System.out.println("Hi , Rob");
        });
    }
}
