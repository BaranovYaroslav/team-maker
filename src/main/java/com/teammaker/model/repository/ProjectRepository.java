package com.teammaker.model.repository;

import com.teammaker.model.entities.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ярослав on 21.07.2017.
 */
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
