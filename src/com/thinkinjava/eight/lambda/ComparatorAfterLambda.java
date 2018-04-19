package com.thinkinjava.eight.lambda;

import com.thinkinjava.eight.Developer;

import java.util.Arrays;
import java.util.List;

public class ComparatorAfterLambda {
    public static void main(String arg[]) {
        List<Developer> developers = getDevelopers();
        System.out.println("Before Sort");

        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }

        developers.sort((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

        System.out.println("After Sort");

        developers.forEach((developer -> System.out.println(developer)));
    }


    private static List<Developer> getDevelopers() {
        Developer developerOne = new Developer();
        developerOne.setName("Rob");
        developerOne.setRole("Assistant Manager");
        developerOne.setSalary(2000000);

        Developer developerSecond = new Developer();
        developerSecond.setName("Ella");
        developerSecond.setRole("Assistant Manager");
        developerSecond.setSalary(50000);

        Developer developerThree = new Developer();
        developerThree.setName("Jane");
        developerThree.setRole("Executive Manager");
        developerThree.setSalary(1000000);

        return Arrays.asList(developerOne, developerSecond, developerThree);
    }
}
