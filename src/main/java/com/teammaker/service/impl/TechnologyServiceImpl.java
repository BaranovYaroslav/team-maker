package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.Technology;
import com.teammaker.model.repository.TechnologyRepository;
import com.teammaker.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ярослав on 22.07.2017.
 */
@Service
@Transactional
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    TechnologyRepository technologyRepository;

    @Override
    public Technology saveTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Override
    public void deleteTechnology(Technology technology) {
        technologyRepository.delete(technology);
    }

    @Override
    public Technology findTechnology(long id) {
        return technologyRepository.findOne(id);
    }

    @Override
    public List<Technology> findAllTechnologies() {
        return Lists.newArrayList(technologyRepository.findAll());
    }

    @Override
    public Long getTechnologiesCount() {
        return technologyRepository.count();
    }
}
