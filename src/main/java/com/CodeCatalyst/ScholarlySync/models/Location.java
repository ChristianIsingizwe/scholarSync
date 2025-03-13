package com.CodeCatalyst.ScholarlySync.models;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {
    @NotNull
    private String province;
    @NotNull
    private String district;
    @NotNull
    private String sectors;
    @NotNull
    private String cells;
    @NotNull
    private String village;
}
