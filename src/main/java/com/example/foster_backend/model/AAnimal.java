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
@Entity(name = "assigned_animal")
@Table(name = "assigned_animal")
public class AAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aaId;

    @Column(name = "firstName")
    private String afirstName;

    @Column(name = "lastName")
    private String alastName;

    @Column(name = "email")
    private String aemail;

    @Column(name = "cellPhone")
    private String acellPhone;

    @Column(name = "numberOfChildren")
    private int achildrenNumber;

    @Column(name = "ageOfChildren")
    private int achildrenAge;

    @Column(name = "existingPetInfo", length = 10000)
    private String aexistingPetInfo;

    @Column(name = "petAltered")
    private String aalter;

    @Column(name = "fosterProgram")
    private String aprogram;

    @Column(name = "fosterArea", length = 10000)
    private String aarea;

    @Column(name = "fosterExperience", length = 10000)
    private String aexperience;

    @Column(name = "aboutApplicant", length = 10000)
    private String aaboutyou;

    @ElementCollection
    @CollectionTable(name = "assign_animal_type",
            joinColumns = @JoinColumn(name="aanimal_typeId"))
    @Column(name = "assign_animals_kinds")
    private List<String> aanimal_interest = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_aaId", referencedColumnName = "aaId")
    private List<AssignedAnimals> aanimals = new ArrayList<>();

}
