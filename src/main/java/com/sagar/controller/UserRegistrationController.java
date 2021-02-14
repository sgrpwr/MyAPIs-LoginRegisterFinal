package com.sagar.controller;

import com.sagar.model.UserLogin;
import com.sagar.model.UserRegDTO;
import com.sagar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserRegistrationController {

    @Autowired
    UserService service;

    @RequestMapping("/registration")
    public ModelAndView register(){
        return new ModelAndView("register","objReg", new UserRegDTO()) ;
    }

    @ModelAttribute("countryList")
    public Map<String, String> countries(){
        Map<String, String> map = new HashMap<>();
        map.put("SI","Singapore");
        map.put("IN","India");
        map.put("CH","China");
        map.put("USA","United States of America");
        return map;
    }

    @RequestMapping("/processRegistration")
    public ModelAndView processReg(@ModelAttribute("objReg") UserRegDTO user){
        if (service.registerUser(user)){
            return new ModelAndView("login","objUser", new UserLogin()) ;
        }
        return new ModelAndView("register","objReg", new UserRegDTO("Registration Failed!!")) ;
    }
}
