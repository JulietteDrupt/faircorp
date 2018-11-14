package com.esme.spring.faircorp.model;

public class BuildingDto {

    private Long id;

    public BuildingDto() {
    }

    public BuildingDto(Building buiding) {
        this.id = buiding.getId();
    }

    public Long getId() {
        return this.id;
    }

}
