package com.santhosh.patterns.abstractfactory;

public class XMLEmpDao implements Dao{

    @Override
    public void saveData() {
        System.out.println("XML Emp Data write successful");
    }
    
}
