package com.teammaker.controller;

import com.teammaker.controller.dto.DeveloperDto;
import com.teammaker.model.entities.Developer;
import com.teammaker.service.impl.DeveloperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 29.07.2017.
 */
@Controller
@RequestMapping("/developers")
public class DeveloperController {
    @Autowired
    DeveloperServiceImpl developerService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    DeveloperDto saveDeveloper(@Valid @RequestBody DeveloperDto developerDto) {
        Developer developer = developerService.saveDeveloper(Developer.of(developerDto));
        return DeveloperDto.of(developer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteDeveloper(@PathVariable long id) {
        developerService.deleteDeveloper(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody DeveloperDto findDeveloper(@PathVariable long id) {
        return DeveloperDto.of(developerService.findDeveloperWithProjects(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody DeveloperDto updateDeveloper(@Valid @RequestBody DeveloperDto developerDto, @PathVariable long id){
        Developer developer = Developer.of(developerDto);
        developer.setId(id);
        return DeveloperDto.of(developerService.saveDeveloper(developer));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<DeveloperDto> findAllDevelopers() {
        List<DeveloperDto> developers = new ArrayList<>();
        developerService.findAllDevelopersWithProjects().forEach(d -> developers.add(DeveloperDto.of(d)));
        return developers;
    }
}
