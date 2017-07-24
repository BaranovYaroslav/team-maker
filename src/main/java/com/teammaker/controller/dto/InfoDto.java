package com.teammaker.controller.dto;

/**
 * Created by Ярослав on 22.07.2017.
 */
public class InfoDto {
    private Long developersNumber;

    private Long projectsNumber;

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
