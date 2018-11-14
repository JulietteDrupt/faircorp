package com.esme.spring.faircorp.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingDaoImpl implements BuildingDaoCustom {
    @Override
    public List<Room> findAllRooms (Long buildingId) {
        String jpql = "select ro.id from room where ro."
    }
}
