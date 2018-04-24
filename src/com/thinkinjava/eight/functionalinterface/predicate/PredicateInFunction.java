package com.thinkinjava.eight.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateInFunction {
    public static void main(String arg[]) {
        predicateInFunction(6, (i) -> i > 7);
    }

    static void predicateInFunction(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number:" + number);
        } else {
            System.out.println("Number is less than 7");
        }
    }
}
