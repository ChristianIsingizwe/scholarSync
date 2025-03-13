package com.CodeCatalyst.ScholarlySync.models;

import com.CodeCatalyst.ScholarlySync.enums.MarkType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "marks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marks_sequence")
    @SequenceGenerator(name = "marks_sequence", sequenceName = "marks_sequence", allocationSize = 30)
    private Long markId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(nullable = false)
    private BigDecimal markValue;

    private String examType;

    @Column(nullable = false)
    private MarkType markCategory;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateAwarded;
}
