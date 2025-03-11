package com.CodeCatalyst.ScholarlySync.models;

import com.CodeCatalyst.ScholarlySync.enums.ExamType;
import com.CodeCatalyst.ScholarlySync.enums.MarkType;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marks {
    @Id

    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @Enumerated(EnumType.STRING)
    private MarkType markType;

    @ManyToOne
    @JoinColumn(name = "assessor_id")
    private User assessor;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = true)
    private Course course;

    private double value;

    @Enumerated(EnumType.STRING)
    private ExamType examType;

    @Nullable
    private String reason;

    private String term;

    private LocalDate dateAssigned;

    @OneToMany(mappedBy = "mark")
    private Set<Appeal> appeals;

}
