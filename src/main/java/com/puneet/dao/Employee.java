package com.puneet.dao;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IEmployee<com.puneet.dao.entity.Employee> {

    private static Employee endPointService = null;

    private List<com.puneet.dao.entity.Employee> employees;

    private Employee() {
        employees = new ArrayList<>();
    }

    public static synchronized IEmployee getInstance() {
        synchronized (Employee.class) {
            if(endPointService == null) {
                endPointService = new Employee();
            }
        }
        return endPointService;
    }

    @Override
    public com.puneet.dao.entity.Employee get() {
        return employees.get(0);
    }

    @Override
    public void set(com.puneet.dao.entity.Employee employee) {
        employees.add(employee);
    }
}
