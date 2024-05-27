package com.santhosh.patterns.factory;

public class PartTimeEmployee implements Employee{

    @Override
    public int getSalary() {

        System.out.println("Getting part time employee salary");

        return 500;
    }
    
}
