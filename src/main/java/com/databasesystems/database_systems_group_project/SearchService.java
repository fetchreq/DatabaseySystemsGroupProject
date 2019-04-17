package com.databasesystems.database_systems_group_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.Date;


@Service
public class SearchService {
    @Autowired
    private SearchRepo searchRepo;

    public List<Search> findFlights() {
        System.out.println("there");
        return searchRepo.findAll();
    }


}
