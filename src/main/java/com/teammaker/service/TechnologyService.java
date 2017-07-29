package com.teammaker.service;

import com.teammaker.model.entities.Technology;

import java.util.List;

/**
 * Created by Ярослав on 22.07.2017.
 */
public interface TechnologyService {
    public Technology saveTechnology(Technology technology);

    public void deleteTechnology(Technology technology);

    public void deleteTechnology(long id);

    public  Technology findTechnology(long id);

    public List< Technology> findAllTechnologies();

    public Long getTechnologiesCount();
}
