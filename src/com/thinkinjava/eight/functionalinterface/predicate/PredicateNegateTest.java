package com.thinkinjava.eight.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateNegateTest {
    static Predicate<String> hasLenghtOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    static void predicate_negate() {
        String lengthGTThan10 = "How to write by two threads sequentailly and read by one thread?";
        boolean result = hasLenghtOf10.negate().test(lengthGTThan10);
        System.out.println(result);
    }

    public static void main(String[] args) {
        predicate_negate();
    }
}
