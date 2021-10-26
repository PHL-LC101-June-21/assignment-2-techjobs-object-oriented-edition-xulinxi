package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++; // generating unique id
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    @Override
    public String toString() {
        final String NULL_MSG = "Data not available";
        String id = String.valueOf(this.getId());
        String name = String.valueOf(this.getName());
        String employer = String.valueOf(this.getEmployer());
        String location = String.valueOf(this.getLocation());
        String positionType = String.valueOf(this.getPositionType());
        String coreCompetency = String.valueOf(this.getCoreCompetency());

        return "\nID: " + id + '\n' +
                "Name: " + (!name.isEmpty() ? name : NULL_MSG) + '\n' +
                "Employer: " + (!employer.isEmpty() ? employer : NULL_MSG) + '\n' +
                "Location: " + (!location.isEmpty() ? location : NULL_MSG)  + '\n' +
                "Position Type: " + (!positionType.isEmpty() ? positionType : NULL_MSG)  + '\n' +
                "Core Competency: " + (!coreCompetency.isEmpty() ? coreCompetency : NULL_MSG)  +
                '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }




    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }
}















