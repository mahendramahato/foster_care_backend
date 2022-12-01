package com.example.foster_backend.repository;

import com.example.foster_backend.model.AssignedAnimals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignedAnimalsRepository extends JpaRepository<AssignedAnimals, Long> {
    @Query("SELECT c from assigned_animal_to_applicants c WHERE c.appointment_scale = 'Low' ")
    public List<AssignedAnimals> getByAppointmentLow();

    @Query("SELECT c from assigned_animal_to_applicants c WHERE c.appointment_scale = 'Medium' ")
    public List<AssignedAnimals> getByAppointmentMedium();

    @Query("SELECT c from assigned_animal_to_applicants c WHERE c.appointment_scale = 'High' ")
    public List<AssignedAnimals> getByAppointmentHigh();

//    @Query(
//            value = "SELECT count(appointment_scale) from assigned_animal_to_applicants ",
//            nativeQuery = true
//    )
//    public List<Integer> getLCount();

}
