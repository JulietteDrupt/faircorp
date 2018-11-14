package com.esme.spring.faircorp.model;

import java.util.List;

public interface BuildingDaoCustom {
    List<Room> findAllRooms (Long buildingId);
    List<Light> findAllLights (Long buildingId);
}
