package com.databasesystems.database_systems_group_project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WebController {


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
    public String displaySignUpForm(Model model){
        model.addAttribute("signUp", new NewSignUp());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String postSignUpForm(@ModelAttribute NewSignUp newSignUp){
            if(newSignUp.findUserNum()){
                return "signUp";
            }
           return "redirect:/home";


    }

    @RequestMapping("/search")
    public String displaySearch(){
        return "search";
    }

}
