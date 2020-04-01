package com.puneet.endpoints;

public class Employee implements IEmployee {
    @Override
    public com.puneet.modals.Employee get() {
        final com.puneet.services.IEmployee endPointService = com.puneet.services.Employee.getInstance();
        return endPointService.get();
    }

    @Override
    public void set(final com.puneet.modals.Employee employee) {
        final com.puneet.services.IEmployee endPointService = com.puneet.services.Employee.getInstance();
        endPointService.set(employee);

    }
}
