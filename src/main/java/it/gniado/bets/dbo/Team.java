package it.gniado.bets.dbo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import it.gniado.bets.enums.Group;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Group teamGroup;

    private Boolean promoted;

    public Team() {
    }

    public Team(String name, Boolean promoted, Group teamGroup) {
        this.name = name;
        this.promoted = promoted;
        this.teamGroup = teamGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getTeamGroup() {
        return teamGroup;
    }

    public void setTeamGroup(Group group) {
        this.teamGroup = group;
    }

    public Boolean getPromoted() {
        return promoted;
    }

    public void setPromoted(Boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id).append("name", name).append("teamGroup", teamGroup).append("promoted", promoted).toString();
    }
}
