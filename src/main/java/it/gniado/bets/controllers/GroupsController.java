package it.gniado.bets.controllers;

import java.util.List;

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

    private List<Team> groupA;
    private List<Team> selectedA;

    private List<Team> groupB;
    private List<Team> selectedB;

    private List<Team> groupC;
    private List<Team> selectedC;

    private List<Team> groupD;
    private List<Team> selectedD;

    private List<Team> groupE;
    private List<Team> selectedE;

    private List<Team> groupF;
    private List<Team> selectedF;

    private List<Team> groupG;
    private List<Team> selectedG;

    private List<Team> groupH;
    private List<Team> selectedH;

    @Inject
    private TeamsService teamsService;

    @PostConstruct
    public void init() {
        groupA = teamsService.getTeamsByGroup(Group.A);
        groupB = teamsService.getTeamsByGroup(Group.B);
        groupC = teamsService.getTeamsByGroup(Group.C);
        groupD = teamsService.getTeamsByGroup(Group.D);
        groupE = teamsService.getTeamsByGroup(Group.E);
        groupF = teamsService.getTeamsByGroup(Group.F);
        groupG = teamsService.getTeamsByGroup(Group.G);
        groupH = teamsService.getTeamsByGroup(Group.H);
    }

    public void check(){
        System.out.println("qwe");
    }

    public List<Team> getGroupA() {
        return groupA;
    }

    public void setGroupA(List<Team> groupA) {
        this.groupA = groupA;
    }

    public List<Team> getSelectedA() {
        return selectedA;
    }

    public void setSelectedA(List<Team> selectedA) {
        this.selectedA = selectedA;
    }

    public List<Team> getGroupB() {
        return groupB;
    }

    public void setGroupB(List<Team> groupB) {
        this.groupB = groupB;
    }

    public List<Team> getSelectedB() {
        return selectedB;
    }

    public void setSelectedB(List<Team> selectedB) {
        this.selectedB = selectedB;
    }

    public List<Team> getGroupC() {
        return groupC;
    }

    public void setGroupC(List<Team> groupC) {
        this.groupC = groupC;
    }

    public List<Team> getSelectedC() {
        return selectedC;
    }

    public void setSelectedC(List<Team> selectedC) {
        this.selectedC = selectedC;
    }

    public List<Team> getGroupD() {
        return groupD;
    }

    public void setGroupD(List<Team> groupD) {
        this.groupD = groupD;
    }

    public List<Team> getSelectedD() {
        return selectedD;
    }

    public void setSelectedD(List<Team> selectedD) {
        this.selectedD = selectedD;
    }

    public List<Team> getGroupE() {
        return groupE;
    }

    public void setGroupE(List<Team> groupE) {
        this.groupE = groupE;
    }

    public List<Team> getSelectedE() {
        return selectedE;
    }

    public void setSelectedE(List<Team> selectedE) {
        this.selectedE = selectedE;
    }

    public List<Team> getGroupF() {
        return groupF;
    }

    public void setGroupF(List<Team> groupF) {
        this.groupF = groupF;
    }

    public List<Team> getSelectedF() {
        return selectedF;
    }

    public void setSelectedF(List<Team> selectedF) {
        this.selectedF = selectedF;
    }

    public List<Team> getGroupG() {
        return groupG;
    }

    public void setGroupG(List<Team> groupG) {
        this.groupG = groupG;
    }

    public List<Team> getSelectedG() {
        return selectedG;
    }

    public void setSelectedG(List<Team> selectedG) {
        this.selectedG = selectedG;
    }

    public List<Team> getGroupH() {
        return groupH;
    }

    public void setGroupH(List<Team> groupH) {
        this.groupH = groupH;
    }

    public List<Team> getSelectedH() {
        return selectedH;
    }

    public void setSelectedH(List<Team> selectedH) {
        this.selectedH = selectedH;
    }
}
