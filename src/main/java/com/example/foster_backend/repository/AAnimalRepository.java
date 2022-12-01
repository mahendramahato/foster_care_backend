package com.example.foster_backend.repository;

import com.example.foster_backend.model.AAnimal;
import com.example.foster_backend.model.AssignedAnimals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AAnimalRepository extends JpaRepository<AAnimal, Long> {

//    @Query(
//            value = "SELECT * from assigned_animal, assigned_animal_to_applicants where aa_Id = fk_aa_Id and appointment_scale = 'Low'",
//            nativeQuery = true
//    )
//    public List<AAnimal> getByAppointmentLow();

}
