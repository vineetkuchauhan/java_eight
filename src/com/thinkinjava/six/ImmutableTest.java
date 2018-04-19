package com.thinkinjava.six;

final class A {
    private final String name;
    private final int rollno;
    private final Employee employee;

    public A(String name, int rollno, Employee employee){
        this.name = name;
        this.rollno = rollno;
        Employee e = new Employee(employee.getName());
        this.employee = e;
    }
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class ImmutableTest{
    public static void main(String arg[]) {
        Employee e = new Employee("KUmar");
    A a = new A("vineet", 2, e);
    System.out.println(a.getName());
    e.setName("Chauhan");
    A aa = new A("kumar",3, e);
    System.out.println(aa.getName());

    }
}
