package com.databasesystems.database_systems_group_project;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "flight")
public class Search implements Serializable {
    @Column(name = "take_off")
    private String takeOff;
    @Column(name = "dest")
    private String destination;
    @Column(name = "planeID")
    private int planeID;
    @Column(name = "crewID")
    private int crewID;
    @Column(name = "cost")
    private double cost;
    @Column(name = "take_off_time")
    private String takeOffTime;
    @Column(name = "take_off_date")
    private Date takeOffDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightNum;

    public Search() {

    }

    public String getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(String takeOff) {
        this.takeOff = takeOff;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPlaneID() {
        return planeID;
    }

    public void setPlaneID(int planeID) {
        this.planeID = planeID;
    }

    public int getCrewID() {
        return crewID;
    }

    public void setCrewID(int crewID) {
        this.crewID = crewID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public Date getTakeOffDate() {
        return takeOffDate;
    }

    public void setTakeOffDate(Date takeOffDate) {
        this.takeOffDate = takeOffDate;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }


}
