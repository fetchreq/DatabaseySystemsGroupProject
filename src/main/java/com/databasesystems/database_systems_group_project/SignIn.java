package com.databasesystems.database_systems_group_project;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "passenger")
public class SignIn {
    private String username;
    private String password;
    private String email;
    private Date DOB;
    private String firstName;
    private String lastName;
    private String phoneNum;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerID;

    public SignIn() {
    }

    public SignIn(String username, String password, String email, Date DOB, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.DOB = DOB;
        this.firstName = firstName;
        this.lastName = lastName;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
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
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Column
    public int getPassengerID() {
        return passengerID;
    }
}
