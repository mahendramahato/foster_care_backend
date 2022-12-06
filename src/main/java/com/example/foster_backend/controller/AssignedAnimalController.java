package com.example.foster_backend.controller;

import com.example.foster_backend.model.AssignedAnimals;
import com.example.foster_backend.repository.AssignedAnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clients/alists")
public class AssignedAnimalController {

    @Autowired
    private AssignedAnimalsRepository assignedAnimalsRepository;

    // get all clients list REST API
    @GetMapping
    public List<AssignedAnimals> getAllAAnimals() {
        return assignedAnimalsRepository.findAll();
    }


}
