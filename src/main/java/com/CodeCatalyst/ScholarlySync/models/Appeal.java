package com.CodeCatalyst.ScholarlySync.models;

import com.CodeCatalyst.ScholarlySync.enums.AppealStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.error.Mark;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appeal {

    @Id
    private Long id;

    private User student;
    private Marks mark;
    private String description;
    private AppealStatus status;

}
