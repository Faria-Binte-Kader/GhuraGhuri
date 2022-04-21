package com.example.ghuraghuri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlanLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planLocationId;
    private int planid;
    private int locationid;

    public int getPlanLocationId() {
        return planLocationId;
    }

    public void setPlanLocationId(int planLocationId) {
        this.planLocationId = planLocationId;
    }

    public int getPlanid() {
        return planid;
    }

    public void setPlanid(int planid) {
        this.planid = planid;
    }

    public PlanLocation(int planid, int locationid) {
        this.planid = planid;
        this.locationid = locationid;
    }

    public PlanLocation() {
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }
}
