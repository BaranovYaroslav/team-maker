package com.teammaker.controller;

import com.teammaker.controller.dto.InfoDto;
import com.teammaker.service.impl.DeveloperServiceImpl;
import com.teammaker.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ярослав on 22.07.2017.
 */
@Controller
@RequestMapping("/info")
public class InfoController {
    @Autowired
    DeveloperServiceImpl developerService;

    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody InfoDto getInfoInJSON() {
        InfoDto infoDto = new InfoDto();
        infoDto.setDevelopersNumber(developerService.getDevelopersCount());
        infoDto.setProjectsNumber(projectService.getProjectsCount());
        return infoDto;
    }
}
