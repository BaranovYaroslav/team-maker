package com.teammaker.controller.dto;

/**
 * Created by Ярослав on 22.07.2017.
 */
public class InfoDto {
    private Long teamsNumber;

    private Long developersNumber;

    private Long projectsNumber;

    public Long getTeamsNumber() {
        return teamsNumber;
    }

    public void setTeamsNumber(Long teamsNumber) {
        this.teamsNumber = teamsNumber;
    }

    public Long getDevelopersNumber() {
        return developersNumber;
    }

    public void setDevelopersNumber(Long developersNumber) {
        this.developersNumber = developersNumber;
    }

    public Long getProjectsNumber() {
        return projectsNumber;
    }

    public void setProjectsNumber(Long projectsNumber) {
        this.projectsNumber = projectsNumber;
    }
}
