package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.Team;
import com.teammaker.model.entities.Developer;
import com.teammaker.model.repository.TeamRepository;
import com.teammaker.service.TeamService;
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
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamRepository teamRepository;

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Team team) {
        teamRepository.delete(team);
    }

    @Override
    public Team findTeam(long id) {
        return teamRepository.findOne(id);
    }

    @Override
    public List<Team> findAllTeams() {
        return Lists.newArrayList(teamRepository.findAll());
    }
}
