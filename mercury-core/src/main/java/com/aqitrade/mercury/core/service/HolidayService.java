package com.aqitrade.mercury.core.service;

import com.aqitrade.mercury.core.model.Holiday;

import java.util.List;

public interface HolidayService extends BaseService<Holiday> {

    List<Holiday> getAllHolidays();

    Holiday getById(Integer id);

}
