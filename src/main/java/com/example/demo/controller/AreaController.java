package com.example.demo.controller;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.entity.Org;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;
    @RequestMapping(value="/listarea",method= RequestMethod.GET)
    private Map<String,Object>  listArea(){
        Map<String,Object> modelapp = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modelapp.put("arealist",list);
        return modelapp;
    }

}
