package com.santhosh.patterns.prototype;

public class Test {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("santhosh", "santhosh nagar");

        System.out.println(e1.hashCode());

        Employee e2 = (Employee)e1.clone();
        System.out.println(e2.hashCode());

    }
}
