package com.teammaker.service;

import com.teammaker.model.entities.Developer;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface DeveloperService {
    public Developer saveDeveloper(Developer developer);

    public void deleteDeveloper(Developer developer);

    public Developer findDeveloper(long id);

    public Developer findDeveloperWithTeams(long id);

    public List<Developer> findAllDevelopers();
}
