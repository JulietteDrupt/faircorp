package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length=255)
    private String name;

    @Column(nullable = false)
    private Integer floor;

    @OneToMany
    private List<Light> lights;

    @ManyToOne
    private Building building;


    public Room() {
    }

    public Room(String name, Integer floor, List<Light> lights) {
        this.name = name;
        this.floor = floor;
        this.lights = lights;
    }

    public Room(Building building, String name, Integer floor) {
        this.building = building;
        this.name = name;
        this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<Light> getLights() {
        return this.lights;
    }

    public void setLights(List<Light> lights) {
        this.lights = lights;
    }

    public Building getBuilding() {
        return this.building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}