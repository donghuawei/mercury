package com.aqitrade.sunglow.controller;

import com.aqitrade.sunglow.model.Holiday;
import com.aqitrade.sunglow.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("holidays")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Holiday> allHolidays(){
        return holidayService.getAllHolidays();
    }


    @GetMapping("/{id}")
    public Holiday get(@PathVariable("id") Integer id){
        return holidayService.get(id);
    }


    @PostMapping(path = "")
    public Holiday add(@RequestBody Holiday holiday){
        System.out.println(holiday);
        return holiday;
    }

    @PostMapping(path = "add")
    public void addNew(
            @RequestParam(name = "holidayID") Integer holidayID,
            @RequestParam(name = "countryCode") String countryCode,
            @RequestParam("holidayName") String holidayName){
        System.out.println(holidayID + ", " + countryCode + ", " + holidayName);
    }


    @ResponseBody
    @RequestMapping(value = "/add3", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addNew3(@RequestBody Map jsonParam){

        // 直接将json信息打印出来
//        jsonParam.forEach((k, v) -> {
//            System.out.print( k + ":" + v + "; ");
//
//        });
        System.out.println();

        jsonParam.keySet().stream().forEach(System.out::println);
        jsonParam.values().forEach(v -> System.out.println(v));


        return null;

    }

}
