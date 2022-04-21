package com.example.ghuraghuri.model;

import javax.persistence.*;

@Entity
@Table(name="planlocation")
public class PlanLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planlocationid;
    private int planid;
    private int locationid;

    public PlanLocation(int planid, int locationid, String locationame) {
        this.planid = planid;
        this.locationid = locationid;
        this.locationame = locationame;
    }

    private String locationame;



    public int getPlanid() {
        return planid;
    }

    public void setPlanid(int planid) {
        this.planid = planid;
    }

    public int getPlanlocationid() {
        return planlocationid;
    }

    public void setPlanlocationid(int planlocationid) {
        this.planlocationid = planlocationid;
    }

    public String getLocationame() {
        return locationame;
    }

    public void setLocationame(String locationame) {
        this.locationame = locationame;
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
