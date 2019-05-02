package com.databasesystems.database_systems_group_project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT employeeID FROM Employee WHERE username = :username")
    List findEmployee(@Param("username") String username);


}
