package com.databasesystems.database_systems_group_project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT passengerID FROM User WHERE username = :username")
    List findUser(@Param("username") String username);


}
