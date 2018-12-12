package com.aqitrade.sunglow.core.mapper;


import java.util.List;

import com.aqitrade.sunglow.core.model.Holiday;
import org.apache.ibatis.annotations.Select;

public interface HolidayMapper extends BaseMapper<Holiday> {

    @Select("select * from holiday")
    List<Holiday> allHolidays();

    Holiday getById(Integer id);

}
