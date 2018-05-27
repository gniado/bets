package it.gniado.bets.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import it.gniado.bets.dbo.Team;
import it.gniado.bets.enums.Group;

@LocalBean
@Stateless
public class TeamsDao extends AbstractDao<Team> {

    @SuppressWarnings("unchecked")
    public List<Team> getAllTeams() {
        Query query = em.createQuery("SELECT t FROM Team t ORDER BY t.teamGroup");
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Team> getTeamsByGroup(Group group){
        Query query = em.createQuery("SELECT t FROM Team t WHERE t.teamGroup = :group");
        query.setParameter("group", group);
        return query.getResultList();
    }

}
