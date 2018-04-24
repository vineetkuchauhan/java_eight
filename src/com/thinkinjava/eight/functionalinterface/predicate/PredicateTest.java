package com.thinkinjava.eight.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String are[]) {
        List<String> developers = Arrays.asList("Alen", "Denial", "Roche");
        Predicate<String> pre = (p) -> p.startsWith("A");
        for (String name : developers) {
            if (pre.test(name)) {
                System.out.println("Name:" + name);
            }
        }
    }
}
