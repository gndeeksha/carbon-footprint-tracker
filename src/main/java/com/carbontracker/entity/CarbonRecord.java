package com.carbontracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name="carbon_record")
public class CarbonRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;
    private int activityId;
    private double co2Emission;

    public CarbonRecord(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }
}