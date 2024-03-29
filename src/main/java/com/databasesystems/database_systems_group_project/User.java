package com.databasesystems.database_systems_group_project;


import javax.persistence.*;



@Entity
@Table(name = "passenger")
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isAdmin = false;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerID;

    public User() {
    }

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
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
    public int getPassengerID() {
        return passengerID;
    }


}
