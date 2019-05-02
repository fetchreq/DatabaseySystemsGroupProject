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

    private int userNum = 0;
    private User user;
    private int employeeNum = 0;
    private Employee employee;
    @Autowired
    private UserService userService;
    @Autowired
    private SearchService searchService;
    @Autowired
    private EmployeeService employeeService;

   @RequestMapping({"/", "/home"})
   public String display(Model model) {
       System.out.println("ENum " + employeeNum);
       System.out.println("UNum " + userNum);
       if (userNum != 0) {

           user = userService.getUser(userNum);
           model.addAttribute("user", user);
           return "home";
       } else if (employeeNum != 0) {

           employee = employeeService.getEmployee(employeeNum);
           model.addAttribute("user", employee);
           return "adminHome";
       }
       model.addAttribute("user", new User());
       return "home";
   }

    @GetMapping("/signIn")
    public String displaySignIn(Model model) {
        // model.addAttribute("signIn", new User());
        return "signIn";
    }
    @PostMapping("/signIn")
    public String postSingIn(@ModelAttribute User signIn) {

        if (!userService.userSignInValid(signIn).isEmpty()) {

            userNum = (Integer) userService.userSignInValid(signIn).get(0);
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
        model.addAttribute("user", user);
        return "search";

    }

    @PostMapping("/search")
    public String postSearch(@ModelAttribute Search search) {
        return "search";
        // SearchService.findFlights(search);
    }

    @GetMapping("/logout")
    public String getLogout() {
        user = null;
        userNum = 0;
        employee = null;
        employeeNum = 0;
        return "redirect:home";
    }

    @GetMapping("/employeeSignIn")
    public String getEmployee() {

        return "employeeSignIn";

    }

    @PostMapping("/employeeSignIn")
    public String postPostEmployee(@ModelAttribute Employee employee) {
        if (!employeeService.employeeSignInValid(employee).isEmpty()) {
            employeeNum = (Integer) employeeService.employeeSignInValid(employee).get(0);
            return "redirect:home";
        }
        return "employeeSignIn";

    }

}
