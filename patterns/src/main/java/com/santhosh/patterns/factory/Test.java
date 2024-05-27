package com.santhosh.patterns.factory;

public class Test {
    public static void main(String[] args) {
        System.out.println("factory pattern");

        Employee fullTimeEmployee = EmployeeFactory.getEmployee("F");
        fullTimeEmployee.getSalary();

        Employee partTimeEmployee = EmployeeFactory.getEmployee("P");
        partTimeEmployee.getSalary();
    }
}
