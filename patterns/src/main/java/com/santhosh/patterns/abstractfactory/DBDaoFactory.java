package com.santhosh.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        if (type.equals("emp")) {
            return new DBEmpDao();
        } else {
            return new DBDeptDao();
        }

    }

}
