package com.shrayansh.structural.proxyDesignPattern;

public class EmployeeTableProxy implements EmployeeTable {
    EmployeeTableImpl employeeTableImpl = new EmployeeTableImpl();


    @Override
    public void create(EmployeeDao employeeDao) {
        System.out.println("going through proxy");
        employeeTableImpl.create(employeeDao);
    }

    @Override
    public void delete(int employeeId) {
        System.out.println("going through proxy");
        employeeTableImpl.delete(employeeId);
    }

    @Override
    public EmployeeDao get(int employeeId) {
        System.out.println("going through proxy");
        return employeeTableImpl.get(employeeId);
    }
}
