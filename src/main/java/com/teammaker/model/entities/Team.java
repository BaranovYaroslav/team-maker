package com.teammaker.model.entities;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "user_team",
               joinColumns = @JoinColumn(name = "team_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"))
    private List<Developer> participants;

    @OneToMany(mappedBy = "team")
    private List<Project> projects;

    public Team() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Developer> participants) {
        this.participants = participants;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equal(this, obj);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
