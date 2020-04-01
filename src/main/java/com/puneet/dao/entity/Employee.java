package com.puneet.dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private String name;
    private int id;
    private int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                age == employee.age &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }
}
