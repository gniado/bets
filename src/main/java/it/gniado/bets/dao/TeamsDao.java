package it.gniado.bets.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import it.gniado.bets.dbo.Team;

@LocalBean
@Stateless
public class TeamsDao extends AbstractDao<Team> {

    @SuppressWarnings("unchecked")
    public List<Team> getAllTeams() {
        Query query = em.createQuery("SELECT t FROM Team t ORDER BY t.teamGroup DESC");
        return query.getResultList();
    }

}
