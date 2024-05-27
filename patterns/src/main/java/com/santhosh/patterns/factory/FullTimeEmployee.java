package com.santhosh.patterns.factory;

public class FullTimeEmployee implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting Full time employee salary");
        return 10000;
    }
    

}
