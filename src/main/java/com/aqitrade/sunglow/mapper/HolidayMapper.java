package com.aqitrade.sunglow.mapper;


import java.util.List;

import com.aqitrade.sunglow.model.Holiday;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface HolidayMapper extends BaseMapper<Holiday> {

    @Select("select * from holiday")
    List<Holiday> allHolidays();

    Holiday get(Integer id);

}
