package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BUILDING")
public class Building {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @OneToMany
    private List<Room> rooms;

    public Building() {
    }

    public Building(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
