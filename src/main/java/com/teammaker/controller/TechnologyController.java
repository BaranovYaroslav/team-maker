package com.teammaker.controller;

import com.teammaker.model.entities.Technology;
import com.teammaker.service.impl.TechnologyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ярослав on 22.07.2017.
 */
@Controller
@RequestMapping("/technology")
public class TechnologyController {
    @Autowired
    TechnologyServiceImpl technologyService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Technology> getAll() {
        return technologyService.findAllTechnologies();
    }
}
