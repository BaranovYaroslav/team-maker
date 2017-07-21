package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.Project;
import com.teammaker.model.repository.ProjectRepository;
import com.teammaker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ярослав on 21.07.2017.
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(Project project) {
        projectRepository.delete(project);
    }

    @Override
    public Project findProject(long id) {
        return projectRepository.findOne(id);
    }

    @Override
    public List<Project> findAllProjects() {
        return Lists.newArrayList(projectRepository.findAll());
    }

    @Override
    public Long getProjectsCount() {
        return projectRepository.count();
    }
}
