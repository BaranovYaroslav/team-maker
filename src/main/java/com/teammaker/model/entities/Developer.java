package com.teammaker.model.entities;

import com.google.common.base.Objects;
import com.teammaker.controller.dto.DeveloperDto;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;

    private String email;

    @Column(name = "password")
    private String password;

    @ManyToMany(mappedBy = "developers")
    private List<Project> projects;

    public Developer() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static Developer of(DeveloperDto developerDto) {
        Developer developer = new Developer();
        developer.setLogin(developerDto.getLogin());
        developer.setEmail(developerDto.getEmail());
        developer.setPassword(developerDto.getPassword());
        return developer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, email, login, password);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equal(this, obj);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "password='" + password + '\'' +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
