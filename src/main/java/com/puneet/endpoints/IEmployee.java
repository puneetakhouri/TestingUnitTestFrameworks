package com.puneet.endpoints;

import com.puneet.modals.Employee;

public interface IEmployee<T extends Employee> {

    T get();

    void set(final T employee);
}
