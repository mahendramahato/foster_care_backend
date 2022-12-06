package com.example.foster_backend.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "assigned_animal_to_applicants")
@Table(name = "assigned_animal_to_applicants")
public class AssignedAnimals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long assignedAId;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "animal_type")
    private String animalType;

    @Column(name = "assigned_status")
    private String assign_status;

    @Column(name = "appointment_info", length = 1000)
    private String appointment_information;

    @Column(name = "appointment_scale")
    private String appointment_scale;

}
