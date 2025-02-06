package com.shrayansh.structural.proxyDesignPattern;

public class EmployeeTableImpl implements EmployeeTable{
    @Override
    public void create(EmployeeDao employeeDao) {
        System.out.println("create employee in the table");
    }

    @Override
    public void delete(int employeeId) {
        System.out.println("delete employee from the table");
    }

    @Override
    public EmployeeDao get(int employeeId) {
        System.out.println("get employee from the employee id");
        return new EmployeeDao();
    }
}
