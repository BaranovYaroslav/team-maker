package com.teammaker.model.entities;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Entity
@Table(name = "user")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;

    private String email;

    @Column(name = "password")
    private String passwordHash;

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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, email, login, passwordHash);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equal(this, obj);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "passwordHash='" + passwordHash + '\'' +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
