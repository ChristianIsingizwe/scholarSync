package com.CodeCatalyst.ScholarlySync.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Class {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "schoolClass")
    private Set<User> students;
}
