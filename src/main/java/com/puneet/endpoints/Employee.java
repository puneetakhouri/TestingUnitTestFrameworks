package com.puneet.endpoints;

public class Employee implements IEmployee {
    @Override
    public com.puneet.modals.Employee get() {
        System.out.println("Adding something for pr on feature branch");
        final com.puneet.services.IEmployee endPointService = com.puneet.services.Employee.getInstance();
        return endPointService.get();
    }

    @Override
    public void set(final com.puneet.modals.Employee employee) {
        final com.puneet.services.IEmployee endPointService = com.puneet.services.Employee.getInstance();
        endPointService.set(employee);
        System.out.println("Testing the pr builds");
    }
}
