package com.venus.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.venus.common.dto.CreateUserDto;
import com.venus.frontend.form.UserForm;
import com.venus.frontend.service.RoleService;
import com.venus.frontend.service.UserService;

@Controller
@RequestMapping
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProviderSignInUtils providerSignInUtils;
    
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
    
    
    @RequestMapping(value = "/signin", method=RequestMethod.POST)
    public String create(@Validated @ModelAttribute("user") UserForm user, BindingResult result, WebRequest request, ModelMap map) {
    	
    	if (!result.hasErrors()) {
    		
    		CreateUserDto createUserDto = new CreateUserDto();
    		
    		createUserDto.setEmail(user.getEmail());
    		createUserDto.setFirstName(user.getFirstName());
    		createUserDto.setLastName(user.getLastName());
    		createUserDto.setPhone(user.getPhone());
    		createUserDto.setRoleId(1);
        	createUserDto.setState("1");
        	createUserDto.setPassword(user.getPassword());
        	userService.save(createUserDto);
        
        	return "redirect:/home";
    	} else {
    		return "registerUserView";
    		
    	}
    	
        //return target;
    }
    
    @RequestMapping(value = "/signin", method=RequestMethod.GET)
    public String create(WebRequest request, ModelMap map) {
    	
    	//Process scocial network
    	Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
    	
    	UserForm userForm = null;
    	if (connection != null) {
    		userForm = (UserForm) toObject(connection.fetchUserProfile(), UserForm.class) ;
    	} else {
    		
    		userForm = new UserForm();
    	}
    	map.addAttribute("user", userForm);
    	
        return "registerUserView";
    }
    
    @RequestMapping(value = "/signup", method=RequestMethod.GET)
    public String createUpTest(WebRequest request, ModelMap map) {
    	
    	//Process scocial network
    	Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
    	
    	UserForm userForm = null;
    	if (connection != null) {
    		userForm = new UserForm();
    		userForm.setEmail(connection.fetchUserProfile().getEmail());
    		userForm.setFirstName(connection.fetchUserProfile().getFirstName());
    		userForm.setLastName(connection.fetchUserProfile().getLastName());
    		
    		//userForm = (UserForm) toObject(connection.fetchUserProfile(), UserForm.class) ;
    	} else {
    		
    		userForm = new UserForm();
    	}
    	map.addAttribute("user", userForm);
    	
        return "registerUserView";
    }
    

}
