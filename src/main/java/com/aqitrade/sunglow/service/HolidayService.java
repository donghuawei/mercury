package com.aqitrade.sunglow.service;


import com.aqitrade.sunglow.mapper.HolidayMapper;
import com.aqitrade.sunglow.model.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayService {

    @Autowired
    private HolidayMapper holidayMapper;

    public List<Holiday> getAllHolidays(){
//        return holidayMapper.listUsingSqlProvider(Holiday.class);
//        return holidayMapper.selectList(null);
        return holidayMapper.allHolidays();
    }

    public Holiday get(Integer id) {
        return holidayMapper.get(id);
    }

}
