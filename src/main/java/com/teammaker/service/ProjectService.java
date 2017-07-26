package com.teammaker.service;

import com.teammaker.model.entities.Project;

import java.util.List;

/**
 * Created by Ярослав on 21.07.2017.
 */
public interface ProjectService {
    public Project saveProject(Project project);

    public void deleteProject(Project project);

    public void deleteProject(long id);

    public Project findProject(long id);

    public List<Project> findAllProjects();

    public Long getProjectsCount();
}
