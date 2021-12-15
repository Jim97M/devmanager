package com.devmanager.service;

import com.devmanager.exceptions.UserNotFoundException;
import com.devmanager.models.Developer;
import com.devmanager.repo.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DeveloperService {
    private final DeveloperRepo developerRepo;

    @Autowired
    public DeveloperService(DeveloperRepo developerRepo) {
        this.developerRepo = developerRepo;
    }

    //Add Employee to the database
    public Developer addDeveloper(Developer developer){
        developer.setDevCode(UUID.randomUUID().toString());
        return developerRepo.save(developer);
    }

    //Returns a list of all Developers
    public List<Developer> returnAllDevelopers(){
        return developerRepo.findAll();
    }

    public Developer updateDeveloper(Developer developer){
        return developerRepo.save(developer);
    }

    public Developer findDeveloperById(Long id) throws Throwable {
        return developerRepo.findDeveloperById(id).orElseThrow(()-> new UserNotFoundException("User By Id" + id + "Was Not Found"));
    }

    public void deleteDeveloper(Long id){
        developerRepo.deleteDeveloperById(id);
    }
}
