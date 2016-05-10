package com.venus.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

	// config default controller
	@RequestMapping(method = RequestMethod.GET)
    public String home() {
    	return "home"; 
    }

}