package com.databasesystems.database_systems_group_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class WebController {
    @Autowired
    private UserService userService;
    @Autowired
    private SearchService searchService;

   @RequestMapping({"/", "/home"})
   public String display(Model model) {
       //model.addAttribute("name","Ryan");
       return "home";
   }

    @GetMapping("/signIn")
    public String displaySignIn(Model model) {
        model.addAttribute("signIn", new User());
        return "signIn";
    }
    @PostMapping("/signIn")
    public String postSingIn(@ModelAttribute User signIn) {
        if (userService.userSignInValid(signIn)) {
            return "redirect:home";
        }
        return "signIn";
    }

    @GetMapping("/signUp")
    public Model displaySignUpForm(Model model) {

        model.addAttribute("signUp", new User());
        return model;
    }

    @PostMapping("/signUp")
    public String postSignUpForm(@ModelAttribute User newUser) {


        if (userService.userSignUpValid(newUser)) {
            userService.createUser(newUser);
            return "redirect:home";
        }

        return "signUp";

    }

    @GetMapping("/search")
    public String getSearch(Model model) {
        List<Search> searches = searchService.findFlights();

        System.out.println("here");
        model.addAttribute("flight", searches);
        return "search";

    }

    @PostMapping("/search")
    public String postSearch(@ModelAttribute Search search) {
        return "search";
        // SearchService.findFlights(search);
    }

}
