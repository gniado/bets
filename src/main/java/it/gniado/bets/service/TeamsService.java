package it.gniado.bets.service;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import it.gniado.bets.dao.TeamsDao;
import it.gniado.bets.enums.Group;
import it.gniado.bets.mapper.TeamsMapper;
import it.gniado.bets.models.Team;

@Dependent
public class TeamsService {

    @EJB
    private TeamsDao teamsDao;

    @Inject
    private TeamsMapper teamsMapper;

    public List<Team> getTeams() {
        return teamsMapper.mapDbosToModels(teamsDao.getAllTeams());
    }

    public List<Team> getTeamsByGroup(Group group){
        return teamsMapper.mapDbosToModels(teamsDao.getTeamsByGroup(group));
    }

}
