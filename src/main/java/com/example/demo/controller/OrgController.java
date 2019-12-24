package com.example.demo.controller;

import com.example.demo.dao.OrgDao;
import com.example.demo.entity.Org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
class OrgController {
    @Autowired
    private OrgDao orgDao;
    @RequestMapping("/hello")
    public Org testOrg(int oid){
        Org myOrg = orgDao.queryOrgById(oid);
        return myOrg;
    }
}