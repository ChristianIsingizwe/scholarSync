package com.CodeCatalyst.ScholarlySync.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teachers_seq")
    @SequenceGenerator(name = "teachers_seq", sequenceName = "teachers_seq", allocationSize = 10)
    public Long id;

}
