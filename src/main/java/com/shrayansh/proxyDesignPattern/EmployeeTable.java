package com.shrayansh.proxyDesignPattern;

public interface EmployeeTable {
    void create(EmployeeDao employeeDao);

    void delete(int employeeId);

    EmployeeDao get(int employeeId);
}
