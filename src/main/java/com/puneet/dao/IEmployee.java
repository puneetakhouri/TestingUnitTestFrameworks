package com.puneet.dao;

import com.puneet.dao.entity.Employee;

public interface IEmployee<T extends Employee> {

    T get();

    void set(final T employee);
}
