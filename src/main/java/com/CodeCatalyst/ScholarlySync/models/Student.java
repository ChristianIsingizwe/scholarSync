package com.CodeCatalyst.ScholarlySync.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 20)
    private Long id;

    @Column(unique = true)
    private int phoneNumber;

    @NotNull
    private String guardianName;

    @Column(unique = true)
    @NotNull
    private int guardianPhoneNumber;

}
