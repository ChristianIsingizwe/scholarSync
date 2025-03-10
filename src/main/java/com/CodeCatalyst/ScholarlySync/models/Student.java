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
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", allocationSize = 30)
    private Long id;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private Gender gender;

    @Column(unique = true)
    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @Column(unique = true)
    private int phoneNumber;

    @NotNull
    private String guardianName;

    @Column(unique = true)
    @NotNull
    private int guardianPhoneNumber;
}
