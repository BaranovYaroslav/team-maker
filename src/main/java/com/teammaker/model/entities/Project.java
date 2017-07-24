package com.teammaker.model.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ярослав on 20.07.2017.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(name = "developer_project",
            joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "developer_id",referencedColumnName = "id"))
    private List<Technology> developers;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "technology_project",
            joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "technology_id",referencedColumnName = "id"))
    private List<Technology> technologies;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Technology> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Technology> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
