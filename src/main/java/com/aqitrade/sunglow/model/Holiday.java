package com.aqitrade.sunglow.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("holiday")
public class Holiday {

    @TableId(value = "holiday_id", type = IdType.AUTO)
    private Integer holidayId;
    private String countryCode;
    private String holidayName;

    private LocalDate startDate;
    private LocalDate endDate;
    private String remark;
}
