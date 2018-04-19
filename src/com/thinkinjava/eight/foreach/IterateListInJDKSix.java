package com.thinkinjava.eight.foreach;

import java.util.ArrayList;
import java.util.List;

public class IterateListInJDKSix {
    public static void main(String arg[]) {
        List<String> items = new ArrayList<>();
        items.add("Rob");
        items.add("Alen");
        items.add("Jony");
        items.add("Rony");
        for (String item : items) {
            System.out.println("Item:" + item);
        }
    }
}
