package com.aqitrade.sunglow.core.service.impl;

import com.aqitrade.sunglow.core.service.HolidayService;
import com.aqitrade.sunglow.core.mapper.HolidayMapper;
import com.aqitrade.sunglow.core.model.Holiday;
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
