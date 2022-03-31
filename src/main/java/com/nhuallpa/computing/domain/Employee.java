package com.nhuallpa.computing.domain;

import java.util.Objects;

public class Employee {

    private long employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee(long employeeNumber, String firstName, String lastName, String emailId) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmployeeNumber() == employee.getEmployeeNumber() && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getEmailId(), employee.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeNumber(), getFirstName(), getLastName(), getEmailId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
