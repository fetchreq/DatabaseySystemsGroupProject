package com.databasesystems.database_systems_group_project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class webController {
   @RequestMapping("/")
    public String display(){
       return "home.html";
   }
    @RequestMapping("/home")
    public String displayHome(){
        return "home.html";
    }
    @RequestMapping("/signIn")
    public String displaySignIn(){
        return "signIn.html";
    }
    @RequestMapping("/signUp")
    public String displaySignUp(){
        return "signUp.html";
    }

}
