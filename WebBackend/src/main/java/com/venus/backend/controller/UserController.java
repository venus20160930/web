package com.venus.backend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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

import com.venus.backend.dto.CreateUserDto;
import com.venus.backend.dto.UserDto;
import com.venus.backend.form.UserForm;
import com.venus.backend.service.RoleService;
import com.venus.backend.service.UserService;
import com.venus.backend.util.LoginUtil;

@Controller
@RequestMapping
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	//@Autowired
	//private RoleService roleService;
	
	@Autowired
	private ProviderSignInUtils providerSignInUtils;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "err",required = false) String error ){
         
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Login Error.");
        }else{
        	model.addObject("message", "Login Ok.");
        	
        }
 
        model.setViewName("login");
        return model;
    }
    
    
    
    @RequestMapping(value = "/manageUser", method = RequestMethod.GET)
    public ModelAndView manageUserPage() {
         
    	ModelAndView model = new ModelAndView();
    	
    	model.addObject("users", userService.findUsers());
    	
        model.setViewName("manageUser");
        return model;
    }
    

    @RequestMapping(value = "/user/create", method=RequestMethod.POST)
    public String create(@Validated @ModelAttribute("user") UserForm user, BindingResult result, WebRequest request, ModelMap map) {
    	
    	String target = "manageUser";
    	if (!result.hasErrors()) {
    		
    		CreateUserDto createUserDto = (CreateUserDto) toObject(user, CreateUserDto.class);
    		if (user.getAdminRole()) {
    			createUserDto.setRoleId(2);
			}else{
				
				createUserDto.setRoleId(1);
			}
        	
        	createUserDto.setState("1");
        	
        	userService.save(createUserDto);
        	
        	//LoginUtil.login(user.getEmail());
    		//providerSignInUtils.doPostSignUp(user.getEmail(), request);
        	return "redirect:/manageUser";
    	} else {
    		return "createUser";
    		
    	}
    	
        //return target;
    }
    
    @RequestMapping(value = "/user/create", method=RequestMethod.GET)
    public String create(WebRequest request, ModelMap map) {
    	
    	Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
    	
    	UserForm userForm = null;
    	if (connection != null) {
    		
    		userForm = (UserForm) toObject(connection.fetchUserProfile(), UserForm.class) ;
    	} else {
    		
    		userForm = new UserForm();
    	}
    	map.addAttribute("user", userForm);
    	
        return "createUser";
    }
}
