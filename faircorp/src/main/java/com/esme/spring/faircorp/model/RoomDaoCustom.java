package com.esme.spring.faircorp.model;

import java.util.List;

public interface RoomDaoCustom {
    List<Room> findRoom(String name);
    List<Light> findLights(Long id);
}
