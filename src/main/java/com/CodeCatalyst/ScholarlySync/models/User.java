package com.CodeCatalyst.ScholarlySync.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@MappedSuperclass
public class User {
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
}
