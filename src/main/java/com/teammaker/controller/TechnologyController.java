package com.teammaker.controller;

import com.teammaker.controller.dto.ProjectDto;
import com.teammaker.controller.dto.TechnologyDto;
import com.teammaker.model.entities.Project;
import com.teammaker.model.entities.Technology;
import com.teammaker.service.impl.TechnologyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 22.07.2017.
 */
@Controller
@RequestMapping("/technologies")
public class TechnologyController {
    @Autowired
    TechnologyServiceImpl technologyService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    TechnologyDto saveTechnology(@Valid @RequestBody TechnologyDto technologyDto) {
        Technology technology = technologyService.saveTechnology(Technology.of(technologyDto));
        return TechnologyDto.of(technology);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTechnology(@PathVariable long id) {
        technologyService.deleteTechnology(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody TechnologyDto findTechnology(@PathVariable long id) {
        return TechnologyDto.of(technologyService.findTechnology(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody TechnologyDto updateTechnology(@Valid @RequestBody TechnologyDto technologyDto, @PathVariable long id){
        Technology technology = Technology.of(technologyDto);
        technology.setId(id);
        return TechnologyDto.of(technologyService.saveTechnology(technology));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<TechnologyDto> findAllTechnologies() {
        List<TechnologyDto> technologies = new ArrayList<>();
        technologyService.findAllTechnologies().forEach(t -> technologies.add(TechnologyDto.of(t)));
        return technologies;
    }
}
