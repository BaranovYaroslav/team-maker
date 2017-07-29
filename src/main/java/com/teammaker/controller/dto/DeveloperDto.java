package com.teammaker.controller.dto;

import com.teammaker.model.entities.Developer;
import com.teammaker.model.entities.Project;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 29.07.2017.
 */
public class DeveloperDto {
    @Length(min = 5, max = 45)
    private String login;

    @NotBlank
    @Email
    private String email;

    @Length(min = 5, max = 45)
    private String password;

    private List<ProjectDto> projects;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDto> projects) {
        this.projects = projects;
    }

    public static DeveloperDto of(Developer developer) {
        DeveloperDto developerDto = new DeveloperDto();
        developerDto.setLogin(developer.getLogin());
        developerDto.setEmail(developer.getEmail());
        developerDto.setPassword(developer.getPassword());
        developerDto.setProjects(getProjectsDtos(developer.getProjects()));
        return developerDto;
    }

    public static List<ProjectDto> getProjectsDtos(List<Project> projects) {
        List<ProjectDto> projectDtos = new ArrayList<>();
        if(projects != null) {
            projects.forEach(p -> projectDtos.add(ProjectDto.of(p)));
        }
        return projectDtos;
    }
}
