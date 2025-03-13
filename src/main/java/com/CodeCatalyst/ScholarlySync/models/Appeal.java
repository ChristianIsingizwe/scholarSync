package com.CodeCatalyst.ScholarlySync.models;

import com.CodeCatalyst.ScholarlySync.enums.AppealStatus;
import com.CodeCatalyst.ScholarlySync.enums.AppealType;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appeals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appeal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appeal_sequence")
    @SequenceGenerator(name = "appeal_sequence", sequenceName = "appeal_sequence", allocationSize = 20)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "mark_id")
    private Mark mark;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private AppealType appealType;

    @Column(nullable = false)
    private AppealStatus status;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateSubmitted;
}

