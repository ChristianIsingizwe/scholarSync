package com.CodeCatalyst.ScholarlySync.models;

import com.CodeCatalyst.ScholarlySync.enums.Gender;
import com.CodeCatalyst.ScholarlySync.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 30)
    private Long id;

    @Column
    @NotNull
    private String firstName;
    @Column
    @NotNull
    private String lastName;

    @Column(unique = true)
    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class schoolClass;

    @ManyToMany(mappedBy = "teachers")
    private Set<Course> courses;
}
