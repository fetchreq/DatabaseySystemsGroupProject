package com.databasesystems.database_systems_group_project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<NewSignUp, Integer> {

    @Query(value = "SELECT passengerID FROM NewSignUp WHERE username = :username")
    List<NewSignUp> findUser(@Param("username") String username);


}
