package com.puneet.services;

import com.puneet.modals.Employee;

public interface IEmployee<T extends Employee> {

    T get();

    void set(final T employee);
}
