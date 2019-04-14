package com.databasesystems.database_systems_group_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WebController {
    @Autowired
    private UserService userService;

   @RequestMapping({"/", "/home"})
    public String display(){
       return "home";
   }

    @GetMapping("/signIn")
    public String displaySignIn(){
        return "signIn";
    }
    @PostMapping("/signIn")
    public String postSingIn(@ModelAttribute SignIn signIn){
       return "home";
    }

    @GetMapping("/signUp")
    public Model displaySignUpForm(Model model) {
        //ModelAndView mv =  new ModelAndView("signUp");
        model.addAttribute("signUp", new NewSignUp());
        return model;
    }

    @PostMapping("/signUp")
    public String postSignUpForm(@ModelAttribute NewSignUp newUser) {
        System.out.println(newUser.getUsername());

        if (userService.userValid()) {
            userService.createUser(newUser);
            return "redirect:home";
        }

        return "signUp";

    }

    @RequestMapping("/search")
    public String displaySearch(){
        return "search";
    }

}
