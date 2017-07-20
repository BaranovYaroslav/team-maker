package com.teammaker.service;

import com.teammaker.model.entities.User;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
public interface UserService {

    public User saveUser(User user);

    public void deleteUser(User user);

    public User findUser(long id);

    public List<User> findAllUsers();
}
