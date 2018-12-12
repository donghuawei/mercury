package com.aqitrade.sunglow.core.service;

import com.aqitrade.sunglow.core.model.Holiday;

import java.util.List;

public interface HolidayService extends BaseService<Holiday> {

    List<Holiday> getAllHolidays();

    Holiday getById(Integer id);

}
