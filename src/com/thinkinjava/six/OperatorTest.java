package com.thinkinjava.six;

import java.util.Scanner;

public class OperatorTest {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        double meal_cost = in.nextDouble();

        int tip_percent = in.nextInt();

        int tax_percent = in.nextInt();

            double tip_value = meal_cost * (tip_percent / 100.0);

            double tax_value = meal_cost * (tax_percent / 100.0);

            double total_cost = meal_cost + tip_value + tax_value;

            int sum = Math.toIntExact(Math.round(total_cost));

            System.out.println(sum);
            in.close();
    }
}
