package com.teammaker.controller;

import com.teammaker.controller.dto.ProjectDto;
import com.teammaker.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * Created by Ярослав on 23.07.2017.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(value = "/new/save", method = RequestMethod.POST)
    public @ResponseBody ProjectDto saveTeam(@RequestBody ProjectDto projectDto) {
        projectDto.setName(projectDto.getName() + projectDto.getDescription());
        return projectDto;
    }
}
