package com.databasesystems.database_systems_group_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void createUser(NewSignUp sign) {

        NewSignUp user = new NewSignUp(sign.getUsername(), sign.getPassword(), sign.getEmail(), sign.getDOB(),
                sign.getFirstName(), sign.getLastName());
        userRepo.save(user);
    }

    public boolean userValid() {
        return true;
    }
}
