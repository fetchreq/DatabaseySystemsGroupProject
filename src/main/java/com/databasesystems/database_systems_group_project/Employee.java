package com.databasesystems.database_systems_group_project;


import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "employee")
public class Employee {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Date hireDate;
    private int salary;
    private int departmentID;
    private boolean isAdmin = true;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;

    public Employee() {
    }

    public Employee(String username, String password, String firstName, String lastName, Date hireDate, int salary, int departmentID) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
        this.departmentID = departmentID;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column
    public Date gethireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Column
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Column
    public int getDepartmentID() {
        return this.departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    @Column
    public int getPassengerID() {
        return employeeID;
    }


}
