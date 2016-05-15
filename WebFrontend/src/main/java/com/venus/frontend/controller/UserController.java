package com.venus.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class UserController extends BaseController {
	
	//@Autowired
	//private UserService userService;
	
	//@Autowired
	//private RoleService roleService;
	
	//@Autowired
	//private ProviderSignInUtils providerSignInUtils;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "err",required = false) String error,
    @RequestParam(value = "logout", required = false) String logout) {
         
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Login Error.");
        }
 
        if (logout != null) {
            model.addObject("message", "Login Ok.");
        }
 
        model.setViewName("login");
        return model;
    }
    

}
