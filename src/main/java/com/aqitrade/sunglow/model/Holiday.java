package com.aqitrade.sunglow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Holiday {

    private Integer holidayId;
    private String countryCode;
    private String holidayName;

    private LocalDate startDate;
    private LocalDate endDate;
    private String remark;
}
