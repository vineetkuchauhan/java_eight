package com.thinkinjava.eight.lambda;

import com.thinkinjava.eight.Developer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBeforeLambda {
    public static void main(String arg[]) {
        List<Developer> developers = getDevelopers();
        System.out.println("Before Sort");

        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }

        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("After Sort");
        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }
    }


    private static List<Developer> getDevelopers() {
        Developer developerOne = new Developer();
        developerOne.setName("Rob");
        developerOne.setRole("Assistant Manager");
        developerOne.setSalary(2000000);

        Developer developerSecond = new Developer();
        developerSecond.setName("Nel");
        developerSecond.setRole("Assistant Manager");
        developerSecond.setSalary(50000);

        Developer developerThree = new Developer();
        developerThree.setName("Denial");
        developerThree.setRole("Executive Manager");
        developerThree.setSalary(1000000);

        return Arrays.asList(developerOne, developerSecond, developerThree);
    }
}
