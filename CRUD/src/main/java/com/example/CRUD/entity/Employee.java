package com.example.CRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePackage;
    private String employeeContactNumber;
    private String employeeAddress;
    private String employeeGender;
    private String employeeDepartment;
    private String employeeSkills;

    public Employee() {

    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeePackage(String employeePackage) {
        this.employeePackage = employeePackage;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeePackage() {
        return employeePackage;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }
}
