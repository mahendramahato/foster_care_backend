package com.example.foster_backend.repository;

import com.example.foster_backend.model.AssignedAnimals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignedAnimalsRepository extends JpaRepository<AssignedAnimals, Long> {

    @Query(
            value = "SELECT count(appointment_scale) from assigned_animal_to_applicants WHERE appointment_scale = 'Low' ",
            nativeQuery = true
    )
    public int getLCount();

}
