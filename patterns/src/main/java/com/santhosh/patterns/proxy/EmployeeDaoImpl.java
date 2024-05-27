package com.santhosh.patterns.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj){
        System.out.println("new Employee created");
    }

    @Override
    public void delete(String client, int employeeId){
        // TODO Auto-generated method stub
        System.out.println("Employee deleted");
    }

    @Override
    public EmployeeDo get(String client, EmployeeDo obj) {
        // TODO Auto-generated method stub
        return new EmployeeDo();
    }

}
