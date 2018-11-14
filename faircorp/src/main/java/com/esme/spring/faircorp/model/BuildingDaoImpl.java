package com.esme.spring.faircorp.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class BuildingDaoImpl implements BuildingDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    RoomDao roomDao;

    @Override
    public List<Light> findAllLights(Long buildingId) {
        String jpql1 = "select ro from Rooms ro where ro.Building_id = :value";
        List<Room> rooms = em.createQuery(jpql1, Room.class)
                .setParameter("value", buildingId)
                .getResultList();
        List<Light> allLights = new ArrayList<Light>();
        for (int i=0;i<rooms.size();i++) {
            List<Light> lights = roomDao.findLights(rooms.get(i).getId());
            allLights.addAll(lights);
        }
        return allLights;
    }
}
