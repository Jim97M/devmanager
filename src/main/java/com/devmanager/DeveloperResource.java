package com.devmanager;

import com.devmanager.models.Developer;
import com.devmanager.service.DeveloperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developer")
public class DeveloperResource {
  private final DeveloperService developerService;

  public DeveloperResource(DeveloperService developerService) {
    this.developerService = developerService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Developer>> getAllDevelopers(){
     List<Developer> developers = developerService.returnAllDevelopers();
     return new ResponseEntity<>(developers, HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<Developer> getDeveloperId(@PathVariable("id") Long id) throws Throwable {
    Developer developer = developerService.findDeveloperById(id);
    return new ResponseEntity<>(developer, HttpStatus.OK);
  }
  @PostMapping("/add")
  public ResponseEntity<Developer> addDeveloper(@RequestBody Developer developer){
    Developer newDev = developerService.addDeveloper(developer);
    return new ResponseEntity<>(newDev, HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Developer> updateDeveloper(@RequestBody Developer developer){
    Developer updatedDev = developerService.updateDeveloper(developer);
    return new ResponseEntity<>(updatedDev, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteDeveloper(@PathVariable("id") Long id){
    developerService.deleteDeveloper(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
