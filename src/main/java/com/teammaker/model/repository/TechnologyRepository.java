package com.teammaker.model.repository;

import com.teammaker.model.entities.Technology;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ярослав on 22.07.2017.
 */
public interface TechnologyRepository extends CrudRepository<Technology, Long> {
}
