package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.Team;
import com.teammaker.model.repository.TeamRepository;
import com.teammaker.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> findAll() {
        System.out.println(213124124);
        return Lists.newArrayList(teamRepository.findAll());
    }
}
