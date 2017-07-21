package com.teammaker.service;

import com.teammaker.model.entities.Team;
import com.teammaker.model.entities.Developer;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface TeamService {
    public Team saveTeam(Team team);

    public void deleteTeam(Team team);

    public Team findTeam(long id);

    public List<Team> findAllTeams();

    public Team findTeamWithInitialization(long id);

    public List<Team> findAllTeamsWithInitialization();

}
