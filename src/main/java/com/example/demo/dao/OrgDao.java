package com.example.demo.dao;

import com.example.demo.entity.Org;

import java.util.List;

public interface OrgDao {
    List<Org> queryOrg();
    Org queryOrgById(int Id);
    int insertOrg(Org org);
    int updateOrg(Org org);
    int deleteOrg(int Id);
}
