package com.aqitrade.sunglow.controller;

import com.alibaba.fastjson.JSONObject;
import com.aqitrade.sunglow.model.Holiday;
import com.aqitrade.sunglow.service.HolidayService;
import io.swagger.annotations.ApiOperation;
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
        return holidayService.list();
    }


    @ApiOperation(
            nickname = "Get Holiday",
            value = "get holiday",
            notes = "get holiday",
            httpMethod = "GET")
    @GetMapping("/{id}")
    public Holiday get(@PathVariable("id") Integer id){
        return holidayService.getById(id);
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
    @RequestMapping(value = "/add2", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addNew2(@RequestBody JSONObject jsonParam){

        // 直接将json信息打印出来
        System.out.println(jsonParam.toJSONString());


        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", jsonParam);
        result.put("holidays", holidayService.getAllHolidays());

        return result.toJSONString();

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

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", jsonParam);
        result.put("holidays", holidayService.getAllHolidays());

        return result.toJSONString();

    }

}
