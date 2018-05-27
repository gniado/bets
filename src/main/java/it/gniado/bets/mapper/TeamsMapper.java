package it.gniado.bets.mapper;

import java.util.List;

import javax.enterprise.context.Dependent;

import com.google.common.collect.Lists;

import it.gniado.bets.models.Team;

@Dependent
public class TeamsMapper {

    public Team mapDboToModel(it.gniado.bets.dbo.Team team){
        return new Team(team.getId(), team.getName(), team.getTeamGroup());
    }

    public List<Team> mapDbosToModels(List<it.gniado.bets.dbo.Team> teams) {
        List<Team> models = Lists.newArrayList();
        for (it.gniado.bets.dbo.Team team : teams){
            models.add(mapDboToModel(team));
        }
        return models;
    }

}
