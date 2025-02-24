package com.gymapp.gym_app.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gym {
    public Gym() {
    }

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("membership_type")
    private String membership_type;

    @JsonProperty("status")
    private String status;

    @JsonProperty("plan")
    private String plan;

    public Gym(String id, String name, String membership_type, String status, String plan) {
        this.id = id;
        this.name = name;
        this.membership_type = membership_type;
        this.status = status;
        this.plan = plan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public void setMembership_type(String membership_type) {
        this.membership_type = membership_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
