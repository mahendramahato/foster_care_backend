package com.example.foster_backend.controller;

import com.example.foster_backend.exception.ResourceNotFoundException;
import com.example.foster_backend.model.Animal;
import com.example.foster_backend.model.Client;
import com.example.foster_backend.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    // get all animals list REST API
    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    // build create a new client REST API
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    // build get animal form by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable long id){
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal does not exist with this id:"+ id));
        return ResponseEntity.ok(animal);
    }

    // implement delete client form REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteForm(@PathVariable long id){

        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal form does not exist with this id:"+ id));

        animalRepository.delete(animal);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // implement update client form REST API
    @PutMapping("{id}")
    public ResponseEntity<Animal> updateForm(@PathVariable long id, @RequestBody Animal animalDetails){
        Animal updateForm = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal doesn't exist with this id:"+ id));
        updateForm.setPetName(animalDetails.getPetName());
        updateForm.setType(animalDetails.getType());
        updateForm.setStatus(animalDetails.getStatus());
        updateForm.setProgram(animalDetails.getProgram());

        animalRepository.save(updateForm);
        return ResponseEntity.ok(updateForm);

    }
}
