package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RoomDaoImpl implements RoomDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Room> findRoom(String name) {
        String jpql = "select ro from Room ro where ro.name = :value";
        return em.createQuery(jpql, Room.class)
                .setParameter("value", name)
                .getResultList();
    }

    public List<Light> findLights(Long id) {
        String jpql = "select lt from Light lt where lt.roomId = :value";
        return em.createQuery(jpql, Light.class)
                .setParameter("value", id)
                .getResultList();
    }
}
