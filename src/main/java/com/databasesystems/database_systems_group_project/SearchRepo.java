package com.databasesystems.database_systems_group_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SearchRepo extends JpaRepository<Search, Integer> {

    @Query(value = "SELECT takeOff,destination,takeOffDate, takeOffTime FROM Search")
    List<Search> findFlightToday();
}
