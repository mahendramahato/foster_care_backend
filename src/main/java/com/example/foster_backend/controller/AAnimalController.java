package com.example.foster_backend.controller;

import com.example.foster_backend.exception.ResourceNotFoundException;
import com.example.foster_backend.model.AAnimal;
import com.example.foster_backend.model.AssignedAnimals;
import com.example.foster_backend.repository.AAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clients/assign/")
public class AAnimalController {

    @Autowired
    private AAnimalRepository aAnimalRepository;

    @GetMapping
    public List<AAnimal> getAllAssignedAnimals(){
        return aAnimalRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<AAnimal> getAssignedClientById(@PathVariable long id){
        AAnimal aAnimal = aAnimalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assigned Client does not exist with this id:"+ id));
        return ResponseEntity.ok(aAnimal);
    }

    @PostMapping
    public AAnimal createAssignClient(@RequestBody AAnimal aAnimal){
        return aAnimalRepository.save(aAnimal);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteAssignClient(@PathVariable long id){
        AAnimal aAnimal = aAnimalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assigned Client does not exist with this id:"+ id));

        aAnimalRepository.delete(aAnimal);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<AAnimal> updateAssignedClient(@PathVariable long id, @RequestBody AAnimal aAnimalDetails){
        AAnimal updateAssignedClient = aAnimalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assigned Client doesn't exist with this id:"+ id));
        updateAssignedClient.setAfirstName(aAnimalDetails.getAfirstName());
        updateAssignedClient.setAlastName(aAnimalDetails.getAlastName());
        updateAssignedClient.setAemail(aAnimalDetails.getAemail());
        updateAssignedClient.setAcellPhone(aAnimalDetails.getAcellPhone());
        updateAssignedClient.setAanimals(aAnimalDetails.getAanimals());

        aAnimalRepository.save(updateAssignedClient);
        return ResponseEntity.ok(updateAssignedClient);

    }

    @GetMapping("low/")
    public List<AAnimal> getAllAAnimalsByLow(){
        return aAnimalRepository.getByAppointmentLow();
    }

    // get by medium appointment scale
    @GetMapping("medium/")
    public List<AAnimal> getAllAAnimalsByMedium(){
        return aAnimalRepository.getByAppointmentMedium();
    }

    // get by high appointment scale
    @GetMapping("high/")
    public List<AAnimal> getAllAAnimalsByHigh(){
        return aAnimalRepository.getByAppointmentHigh();
    }

}
