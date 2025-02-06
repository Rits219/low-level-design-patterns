package com.shrayansh.structural.proxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeTable employeeTableProxyImpl = new EmployeeTableProxy();
        employeeTableProxyImpl.create(new EmployeeDao());
    }
}
