package com.santhosh.patterns.factory;

public class EmployeeFactory {
    
    public static Employee getEmployee(String empType) {

        if(empType.trim().equalsIgnoreCase("F")){

            return new FullTimeEmployee();
        }
        else if(empType.trim().equals("P")){
            return new PartTimeEmployee();
        }
        else{
            return null;
        }
        
    }
}
