package com.devmanager.repo;

import com.devmanager.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloperRepo extends JpaRepository <Developer, Long> {

    void deleteDeveloperById(Long id);

    Optional<Developer> findDeveloperById(Long id);
}
