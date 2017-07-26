package com.teammaker.controller.dto;

import com.teammaker.model.entities.Project;
import org.hibernate.validator.constraints.Length;

/**
 * Created by Ярослав on 23.07.2017.
 */
public class ProjectDto {
    @Length(min = 3, max = 35)
    private String name;

    @Length(min = 5, max = 1000)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ProjectDto of(Project project) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(project.getName());
        projectDto.setDescription(project.getDescription());
        return projectDto;
    }
}
