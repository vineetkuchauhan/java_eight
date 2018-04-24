package com.thinkinjava.eight.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateOrTest {

    static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    static void predicate_or() {
        Predicate<String > containsLetterA = (s)-> s.contains("A");
        boolean result = hasLengthOf10.or(containsLetterA).test("And");
        System.out.println(result);
    }

    public static void main(String[] args) {
        predicate_or();
    }
}
