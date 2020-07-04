package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    // Class Fields

    @NotBlank(message = "Location is required!")
    @Size(max = 255, message = "Location cannot exceed 255 characters!")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    // Class Constructors

    public Employer() {

    }

    // Getters & Setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}