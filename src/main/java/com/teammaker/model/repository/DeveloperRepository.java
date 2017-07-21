package com.teammaker.model.repository;

import com.teammaker.model.entities.Developer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface DeveloperRepository extends CrudRepository<Developer, Long> {
}
