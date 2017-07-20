package com.teammaker.service.impl;

import com.google.common.collect.Lists;
import com.teammaker.model.entities.User;
import com.teammaker.model.repository.UserRepository;
import com.teammaker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User findUser(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }
}
