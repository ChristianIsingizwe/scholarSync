package com.CodeCatalyst.ScholarlySync.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {
    private String province;
    private String district;
    private String sectors;
    private String cells;
    private String village;
}
