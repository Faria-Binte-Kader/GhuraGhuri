package com.example.ghuraghuri.model;

import javax.persistence.*;

@Table(name = "note")
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long planid;
    private String description;

    public Note(Long planid, String description) {
        this.planid = planid;
        this.description = description;
    }

    public Note() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planid;
    }

    public void setPlanId(Long planid) {
        this.planid = planid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
