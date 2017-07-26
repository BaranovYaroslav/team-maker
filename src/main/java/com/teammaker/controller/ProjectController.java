package com.teammaker.controller;

import com.teammaker.controller.dto.ProjectDto;
import com.teammaker.model.entities.Project;
import com.teammaker.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

/**
 * Created by Ярослав on 23.07.2017.
 */
@Controller
@RequestMapping("/projects")
public class ProjectController {
    private static Logger LOGGER = LogManager.getLogger(ProjectController.class);

    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody ProjectDto saveProject(@Valid @RequestBody ProjectDto projectDto) {
        Project project = projectService.saveProject(Project.of(projectDto));
        return ProjectDto.of(project);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable long id) {
        projectService.deleteProject(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody ProjectDto findProject(@PathVariable long id) {
        return ProjectDto.of(projectService.findProject(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody ProjectDto updateProject(@Valid @RequestBody ProjectDto projectDto, @PathVariable long id){
        Project project = Project.of(projectDto);
        project.setId(id);
        return ProjectDto.of(projectService.saveProject(project));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<ProjectDto> findAllProjects() {
        List<ProjectDto> projects = new ArrayList<>();
        projectService.findAllProjects().forEach(p -> projects.add(ProjectDto.of(p)));
        return projects;
    }

}
