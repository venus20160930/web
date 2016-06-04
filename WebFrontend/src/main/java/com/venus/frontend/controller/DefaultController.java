package com.venus.frontend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DefaultController  extends BaseController{
	
	// config default controller
	@RequestMapping(method = RequestMethod.GET)
    public String wellcome() {
		return "home";
    }

}