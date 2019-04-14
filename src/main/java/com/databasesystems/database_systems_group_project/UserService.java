package com.databasesystems.database_systems_group_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void createUser(User sign) {

        User user = new User(sign.getUsername(), sign.getPassword(), sign.getEmail(), sign.getDOB(),
                sign.getFirstName(), sign.getLastName());
        userRepo.save(user);
    }

    public boolean userSignInValid(User sign) { //user name is in database
        User user = new User(sign.getUsername(), sign.getPassword(), sign.getEmail(), sign.getDOB(),
                sign.getFirstName(), sign.getLastName());
        if (userRepo.findUser(user.getUsername()) != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean userSignUpValid(User sign) {  //UserName doesn't exist in database
        User user = new User(sign.getUsername(), sign.getPassword(), sign.getEmail(), sign.getDOB(),
                sign.getFirstName(), sign.getLastName());
        if (userRepo.findUser(user.getUsername()) == null) {
            return true;
        }
        return false;
    }
}
