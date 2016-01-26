package com.clevertoday.bnc.service;

import com.clevertoday.bnc.model.Visitor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

/**
 * Created by bargenson on 2016-01-23.
 */
@Stateless
public class VisitorService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Visitor> getVisitors() {
        return entityManager.createQuery("SELECT v FROM Visitor v").getResultList();
    }

    public void addVisitor(String address, String userAgent) {
        entityManager.persist(new Visitor(address, userAgent, new Date()));
    }

}
