package com.databasesystems.database_systems_group_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public void createEmployee(Employee sign) {

        Employee user = new Employee(sign.getUsername(), sign.getPassword(),
                sign.getFirstName(), sign.getLastName(), sign.gethireDate(), sign.getSalary(), sign.getDepartmentID());
        employeeRepo.save(user);
    }


    public List employeeSignInValid(Employee sign) { //user name is in database
        Employee user = new Employee(sign.getUsername(), sign.getPassword(),
                sign.getFirstName(), sign.getLastName(), sign.gethireDate(), sign.getSalary(), sign.getDepartmentID());

        return employeeRepo.findEmployee(user.getUsername());

    }

    public Employee getEmployee(int employeeNum) {
        return employeeRepo.getOne(employeeNum);
    }


}