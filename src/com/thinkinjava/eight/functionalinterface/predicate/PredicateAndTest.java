package com.thinkinjava.eight.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateAndTest {
    public static void main(String are[]) {
        Predicate<Integer> greaterThanPredicate = (p) -> p > 10;
        Predicate<Integer> lowerThanPredicate = (p) -> p < 20;
        boolean result = greaterThanPredicate.and(lowerThanPredicate).test(15);
        System.out.println(result);
        boolean result1 = greaterThanPredicate.and(lowerThanPredicate).test(10);
        System.out.println(result1);
    }
}
