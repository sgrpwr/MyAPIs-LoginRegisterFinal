package com.sagar.controller;

import com.sagar.model.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@ModelAttribute("objUser") UserLogin user){
        return "login";
    }

    @RequestMapping("/login-panel")
    public String home(@ModelAttribute("objUser") UserLogin login, Model model,
                       @RequestParam("action") String click) {
        System.out.print(click);
        if (click.equalsIgnoreCase("login")) {
            if (login.getUserName().contentEquals("admin") &&
                    login.getUserPasswd().contentEquals("123")) {
                return "home";
            }
            else {
                model.addAttribute("msg", "Invalid!!");
                return "login";
            }
        }
        else if (click.equalsIgnoreCase("register now")){
            return "redirect:/registration";
        }
        return "login";
    }
}
