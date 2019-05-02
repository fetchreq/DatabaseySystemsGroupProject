package com.databasesystems.database_systems_group_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void createUser(User sign) {

        User user = new User(sign.getUsername(), sign.getPassword(),
                sign.getFirstName(), sign.getLastName());
        userRepo.save(user);
    }

    public List userSignInValid(User sign) { //user name is in database
        User user = new User(sign.getUsername(), sign.getPassword(),
                sign.getFirstName(), sign.getLastName());
        return userRepo.findUser(user.getUsername());
    }

    public boolean userSignUpValid(User sign) { //user name is in database
        User user = new User(sign.getUsername(), sign.getPassword(),
                sign.getFirstName(), sign.getLastName());


        if (userRepo.findUser(user.getUsername()).isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public User getUser(int userNum) {
        return userRepo.getOne(userNum);
    }


}
