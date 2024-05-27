package com.santhosh.patterns.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {

        DaoAbstractFactory daf;
        if (factoryType.equals("xml")) {
            daf = new XMLDaoFactory();
        } else {
            daf = new DBDaoFactory();
        }
        return daf;

    }
}
