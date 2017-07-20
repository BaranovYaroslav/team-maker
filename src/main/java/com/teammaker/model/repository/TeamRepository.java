package com.teammaker.model.repository;

import com.teammaker.model.entities.Team;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Primary
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
