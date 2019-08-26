package com.example.demo.controller;

import com.example.demo.dao.OrgDao;
import com.example.demo.entity.Org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
class OrgController {
    @Autowired
    private OrgDao orgDao;
    @RequestMapping("/hello")
    public Org testOrg(){
        return orgDao.queryOrgById(2);
//        Org myOrg = new Org();
//        myOrg.setId(1);
//        myOrg.setName("上海");
//        myOrg.setCode("025");
//        myOrg.setCreated(new Date());
//        myOrg.setLastUpd(new Date());
//        return OrgDao;
    }
}