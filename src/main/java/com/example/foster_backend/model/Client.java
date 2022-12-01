package com.example.foster_backend.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "applicants")
@Table(name = "applicants")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long formId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String email;

    @Column(name = "cell_phone")
    private String cellPhone;

    @Column(name = "number_of_children")
    private int childrenNumber;

    @Column(name = "age_of_children")
    private int childrenAge;

    @Column(name = "existing_pet_info")
    private String existingPetInfo;

    @Column(name = "pet_altered")
    private String alter;

    @Column(name = "foster_program")
    private String program;

    @Column(name = "foster_area")
    private String area;

    @Column(name = "foster_experience")
    private String experience;

    @Column(name = "about_applicant")
    private String aboutyou;

    @ElementCollection
    @CollectionTable(name = "animal_type",
        joinColumns = @JoinColumn(name="animal_typeId"))
    @Column(name = "animals_kinds")
    private List<String> animal_interest = new ArrayList<>();

}
