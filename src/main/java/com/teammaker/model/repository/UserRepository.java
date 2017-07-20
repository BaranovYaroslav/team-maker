package com.teammaker.model.repository;

import com.teammaker.model.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
