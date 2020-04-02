package com.puneet.services;

public class Employee implements IEmployee<com.puneet.modals.Employee> {

    private static Employee endPointService = null;

    private Employee() {}

    public static synchronized IEmployee getInstance() {
        synchronized (Employee.class) {
            if(endPointService == null) {
                endPointService = new Employee();
            }
        }
        return endPointService;
    }

    @Override
    public com.puneet.modals.Employee get() {
        com.puneet.dao.IEmployee employeeDao = com.puneet.dao.Employee.getInstance();
        return translate(employeeDao.get());
    }

    @Override
    public void set(com.puneet.modals.Employee employee) {

        com.puneet.dao.IEmployee employeeDao = com.puneet.dao.Employee.getInstance();
        employeeDao.set(translate(employee));
    }

    private com.puneet.modals.Employee translate(com.puneet.dao.entity.Employee employee) {
        final com.puneet.modals.Employee employee1 = new com.puneet.modals.Employee();
        employee1.setAge(employee.getAge());
        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        return employee1;
    }

    private com.puneet.dao.entity.Employee translate(com.puneet.modals.Employee employee) {
        final com.puneet.dao.entity.Employee employee1 = new com.puneet.dao.entity.Employee();
        employee1.setAge(employee.getAge());
        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        return employee1;
    }
}
