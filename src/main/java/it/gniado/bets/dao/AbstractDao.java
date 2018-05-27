package it.gniado.bets.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.Validate;

@Stateless
@LocalBean
public class AbstractDao<T> {

    @PersistenceContext(name = "BetsPersistence")
    protected EntityManager em;

    public T write(T entity) {
        Validate.notNull(entity, "Entity cannot be null");
        T savedEntity = null;
        em.persist(entity);
        savedEntity = entity;
        return savedEntity;
    }

}
