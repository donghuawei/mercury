package com.aqitrade.sunglow.service;

import com.aqitrade.sunglow.model.Holiday;

import java.util.List;

public interface HolidayService extends BaseService<Holiday> {

    List<Holiday> getAllHolidays();

    Holiday getById(Integer id);

}
