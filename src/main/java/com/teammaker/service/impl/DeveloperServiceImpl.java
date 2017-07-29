package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.Developer;
import com.teammaker.model.repository.DeveloperRepository;
import com.teammaker.service.DeveloperService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Service
@Transactional
public class DeveloperServiceImpl implements DeveloperService {
    @Autowired
    DeveloperRepository developerRepository;


    @Override
    public Developer saveDeveloper(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public void deleteDeveloper(Developer developer) {
        developerRepository.delete(developer);
    }

    @Override
    public void deleteDeveloper(long id) {
        deleteDeveloper(findDeveloper(id));
    }

    @Override
    public Developer findDeveloper(long id) {
        return developerRepository.findOne(id);
    }

    @Override
    public Developer findDeveloperWithProjects(long id) {
        return initializeProjects(findDeveloper(id));
    }


    @Override
    public List<Developer> findAllDevelopers() {
        return Lists.newArrayList(developerRepository.findAll());
    }

    @Override
    public List<Developer> findAllDevelopersWithProjects() {
        List<Developer> developers = findAllDevelopers();
        developers.forEach(this::initializeProjects);
        return developers;
    }

    @Override
    public Long getDevelopersCount() {
        return developerRepository.count();
    }

    private Developer initializeProjects(Developer developer) {
        Hibernate.initialize(developer.getProjects());
        return developer;
    }
}
