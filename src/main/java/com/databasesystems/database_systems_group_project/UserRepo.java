package com.databasesystems.database_systems_group_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<NewSignUp, Integer> {
    @Query("SELECT userNum WHERE username = :username")
    String findUserName(@Param("username") String username);
}
