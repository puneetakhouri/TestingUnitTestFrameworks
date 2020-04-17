package com.puneet.endpoints.test;

import com.puneet.modals.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {

    @Test
    public void testSet() {
        com.puneet.services.IEmployee<Employee> service = com.puneet.services.Employee.getInstance();

        final Employee emp = new Employee("abc", 234, 546);
        service.set(emp);

        assertEquals(emp, service.get());
    }

    @Test
    public void testEndPoint() {
        com.puneet.endpoints.IEmployee<Employee> service = new com.puneet.endpoints.Employee();
        final Employee emp = new Employee("abc", 234, 546);
        service.set(emp);
        assertEquals(emp, service.get());
    }
}
