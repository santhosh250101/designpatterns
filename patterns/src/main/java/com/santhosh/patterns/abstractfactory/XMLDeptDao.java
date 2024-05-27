package com.santhosh.patterns.abstractfactory;

public class XMLDeptDao implements Dao{

    @Override
    public void saveData() {
        System.out.println("XML Dept Data write successful");
    }
    
}
