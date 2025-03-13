package com.CodeCatalyst.ScholarlySync.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "parents")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parent_sequence")
    @SequenceGenerator(name = "parent_sequence", sequenceName = "parent_sequence", allocationSize = 30)
    private Long parentId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true)
    @Email
    private String email;

    private String phoneNumber;

    @Column(nullable = false)
    private Location location;

    @ManyToMany(mappedBy = "parents")
    private List<Student> students;
}