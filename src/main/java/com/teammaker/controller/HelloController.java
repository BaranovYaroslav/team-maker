package com.teammaker.controller;

import com.teammaker.service.DeveloperService;
import com.teammaker.service.impl.DeveloperServiceImpl;
import com.teammaker.service.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	TeamServiceImpl teamService;

	@Autowired
	DeveloperServiceImpl developerService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	public void foo() {
		System.out.println(developerService.findDeveloperWithTeams(1).getTeams());
	}
}