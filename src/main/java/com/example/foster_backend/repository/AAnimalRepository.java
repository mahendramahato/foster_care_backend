package com.example.foster_backend.repository;

import com.example.foster_backend.model.AAnimal;
import com.example.foster_backend.model.AssignedAnimals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AAnimalRepository extends JpaRepository<AAnimal, Long> {

    //    query for getting assigned animals appointment scale by low
    @Query(
            value = "SELECT * from assigned_animal INNER JOIN assigned_animal_to_applicants on assigned_animal.aa_id = assigned_animal_to_applicants.fk_aa_id WHERE assigned_animal_to_applicants.appointment_scale = 'Low'",
            nativeQuery = true
    )
    public List<AAnimal> getByAppointmentLow();

    //    query for getting assigned animals appointment scale by medium
    @Query(
            value = "SELECT * from assigned_animal INNER JOIN assigned_animal_to_applicants on assigned_animal.aa_id = assigned_animal_to_applicants.fk_aa_id WHERE assigned_animal_to_applicants.appointment_scale = 'Medium'",
            nativeQuery = true
    )
    public List<AAnimal> getByAppointmentMedium();

    //    query for getting assigned animals appointment scale by high
    @Query(
            value = "SELECT * from assigned_animal INNER JOIN assigned_animal_to_applicants on assigned_animal.aa_id = assigned_animal_to_applicants.fk_aa_id WHERE assigned_animal_to_applicants.appointment_scale = 'High'",
            nativeQuery = true
    )
    public List<AAnimal> getByAppointmentHigh();
}
