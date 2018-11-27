package com.aqitrade.sunglow.service.impl;

import com.aqitrade.sunglow.mapper.HolidayMapper;
import com.aqitrade.sunglow.model.Holiday;
import com.aqitrade.sunglow.service.HolidayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayServiceImpl extends BaseServiceImpl<HolidayMapper, Holiday> implements HolidayService {

    public List<Holiday> getAllHolidays(){
        return mapper.allHolidays();
    }

    public Holiday getById(Integer id) {
        return mapper.getById(id);
    }
}
