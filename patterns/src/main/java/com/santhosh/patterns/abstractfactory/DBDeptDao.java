package com.santhosh.patterns.abstractfactory;

public class DBDeptDao implements Dao{
    @Override
    public void saveData() {
        System.out.println("Db Dept Data write successful");
    }
}
