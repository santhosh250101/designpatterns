package com.santhosh.patterns.abstractfactory;

public abstract class DaoAbstractFactory {

    public abstract Dao createDao(String type);
}
