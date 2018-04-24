package com.thinkinjava.eight.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerAcceptTest {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (arg) -> {
            System.out.println(arg + "OK");
        };

        consumer1.accept("TestConsumerAccept - ");

        Consumer<String> consumer2 = (x) -> {
            System.out.println(x + "Ok!!!");
        };

        consumer2.andThen(consumer1).accept("TestConsumerAfterThen - ");
    }

}
