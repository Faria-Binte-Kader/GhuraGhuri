package com.example.ghuraghuri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int planid;
    private int locationid;
    private String locationname;

    public test() {
    }

    public test(int planid, int locationid, String locationname) {
        this.planid = planid;
        this.locationid = locationid;
        this.locationname = locationname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanid() {
        return planid;
    }

    public void setPlanid(int planid) {
        this.planid = planid;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }
}
