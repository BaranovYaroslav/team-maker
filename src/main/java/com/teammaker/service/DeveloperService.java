package com.teammaker.service;

import com.teammaker.model.entities.Developer;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface DeveloperService {
    public Developer saveDeveloper(Developer developer);

    public void deleteDeveloper(Developer developer);

    public void deleteDeveloper(long id);

    public Developer findDeveloper(long id);

    public Developer findDeveloperWithProjects(long id);

    public List<Developer> findAllDevelopers();

    public List<Developer> findAllDevelopersWithProjects();

    public Long getDevelopersCount();
}
