package it.gniado.bets.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;

import com.google.common.collect.Lists;

import it.gniado.bets.dao.TeamsDao;
import it.gniado.bets.enums.Group;
import it.gniado.bets.models.Team;

@Dependent
public class TeamsService {

    @EJB
    private TeamsDao teamsDao;

    public List<Team> getTeams() {
        List<it.gniado.bets.dbo.Team> dbTeams = teamsDao.getAllTeams();
        List<Team> teams = Lists.newArrayList();
        for (it.gniado.bets.dbo.Team team : dbTeams) {
            teams.add(new Team(team.getId(), team.getName(), team.getTeamGroup()));
        }
        return teams;
    }

    public Map<Group, List<Team>> getGroupsWithTeams() {
        List<it.gniado.bets.dbo.Team> dbTeams = teamsDao.getAllTeams();
        Map<Group, List<Team>> groupsWithTeams = new HashMap<>();
        for (it.gniado.bets.dbo.Team team : dbTeams) {
            if (groupsWithTeams.containsKey(team.getTeamGroup())) {
                for (Map.Entry<Group, List<Team>> entry : groupsWithTeams.entrySet()) {
                    if (entry.getKey().equals(team.getTeamGroup())) {
                        entry.getValue().add(new Team(team.getId(), team.getName(), team.getTeamGroup()));
                    }
                }
            } else {
                groupsWithTeams.put(team.getTeamGroup(), Lists.newArrayList(new Team(team.getId(), team.getName(), team.getTeamGroup())));
            }
        }

        return new TreeMap<>(groupsWithTeams);
    }

}



























