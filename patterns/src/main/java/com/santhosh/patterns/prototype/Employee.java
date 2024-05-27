package com.santhosh.patterns.prototype;

public class Employee implements Prototype{

    String name;
    String address;

    Employee(String name,String address){
        this.name= name;
        this.address= address;
    }

    @Override
    public Prototype clone(){
        return new Employee(this.name, this.address);
    }
    
}

