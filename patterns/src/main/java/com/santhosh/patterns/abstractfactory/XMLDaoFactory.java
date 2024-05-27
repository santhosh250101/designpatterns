package com.santhosh.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{

    @Override
    public Dao createDao(String type) {
        if(type.equals("emp")){
            return new XMLEmpDao();
        }
        else
        {
            return new XMLDeptDao();
        }

    }
    
}
