package it.gniado.bets.controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import it.gniado.bets.enums.Group;
import it.gniado.bets.models.Team;
import it.gniado.bets.service.TeamsService;

@ManagedBean(name = "groupsController")
@SessionScoped
public class GroupsController {

    private List<Team> teams;
    private Map<Group, List<Team>> groups;

    private final TeamsService teamsService;

    @Inject
    public GroupsController(TeamsService teamsService) {
        this.teamsService = teamsService;
    }

    @PostConstruct
    public void init() {
        teams = teamsService.getTeams();
        groups = teamsService.getGroupsWithTeams();
    }

    public List<Team> getTeams() {
        return teams;
    }
}
