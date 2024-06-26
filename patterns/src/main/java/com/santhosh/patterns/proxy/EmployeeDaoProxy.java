package com.santhosh.patterns.proxy;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;
    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        if(client.equals("ADMIN")){
            employeeDao.create(client, obj);
            return;
        }
        
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.delete(client, employeeId);
            return;
        }
        
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDao.get(client, obj);
        }
        throw new Exception("Access Denied");
    }
}
