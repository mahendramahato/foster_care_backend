package com.example.foster_backend.model;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalId;

    @Column(name = "Pet_Name")
    private String petName;

    @Column(name = "Pet_Type")
    private String type;

    @Column(name = "Foster_Program")
    private String program;

    @Column(name = "Foster_status")
    private String status;

}
