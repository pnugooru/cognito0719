package org.cognito.tool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/login-error")
    public ModelAndView loginerror(){
    	//model.addAttribute("errorMessage", "Invalid Credintials");
    	ModelAndView model = new ModelAndView("login");
    	model.addObject("message", "Invalid credentials");
    	System.out.println("error checking");
        return model;
    }

    @GetMapping("/setupMFA")
    public String landingPage(){
        return "setup-mfa";
    }
    
    @GetMapping("/setupMFA1")
    public String page5(){
        return "setup-mfa1";
    }

    @GetMapping("/associateMFA")
    public String page2(){
        return "associate-mfa";
    }

    @GetMapping("/caseDocument")
    public String page3(){
        return "document-case";
    }
    
    @GetMapping("/caseDocument1")
    public String page4(){
        return "document-view";
    }
}
