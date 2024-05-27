package com.santhosh.patterns.proxy;

public class Test {
    public static void main(String[] args) {
        
        try{
            EmployeeDao employeeTable = new EmployeeDaoProxy();
            employeeTable.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        }
        catch(Exception e){
            System.out.println("Operation failed");
        }
    }
}
